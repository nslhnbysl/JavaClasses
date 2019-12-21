package com.class30;

public interface WebDriver {

	//Create a WebDriver Interface that will have the following unimplemented behaviour:
	//openBrowser(), closeBrowser(), maximizeWindow(), findElement().
	//Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
interface TakesScreenshot{
	String $FILE_EXTENSION=".png"; //-->we can add just_ and $ sign
	//TakesScreenshot(){} -->we cannot create a constructors for interfaces
	
	static void takeSelfie() { //we can create  static methods in interface since jdk 1.8
		                       //there is non of the child will not change the static methods thats the point create an static 
		                       //BECAUSE WE CANNOT OVERRIDE THE STATIC 
		
	}
	default void takePictures(){//if we add another unimplement method all subclasses will affect to prevent the any mixing we can add just static 
		                        //and default implement methods for to add someting new to interface to improving reduce complexivity
		                        //WE CAN OVERRIDE DEFAULT VOID METHODS 
		
	
		System.out.println("I am default defined method of takescreenshot interface");
		}
	}
class ChromeDriver implements WebDriver,TakesScreenshot{//-->we can implements more than one interface to one class with , comma

	@Override
	public void openBrowser() {
System.out.println("Opening chrome driver...");		
	}

	@Override
	public void closeBrowser() {
System.out.println("Closing chrome driver..");		
	}

	@Override
	public void maximizeWindow() {
System.out.println("Maximizing chrome driver windows..");		
	}

	@Override
	public void findElement() {
System.out.println("Finding element on chrome driver");		
	}
	
}
class FireFoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Opening firefox driver...");	
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing firefox driver...");	
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing firefox driver windows..");		
	}

	@Override
	public void findElement() {
System.out.println("Finding ements on firefox driver");		
	}
	
}

abstract class Browser{
	public abstract void refresh(); //we must to write the public abstract 
}
