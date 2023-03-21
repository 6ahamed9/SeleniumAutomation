package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\TOOLS\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		//WebDriver driver = new ChromeDriver();
		// driver navigation commands
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.get("https://www.target.com");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		//Refresh
		driver.navigate().refresh();
		
		driver.close();

	}

}
