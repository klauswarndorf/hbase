/**
 *
 */
package com.yoc.hbase.helper;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.apache.camel.Exchange;
import org.springframework.beans.DirectFieldAccessor;

import com.yoc.mte.hbase.viewMapping.HbaseData;
import com.yoc.mte.hbase.viewMapping.ViewAdTechImpl;

/**
 * @author klaus
 *
 * sets header data for camel-hbase
 * tries to set every field of given data Pojo as field in hbase
 * id of object has to be unique will be set as row id in hbase
 */
public abstract class CamelHbaseSetHeader {

    protected void setHeaderData(Exchange exchange, HbaseData data, String columnFamily) {
        this.setHeaderData(exchange, data, columnFamily, new String[] { "serialVersionUID", "id" });
    }

    protected void setHeaderData(Exchange exchange, HbaseData data, String columnFamily, String[] blacklist) {

        // counter for header postfix
        int i = 0;
        for (Field field : ViewAdTechImpl.class.getDeclaredFields()) {
            if (!Arrays.asList(blacklist).contains(field.getName())) {

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
