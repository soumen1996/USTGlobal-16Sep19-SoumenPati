package com.ustglobal.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	
	public static void main(String[] args) {
		
		String path = "E:\\UST Training\\JDBC\\text.txt ";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			int i;
			while((i = reader.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
