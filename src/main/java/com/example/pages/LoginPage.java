package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.example.base.BasePage;

public class LoginPage extends BasePage{

 
	public LoginPage(WebDriver driver){
		super(driver);
		System.out.println("Loginpage");
	 
	}
	
	public LandingPage doLogin(String username,String password){
 
		// login
		System.out.println("Login successful");
		
		LandingPage landingpage= PageFactory.initElements(driver, LandingPage.class);
		return landingpage;
		
	}
}
