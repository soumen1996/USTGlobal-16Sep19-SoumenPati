package com.ustglobal.jspwithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Person {
	
	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "vid")
	private VoterId voterId;
	
	

}
