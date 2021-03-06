/**
 *
 */
package com.yoc.mte.hbase;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.Link;


/**
 * @author klaus
 *
 */
@CsvRecord( separator = "," )
public class viewAdTechImpl implements Serializable {

    private static final long serialVersionUID = -9057141563434616631L;

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

    @Link
    private KVString kvString;

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getPlcNetworkId() {
        return plcNetworkId;
    }

    public void setPlcNetworkId(String plcNetworkId) {
        this.plcNetworkId = plcNetworkId;
    }

    public String getPlcSubNetworkId() {
        return plcSubNetworkId;
    }

    public void setPlcSubNetworkId(String plcSubNetworkId) {
        this.plcSubNetworkId = plcSubNetworkId;
    }

    public String getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    public String getPlacementId() {
        return placementId;
    }

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getExtensionType() {
        return extensionType;
    }

    public void setExtensionType(String extensionType) {
        this.extensionType = extensionType;
    }

    public KVString getKvString() {
        return kvString;
    }

    public void setKvString(KVString kvString) {
        this.kvString = kvString;
    }

    public void splitKVString() {
        this.getKvString().split();
    }

    public String toString() {
        return "SequenceId: "+ sequenceId + "| kvriid: " + this.getKvString().getKvyrid();
    }
}
