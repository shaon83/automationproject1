package com.qa.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "ch\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(
				"https://katalon.com/software-testers?utm_term=software%20test%20automation&utm_campaign=Top3_QE_Non_Branded_Search_Ads_Campaign_&gclid=Cj0KCQjw0tKiBhC6ARIsAAOXutn4rdpg5q70kJc5lZfXoCRTvZrkmL1t6vGZ_V5Ysg1aqC1qDaMNGSMaAmDmEALw_wcB#2&utm_source=adwords&utm_medium=ppc&utm_content=631033247163_c_&hsa_acc=4390546474&hsa_cam=18724220062&hsa_grp=146462777481&hsa_ad=631033247163&hsa_src=g&hsa_tgt=kwd-323625271914&hsa_kw=software%20test%20automation&hsa_mt=p&hsa_net=adwords&hsa_ver=3");

		driver.findElement(By.xpath("//a[@class='link resources-link'  and contains(text(), 'Blog')]")).click();
		driver.findElement(
				By.xpath("//div[contains (text(), 'DevOps')]/following-sibling::div [contains( text(), 'What is' )]"))
				.click();

	}
}
