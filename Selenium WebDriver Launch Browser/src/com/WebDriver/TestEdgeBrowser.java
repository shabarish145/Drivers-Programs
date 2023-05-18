package com.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEdgeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver",
					"E:\\Selenium Class\\Selenium WebDriver Launch Browser\\Edge Browser\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();

	}

}
