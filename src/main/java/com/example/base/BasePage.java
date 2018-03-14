package com.example.base;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public  WebDriver driver;
		
	public BasePage() { }
	
	public BasePage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	//common action to all page
	public void logout(){
		 
		System.out.println("logout logic");
	}
}
