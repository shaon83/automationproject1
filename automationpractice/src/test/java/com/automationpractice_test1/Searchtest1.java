package com.automationpractice_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Searchtest1 {

	@Test
	public void searchtest() {
		
		System.setProperty("webdriver.driver.chrome", "ch\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
	    driver.findElement(By.xpath("//div[@class='panel header']//a[text()='Create an Account']")).click();
	    driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
		WebElement error = driver.findElement(By.xpath("//div[@id='firstname-error']"));
		String y=  error.getText();
		System.out.println(y);
		
		Assert.assertEquals(y, "This is a required field.");
	    
	    
	}
	
	
	
}
