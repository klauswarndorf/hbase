package com.yoc.mte.hbase.viewMapping;

public interface HbaseData {

	public abstract String getId();

	public abstract void setId(String id);

	/*
	 * splits the kv string into class fields
	 *
	 * @see com.yoc.mte.hbase.ViewAdTech#splitKVString()
	 */
	public abstract void process();

}