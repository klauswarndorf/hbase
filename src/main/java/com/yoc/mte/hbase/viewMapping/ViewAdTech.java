package com.yoc.mte.hbase.viewMapping;

public interface ViewAdTech {

    public abstract String getSequenceId();

    public abstract void setSequenceId(String sequenceId);

    public abstract String getPlcNetworkId();

    public abstract void setPlcNetworkId(String plcNetworkId);

    public abstract String getPlcSubNetworkId();

    public abstract void setPlcSubNetworkId(String plcSubNetworkId);

    public abstract String getWebsiteId();

    public abstract void setWebsiteId(String websiteId);

    public abstract String getPlacementId();

    public abstract void setPlacementId(String placementId);

    public abstract String getCampaignId();

    public abstract void setCampaignId(String campaignId);

    public abstract String getExtensionType();

    public abstract void setExtensionType(String extensionType);

    public abstract String getKvString();

    public abstract void setKvString(String kvString);
}