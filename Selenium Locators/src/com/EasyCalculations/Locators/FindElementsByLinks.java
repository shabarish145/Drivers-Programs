package com.EasyCalculations.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.Helper;

public class FindElementsByLinks {
	
	WebDriver driver;
	int total = 0;
	
	@Test
	public void LinksLocator() {
		driver = Helper.startBrowser("GC");
		driver.navigate().to("https://www.easycalculation.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Calculators")).click();
		
		// List is Interface we cannot create object links is Variable 
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		total = total + links.size();
		System.out.println("Number of Links:" + linkCount);
		
		for(int i=1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
					
	}

}
