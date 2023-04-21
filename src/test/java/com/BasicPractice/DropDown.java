package com.BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
//      driver.navigate().to("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_2");
//      WebElement list=driver.findElement(By.xpath("//a[@id='LinkDropdownDemo']"));
//      list.click();
//      
//      List<WebElement>lists= driver.findElements(By.xpath("//div[contains(@class,dropdown-menu)]/a"));
//      
//      for (WebElement webElement : lists) {
//    	  String option=webElement.getText();
//		System.out.println(webElement.getText());
//		
//		if(option.equals("CSS")) {
//			webElement.click();
//			break;
//		}
      // Multiple Dropdown Selected
      driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
      driver.findElement(By.xpath("//button[@title='None selected']")).click();
      List<WebElement> option=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));
      for (WebElement webElement : option) {
    	  String Options=webElement.getText();
    	  System.out.println(webElement.getText());
		if(Options.equals("HTML")) 
			webElement.click();
		if(Options.equals("CSS tricks"))
			webElement.click();
    	  
	} 
      driver.close();
       
    	   }
       
      
	}
      
      
	
