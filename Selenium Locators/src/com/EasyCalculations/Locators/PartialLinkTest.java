package com.EasyCalculations.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.Helper;

public class PartialLinkTest {
	WebDriver driver; 

	@Test
	public void linkTest() throws Exception{ 
	WebDriver driver = Helper.startBrowser("GC"); 
	driver.get("https://auth.hollandandbarrett.com/u/login?");
	driver.manage().window().maximize();

	        driver.findElement(By.id("username")).sendKeys("shabarish145@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Lakshmi@1");
	        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).click(); 
	        Thread.sleep(20000);
	driver.findElement(By.partialLinkText("Vitamins")).click();

	List<WebElement> links=driver.findElements(By.xpath("//a"));
	int nolinks=links.size(); 
	System.out.println("No.Of links in Holland & Barrett Application: " +nolinks); 

	for(int i=0;i<links.size();i++) {
	System.out.println(links.get(i).getText()); 
	String str=links.get(i).getText(); 
	String str1="Vitamins & Supplements";

	if(str==str1) {
	driver.findElement(By.linkText("Vitamins & Supplements")).click();
	driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/header/div/div[1]/div[3]/div/section/nav/ul/li[1]/a")).click(); 
	 
	}

}
	
}
}	
	
	

	


