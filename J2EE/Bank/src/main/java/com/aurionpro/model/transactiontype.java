package com.aurionpro.model;

public class transactiontype {

	private int tid;
	private String ttype;
	
	public transactiontype(int tid, String ttype) {
		super();
		this.tid = tid;
		this.ttype = ttype;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	@Override
	public String toString() {
		return "transactiontype [tid=" + tid + ", ttype=" + ttype + "]";
	}
	
}
