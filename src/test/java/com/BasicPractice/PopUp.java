package com.BasicPractice;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUp {

	public static void main(String[] args) {
      ChromeOptions option=new ChromeOptions();
      HashMap<String,Integer> ContentSetting=new HashMap<String,Integer>();
      HashMap<String,Object> profile=new HashMap<String, Object>();
      HashMap<String,Object> prefs=new HashMap<String, Object>();
      ContentSetting.put("geolocation", 1);
      profile.put("managed_default_content_settings", ContentSetting);
      prefs.put("profile", profile);
      option.setExperimentalOption("prefs", prefs);
      
//      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver(option);
      
      driver.get("https://whatmylocation.com/");
	}

}
