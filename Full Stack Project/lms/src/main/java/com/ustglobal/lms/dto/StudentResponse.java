package com.ustglobal.lms.dto;

import java.util.List;

import lombok.Data;

@Data
public class StudentResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<BookBean> bookBeans;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<BookBean> getBookBeans() {
		return bookBeans;
	}
	public void setBookBeans(List<BookBean> bookBeans) {
		this.bookBeans = bookBeans;
	}
	
	
	
	
	
	
}
