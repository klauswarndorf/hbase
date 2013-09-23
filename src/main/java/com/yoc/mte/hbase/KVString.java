/**
 *
 */
package com.yoc.mte.hbase;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.Link;
import org.springframework.beans.DirectFieldAccessor;

/**
 * @author klaus
 *
 */
@Link
public class KVString {

    @DataField(pos = 8, position = 8)
    private String KVString;

    private String kvyrid;

    private String kvage;

    private String kvgender;

    private String[] kvlikes;

    /**
     * @return the kVString
     */
    public String getKVString() {
        return KVString;
    }

    /**
     * @param kVString
     *            the kVString to set
     */
    public void setKVString(String KVString) {
        this.KVString = KVString;
    }

    /**
     * @return the kvyrid
     */
    public String getKvyrid() {
        return kvyrid;
    }

    /**
     * @param kvyrid
     *            the kvyrid to set
     */
    public void setKvyrid(String kvyrid) {
        this.kvyrid = kvyrid;
    }

    /**
     * @return the kvage
     */
    public String getKvage() {
        return kvage;
    }

    /**
     * @param kvage
     *            the kvage to set
     */
    public void setKvage(String kvage) {
        this.kvage = kvage;
    }

    /**
     * @return the kvgender
     */
    public String getKvgender() {
        return kvgender;
    }

    /**
     * @param kvgender
     *            the kvgender to set
     */
    public void setKvgender(String kvgender) {
        this.kvgender = kvgender;
    }

    /**
     * @return the kvlikes
     */
    public String[] getKvlikes() {
        return kvlikes;
    }

    /**
     * @param kvlikes the kvlikes to set
     */
    public void setKvlikes(String[] kvlikes) {
        this.kvlikes = kvlikes;
    }

    /**
     * @param kvlikes the kvlikes to set
     */
    public void setKvlikes(String kvlikes) {
        this.kvlikes = kvlikes.split(":");
    }

    public void split() {
        String[] arr = this.getKVString().split(";");
        for (String kv : arr) {
            String[] tmp = kv.split("=");

            DirectFieldAccessor myObjectAccessor = new DirectFieldAccessor(this);
            if(myObjectAccessor.isWritableProperty(tmp[0])) {
                myObjectAccessor.setPropertyValue(tmp[0],tmp[1]);
            }
        }
    }
}
