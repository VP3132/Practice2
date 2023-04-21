package com.BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	     WebElement CourseName = driver.findElement(By.id("course"));
	     
	     Select Name=new Select(CourseName);
//	     Name.selectByIndex(2);
	     
	     
	     List<WebElement>list=Name.getOptions();
         for(WebElement lists:list) {
        	 System.out.println(lists.getText());
        	
         }
         for(int i=0;i<list.size();i++) {
        	 if(i!=2) {
        		 Name.selectByIndex(i);
        	 }
         }
    	
	}

}
