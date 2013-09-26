/**
 *
 */
package com.yoc.mte.hbase.processors;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.DirectFieldAccessor;

import com.yoc.mte.hbase.viewMapping.HbaseData;
import com.yoc.mte.hbase.viewMapping.ViewAdTechImpl;

/**
 * @author klaus
 *
 * processor to write data with camel-hbase
 */
public class ViewHeaderDataWriteImpl implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        @SuppressWarnings("unchecked")
        ArrayList<HashMap<String, ViewAdTechImpl>> viewdata = (ArrayList<HashMap<String, ViewAdTechImpl>>) exchange.getIn().getBody();

        // bindy wraps object in map and List
        for(HashMap<String, ViewAdTechImpl> viewdatamap: viewdata) {
            for(String key: viewdatamap.keySet()){
                ViewAdTechImpl viewAdTechImpl = viewdatamap.get(key);
                viewAdTechImpl.process();
                viewAdTechImpl.setId(viewAdTechImpl.getSequenceId() + "_" + viewAdTechImpl.getPlcNetworkId() + "_" + viewAdTechImpl.getKvYrid());
                // set header for camel-hbase
                this.setHeaderData(exchange, viewAdTechImpl, "cf");
            }
        }
    }


    private void setHeaderData(Exchange exchange, HbaseData data, String columnFamily) {

        // counter for header postfix
        int i = 0;
        for (Field field : ViewAdTechImpl.class.getDeclaredFields()) {
            if (!Arrays.asList(new String[] { "serialVersionUID", "id" }).contains(field.getName())) {

                DirectFieldAccessor myObjectAccessor = new DirectFieldAccessor(data);

                // sets a postfix as camel-hbase expects for header data
                String pf = "";
                if (i != 0) {
                    pf = String.valueOf(i);
                }
                // sets header data for camel-hbase
                exchange.getIn().setHeader("CamelHBaseRowId" + pf, data.getId());
                exchange.getIn().setHeader("CamelHBaseFamily" + pf, columnFamily);
                exchange.getIn().setHeader("CamelHBaseQualifier" + pf, field.getName());
                exchange.getIn().setHeader("CamelHBaseValue" + pf, (String) myObjectAccessor.getPropertyValue(field.getName()));
                // increment counter
                i++;
            }
        }
    }
}
