package com.ustglobal.lms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "book")
public class BookBean {
	@Id
	@Column
//	@SequenceGenerator(name = "mysequence", initialValue = 5000)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@GeneratedValue
	private int bid;
	@Column
	private String bname;
	@Column
	private String bauthor;
	@Column
	private int bcost;
	@Column
	private int bquantity;
	
	@Exclude
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "bookBeans")
	private List<StudentBean> studentBeans;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public int getBcost() {
		return bcost;
	}

	public void setBcost(int bcost) {
		this.bcost = bcost;
	}

	public int getBquantity() {
		return bquantity;
	}

	public void setBquantity(int bquantity) {
		this.bquantity = bquantity;
	}

	public List<StudentBean> getStudentBeans() {
		return studentBeans;
	}

	public void setStudentBeans(List<StudentBean> studentBeans) {
		this.studentBeans = studentBeans;
	}
	
	
	
	
	
	
	
	
	
}
