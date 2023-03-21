package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebdriverManager {

	public static void main(String[] args) {
//		//Import WebDriverManager and setup edge driver
//		WebDriverManager.edgedriver().setup();
//		// Create a WebDriver instance of EdgeDriver
//		WebDriver driver = new EdgeDriver();
		
		
		/* How can we do the samething using chrome?
		 */
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		
		
		
		//With the help of the driver reference we are getting the url
		driver.get("https://www.target.com/");
		
		
		
		
		

	}

}
