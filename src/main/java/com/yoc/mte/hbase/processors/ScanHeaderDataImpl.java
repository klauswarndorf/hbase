/**
 *
 */
package com.yoc.mte.hbase.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.yoc.mte.hbase.helper.CamelHbaseSetHeader;

/**
 * @author klaus
 *
 */
public class ScanHeaderDataImpl extends CamelHbaseSetHeader implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        // TODO Auto-generated method stub

    }

}
