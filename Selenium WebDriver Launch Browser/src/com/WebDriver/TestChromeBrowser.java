// Write a Program using selenium Webdriver Launch Chrome Browser test Maximize & minimize Browser
package com.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium Class\\Selenium WebDriver Launch Browser\\Chrome Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		

	}

}
