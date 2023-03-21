package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//wait implicitly for 15 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
		driver.get("https://www.facebook.com/");
		
		//identifying click me element with attribute
//		WebElement clickMeButton = driver.findElement(By.id("button1"));
//		clickMeButton.click();
		
//		WebElement button = driver.findElement(By.className("buttonClass"));
//		button.click();
		
//		WebElement button1 = driver.findElement(By.name("button1"));
//		button1.click();
		
//		WebElement link = driver.findElement(By.linkText("Click this link"));
//		link.click();
		
		// for partial link text we skip the last word
//		WebElement partiallink = driver.findElement(By.partialLinkText("Click this "));
//		partiallink.click();
		
		// finding totalLink with the help of tagName
//		int totalLinks = driver.findElements(By.tagName("a")).size();
//		System.out.println("This page contains "+ totalLinks + " links");
		
		
		//css selector tagName is optional
//		driver.findElement(By.cssSelector("#idExample")).click(); //clicking on button link
		
		// clicking on the second button
		//css selector tagName is optional
//		driver.findElement(By.cssSelector("button.buttonClass[type=submit]")).click();
				
		driver.findElement(By.id("email")).sendKeys("abcdefg@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		
		
		
		
		

	}

}
