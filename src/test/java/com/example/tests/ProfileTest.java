package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
 
import org.testng.annotations.Test;

import com.example.pages.LandingPage;
import com.example.pages.LaunchPage;
import com.example.pages.LoginPage;
import com.example.pages.ProfilePage;

public class ProfileTest {
	
	
	
	@Test
	public void testProfile(){
	 	System.out.println("user.dir"+System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver","C:/Users/Sravya/Desktop/VMZosft/MavenProjectDemo/driverexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LaunchPage launchpage= PageFactory.initElements(driver, LaunchPage.class) ;
	 	LoginPage loginpage=	launchpage.gotoFBHomePage();
	 	LandingPage landingpage=loginpage.doLogin("UserXXX", "test123");
	 	ProfilePage profilepage=landingpage.gotoProfilePage();
	 	profilepage.verifyProfile();

	 	sysout();
	
	System.out.println("Hello");
	}

}
