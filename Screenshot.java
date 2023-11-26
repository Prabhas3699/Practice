package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		//Using interface to take screenshot of the driver
		TakesScreenshot sf=(TakesScreenshot) driver;
		
		//getting the source file in file format
		File sourceFile = sf.getScreenshotAs(OutputType.FILE);
		
		//creating the destination file for storing the source file
		File destinationFile = new File("D:\\Screenshot\\google1.png");
		
		//coping the source file in the destination file
		FileHandler.copy(sourceFile, destinationFile);
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
