package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
     FireFoxDriver obj=new FireFoxDriver();
     obj.openBrowser();
     obj.closeBrowser();
     obj.maximizeWindow();
     obj.findElement();
     
     ChromeDriver obj2=new ChromeDriver();
     obj2.closeBrowser();
     obj2.openBrowser();
     obj2.maximizeWindow();
     obj2.findElement();
	}

}
