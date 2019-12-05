package com.class29;

public class TestTask {

	public static void main(String[] args) {

		//Task file1=new JavaFile(); it gives an error because we change to child class to abstract and we didnt defined undefined method inside this class
		//file1.close();
		//file1.edit();
		//file1.open();
		
		WordFile file2=new WordFile();
		file2.close();
		file2.open();
		file2.edit();
		
		PdfFile file3=new PdfFile();
		file3.close();
		file3.edit();
		file3.open();
	
	
	}

}
