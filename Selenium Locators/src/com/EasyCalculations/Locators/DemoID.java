package com.EasyCalculations.Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utility.Helper;

public class DemoID {
	WebDriver driver;
	
	@Test
	public void TestNameDemo() {
		driver = Helper.startBrowser("GC");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("shabarish145@gmail.com");
		driver.findElement(By.id("log_password")).sendKeys("Lakshmi@1");
		//driver.findElements(By.name("log_submit")).click();
		//driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[4]/input[1]")).click();
		//driver.findElement(By.xpath("//input[@type="button"]")).click();
	}

}


