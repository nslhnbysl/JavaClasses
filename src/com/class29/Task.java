package com.class29;

public abstract class Task {

	public abstract void open();
	
public  void edit() {
	System.out.println("Editing the file");
}

public  void close() {
	System.out.println("Closing the file");
}
	
}

abstract class JavaFile extends Task{
//
//	@Override
//	public void open() {
//		System.out.println("Opening java file using sublime text");
//	}

}
class WordFile extends Task{

	@Override
	public void open() {
System.out.println("Opening the word file using notepad");	
	}
}
class PdfFile extends Task{

	@Override
	public void open() {
System.out.println("Opening the pdf file using .doc");		
	}
	
}
