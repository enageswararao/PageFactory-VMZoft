package com.example.pages;

import org.openqa.selenium.WebDriver;

import com.example.base.BasePage;

public class LandingPage extends BasePage {
	
	
	public LandingPage(WebDriver driver){
		super(driver);
		
	}
public ProfilePage gotoProfilePage(){
	
	
	ProfilePage profpage=new ProfilePage();
	System,out.println("Lading page added new line")
	System,out.println("Lading page added 2nd line")
	System,out.println("Lading page added 3nd line")
	return profpage;
}
 
}