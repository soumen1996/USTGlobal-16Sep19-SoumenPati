package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {
		String path = "text.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();//implements hastable
			properties.load(reader);
			String name = properties.getProperty("name");
			String company = properties.getProperty("company");
			String subject = properties.getProperty("subject");
			
			System.out.println(name);
			System.out.println(company);
			System.out.println(subject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
