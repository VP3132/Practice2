package com.BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertDemo1 {
     @Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}
