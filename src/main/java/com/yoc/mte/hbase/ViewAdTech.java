package com.yoc.mte.hbase;

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

	public abstract String getKvRid();

	public abstract void setKvRid(String kvRid);

	public abstract String getKvAge();

	public abstract void setKvAge(String kvAge);

	public abstract String getKvGender();

	public abstract void setKvGender(String kvGender);

	public abstract String[] getKvLikes();

	/**
	 * @param kvlikes the kvlikes to set
	 */
	public abstract void setKvLikes(String[] kvlikes);

	/**
	 * @param kvlikes the kvlikes to set
	 */
	public abstract void setKvlikes(String kvlikes);

	public abstract void splitKVString();

}