package com.class26;

public class WebDriverTest {
	
		public static void main(String[] args) {
			ChromeDriver chrome=new ChromeDriver();
			chrome.refresh();
			chrome.open();
			
			Firefox firefox=new Firefox();
			firefox.refresh();
			firefox.open();
			
			WebDriver driver=new Firefox();
			
			driver.refresh();
			driver.open();
//driver.getTitle(); -->cannot access child specific method but we can access just overriding methods first we check webdriver and then jump to child class 
//and check if the same method created on the child class(overriding) compiler will print it if not created it just print parent class code 
		}
	
}
