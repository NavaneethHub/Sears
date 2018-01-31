package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass 
{
	public static Properties property;
	public static File file;
	public static FileInputStream fis;
	public static void config() throws IOException
	{
		System.out.println("In base class");
		 property=new Properties();
		 file=new File(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\OR.properties");
		 fis=new FileInputStream(file);
		property.load(fis);
		System.out.println(property.getProperty("geckoDriver_path"));
	}
}
