package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleTest {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//wait implicitly for 15 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.target.com/");
		
		
		//Actual title
		String expectedTitle = "Target : Expect More. Pay Less.";
		
		// Capturing the actual title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Title valdation passed");
		}else {
			System.out.println("Title validation failed !!");
		}
		
		driver.close();
		

	}

}
