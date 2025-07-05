package org.openqa.selenium;

import org.openqa.selenium.WebDriver;

public class WebDriver {

	public static void main(String[] args) {
    	
    	// browser setup
    	WebDriverManager.chromedriver().setup();
    	
    	//open browser
    	WebDriver driver= new ChromeDriver();
    	
    	driver.get("https://www.google.com/");
    	
}
