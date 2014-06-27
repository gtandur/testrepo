package com.test.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.seleniumhq.jetty7.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is a first practice prog");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.google.com");
	
	}

}
