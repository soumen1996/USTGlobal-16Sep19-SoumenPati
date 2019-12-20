package com.ustglobal.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "transaction")
public class TransactionBean {
	@Id
	@Column
	@GeneratedValue
	private int tid;
	@Column
	private int sid;
	@Column
	private int bid;
	@Column
	private int status;
	@Column
	private String issueTime;
	@Column
	private String returnTime;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getIssueTime() {
		return issueTime;
	}
	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	
	
	
	
	
	
	
	
}
