package com.BasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
         driver.findElement(By.xpath("//button[@id='btn1']")).click();
         
          driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//         driver.close();
           driver.findElement(By.id("txt1")).sendKeys("Vinod");
           
	}

}
