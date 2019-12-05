package com.class26;

public class WebDriver {
	
	public void open() {
		System.out.println("Opening browser");
	}
	public void refresh() {
		System.out.println("Refreshin browser");
	}

}

class ChromeDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening chrome browser");
	}
	

}

class Firefox extends WebDriver{
	public void open() {
		System.out.println("Opening Firefox browser");
	}
	public void getTitle() {
		System.out.println("Getting title on firefox browser");
	}
	
}

