package com.example.pages;

import org.openqa.selenium.WebDriver;

import com.example.base.BasePage;

public class LandingPage extends BasePage {
	
	
	public LandingPage(WebDriver driver){
		super(driver);
		
	}
public ProfilePage gotoProfilePage(){
	
	
	ProfilePage profpage=new ProfilePage();
	
	return profpage;
}
 
}