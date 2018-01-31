package TestCases;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import TestData.BaseClass;
import Utilities.Browser;

public class Login extends BaseClass
{
	public static WebDriver driver;
	HomePage homepage;
	Logger log;
	public Login() throws IOException
	{
		this.driver=Browser.browserInitialization();
	}
	
	@BeforeClass void before()
	{
		 homepage=PageFactory.initElements(driver, HomePage.class);
		 log=Logger.getLogger(Login.class);
		 PropertyConfigurator.configure("log4j.properties");
	}
	@Test void verifingLogin() throws InterruptedException
	{
		log.debug("lanuching Application");
		driver.get(property.getProperty("Application_URL"));
		log.debug("Selecting signIn");
		Thread.sleep(100);
		homepage.selectingSignInOption().click();
		System.out.println("Clicking signIN");
		Thread.sleep(100);
		homepage.clickingSignIn().click();
		
		
		
		System.out.println("closing app");
		driver.close();
	}
}
