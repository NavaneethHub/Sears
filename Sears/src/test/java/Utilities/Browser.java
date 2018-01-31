package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestData.BaseClass;

public class Browser extends BaseClass
{
	public Browser() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static WebDriver browserInitialization() throws IOException
	{
	BaseClass base=new BaseClass();
	base.config();
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+property.getProperty("geckoDriver_path"));
	WebDriver driver=new FirefoxDriver();
	System.out.println(System.getProperty("user.dir")+property.getProperty("geckoDriver_path"));
	return driver;
	}
}
