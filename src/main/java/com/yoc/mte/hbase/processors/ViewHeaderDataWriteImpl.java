/**
 *
 */
package com.yoc.mte.hbase.processors;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.yoc.mte.hbase.helper.CamelHbaseSetHeader;
import com.yoc.mte.hbase.viewMapping.ViewAdTechImpl;

/**
 * @author klaus
 *
 * processor to write data with camel-hbase
 */
public class ViewHeaderDataWriteImpl extends CamelHbaseSetHeader implements Processor {

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
}
