package com.mvnjenkins.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstIntTest {

	@Test
	public void firstMethod() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/");
	
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("//li[@class='tree-branch']/a[contains(text(),'Input Forms')][1]")).click();

driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='./basic-first-form-demo.html']")).click();


System.out.println("title of the page is : " +driver.getTitle());

Assert.assertTrue(driver.getTitle().contains("Demo"), "Title doesnt contain the text");

driver.quit();
	
	
	
	}
}
