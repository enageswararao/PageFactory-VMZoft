package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.example.base.BasePage;

public class LaunchPage extends BasePage {

	
	
	public LaunchPage (WebDriver driver){
		super(driver);
		System.out.println("Slenium");
	 
		driver.get("http://yahoo.com");
	}
public LoginPage gotoFBHomePage(){
	
		System.out.println("Go to FB HomePage");
		LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);
		return  loginpage;
	}
}
