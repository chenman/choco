package org.choco.bean;

import java.io.Serializable;
import java.util.List;

public class QueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7634168931470635955L;
	
	private int pageNo;
	
	private int pageSize;
	
	private long count;
	
	private List list;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long l) {
		this.count = l;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public QueryResult() {
		super();
	}
	
	
}
