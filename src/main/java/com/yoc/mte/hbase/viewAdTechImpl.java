/**
 *
 */
package com.yoc.mte.hbase;

import java.math.BigInteger;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;


/**
 * @author klaus
 *
 */
@CsvRecord( separator = ",", isOrdered = true )
public class viewAdTechImpl implements viewAdTech {

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

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getSequenceId()
     */
    @Override
    public String getSequenceId() {
        return sequenceId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setSequenceId(java.lang.String)
     */
    @Override
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getPlcNetworkId()
     */
    @Override
    public String getPlcNetworkId() {
        return plcNetworkId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setPlcNetworkId(java.lang.String)
     */
    @Override
    public void setPlcNetworkId(String plcNetworkId) {
        this.plcNetworkId = plcNetworkId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getPlcSubNetworkId()
     */
    @Override
    public String getPlcSubNetworkId() {
        return plcSubNetworkId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setPlcSubNetworkId(java.lang.String)
     */
    @Override
    public void setPlcSubNetworkId(String plcSubNetworkId) {
        this.plcSubNetworkId = plcSubNetworkId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getWebsiteId()
     */
    @Override
    public String getWebsiteId() {
        return websiteId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setWebsiteId(java.lang.String)
     */
    @Override
    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getPlacementId()
     */
    @Override
    public String getPlacementId() {
        return placementId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setPlacementId(java.lang.String)
     */
    @Override
    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getCampaignId()
     */
    @Override
    public String getCampaignId() {
        return campaignId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setCampaignId(java.lang.String)
     */
    @Override
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getExtensionType()
     */
    @Override
    public String getExtensionType() {
        return extensionType;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setExtensionType(java.lang.String)
     */
    @Override
    public void setExtensionType(String extensionType) {
        this.extensionType = extensionType;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#getKvString()
     */
    @Override
    public String getKvString() {
        return kvString;
    }

    /* (non-Javadoc)
     * @see com.yoc.mte.statistics.importcsv.viewAdTech#setKvString(java.lang.String)
     */
    @Override
    public void setKvString(String kvString) {
        this.kvString = kvString;
    }
}
