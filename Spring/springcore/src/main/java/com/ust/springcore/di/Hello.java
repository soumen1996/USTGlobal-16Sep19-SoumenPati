package com.ust.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	
	private String Msg;

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	private Map<String, Integer> map;
	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method executing from Hello");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method executing from Hello");
	}
}
