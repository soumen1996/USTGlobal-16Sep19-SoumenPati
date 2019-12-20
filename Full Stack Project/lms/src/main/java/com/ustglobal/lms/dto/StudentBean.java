package com.ustglobal.lms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentBean {
	@Id
	@Column
	@GeneratedValue
	private int sid;
	@Column
	private String sname;
	@Column
	private String spassword;
	@Column
	private String sgender;
	@Column(unique = true)
	private String semail;
	@Column(unique = true)
	private int sregisterNo;
	@Column
	private String sbranch;
	@Column
	private int lid;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_book", joinColumns = @JoinColumn(name="sid"), inverseJoinColumns = @JoinColumn(name="bid"))
	private List<BookBean> bookBeans;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public int getSregisterNo() {
		return sregisterNo;
	}

	public void setSregisterNo(int sregisterNo) {
		this.sregisterNo = sregisterNo;
	}

	public String getSbranch() {
		return sbranch;
	}

	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public List<BookBean> getBookBeans() {
		return bookBeans;
	}

	public void setBookBeans(List<BookBean> bookBeans) {
		this.bookBeans = bookBeans;
	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "lid", nullable = false)
//	private LibrarianBean librarianBean;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
