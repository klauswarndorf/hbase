/**
 *
 */
package com.yoc.mte.hbase.viewMapping;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.beans.DirectFieldAccessor;

/**
 * @author klaus
 *
 */
@CsvRecord(separator = ",")
public class ViewAdTechImpl implements Serializable, ViewAdTech, HbaseData {

    private static final long serialVersionUID = -9057141563434616631L;

    private String id;

    @DataField(pos = 1, position = 1)
    private String sequenceId;

    @DataField(pos = 2, position = 2)
    private String plcNetworkId;

    @DataField(pos = 3, position = 3)
    private String plcSubNetworkId;

    @DataField(pos = 4, position = 4)
    private String websiteId;

    @DataField(pos = 5, position = 5)
    private String placementId;

    @DataField(pos = 6, position = 6)
    private String campaignId;

    @DataField(pos = 7, position = 7)
    private String extensionType;

    @DataField(pos = 8, position = 8)
    private String kvString;

    private String kvYrid;

    private String kvAge;

    private String kvGender;

    private String kvLikes;

    /* (non-Javadoc)
     * @see com.yoc.mte.hbase.viewMapping.HbaseData#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.hbase.viewMapping.HbaseData#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getSequenceId()
     */
    @Override
    public String getSequenceId() {
        return sequenceId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setSequenceId(java.lang.String)
     */
    @Override
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getPlcNetworkId()
     */
    @Override
    public String getPlcNetworkId() {
        return plcNetworkId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setPlcNetworkId(java.lang.String)
     */
    @Override
    public void setPlcNetworkId(String plcNetworkId) {
        this.plcNetworkId = plcNetworkId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getPlcSubNetworkId()
     */
    @Override
    public String getPlcSubNetworkId() {
        return plcSubNetworkId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setPlcSubNetworkId(java.lang.String)
     */
    @Override
    public void setPlcSubNetworkId(String plcSubNetworkId) {
        this.plcSubNetworkId = plcSubNetworkId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getWebsiteId()
     */
    @Override
    public String getWebsiteId() {
        return websiteId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setWebsiteId(java.lang.String)
     */
    @Override
    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getPlacementId()
     */
    @Override
    public String getPlacementId() {
        return placementId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setPlacementId(java.lang.String)
     */
    @Override
    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getCampaignId()
     */
    @Override
    public String getCampaignId() {
        return campaignId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setCampaignId(java.lang.String)
     */
    @Override
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getExtensionType()
     */
    @Override
    public String getExtensionType() {
        return extensionType;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setExtensionType(java.lang.String)
     */
    @Override
    public void setExtensionType(String extensionType) {
        this.extensionType = extensionType;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getKvString()
     */
    @Override
    public String getKvString() {
        return kvString;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setKvString(java.lang.String)
     */
    @Override
    public void setKvString(String kvString) {
        this.kvString = kvString;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getKvRid()
     */
    @Override
    public String getKvYrid() {
        return kvYrid;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setKvRid(java.lang.String)
     */
    @Override
    public void setKvYrid(String kvYrid) {
        this.kvYrid = kvYrid;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getKvAge()
     */
    @Override
    public String getKvAge() {
        return kvAge;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setKvAge(java.lang.String)
     */
    @Override
    public void setKvAge(String kvAge) {
        this.kvAge = kvAge;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getKvGender()
     */
    @Override
    public String getKvGender() {
        return kvGender;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setKvGender(java.lang.String)
     */
    @Override
    public void setKvGender(String kvGender) {
        this.kvGender = kvGender;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#getKvLikes()
     */
    @Override
    public String getKvLikes() {
        return kvLikes;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.yoc.mte.hbase.ViewAdTech#setKvLikes(java.lang.String[])
     */
    @Override
    public void setKvLikes(String kvlikes) {
        this.kvLikes = kvlikes;
    }

    /*
     * splits the kv string into class fields
     *
     * @see com.yoc.mte.hbase.ViewAdTech#splitKVString()
     */
    /* (non-Javadoc)
     * @see com.yoc.mte.hbase.viewMapping.HbaseData#postProcess()
     */
    @Override
    public void process() {
        String[] arr = this.getKvString().split(";");
        for (String kv : arr) {
            String[] tmp = kv.split("=");

            String field = tmp[0];
            if(field.startsWith("kv")) {
                char camelCase = Character.toUpperCase(field.charAt(2));
                field = field.substring(0,2) + camelCase + field.substring(3);
            }

            DirectFieldAccessor myObjectAccessor = new DirectFieldAccessor(this);

            if (myObjectAccessor.isWritableProperty(field)) {
                myObjectAccessor.setPropertyValue(field, tmp[1]);
            }
        }
    }
}
