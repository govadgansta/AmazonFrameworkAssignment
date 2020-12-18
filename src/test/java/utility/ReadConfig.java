package utility;

import java.io.FileReader;
import java.util.Properties;

public class ReadConfig {
	
	FileReader src;
	Properties p;
	public ReadConfig()
	{
		
		try 
		{
			src=new FileReader(System.getProperty("user.dir")+"\\Configuration\\config.properties");
			p=new Properties();
			p.load(src);
		}
		catch(Exception e)
		{
			System.out.println("Error message is "+ e.getMessage());;
		}
	}
	
	public String getAmazonURL()
	{
		return p.getProperty("AmazonURL");
		
	}

	
	public String getItemname()
	{
		System.out.println(p.getProperty("ItemName"));
		return p.getProperty("ItemName");
	}

	public String getUname()
	{
		System.out.println(p.getProperty("Username"));
		return p.getProperty("Username");
	}

	public String getUPasswrd()
	{
		System.out.println(p.getProperty("Password"));
		return p.getProperty("Password");
	}
	
	public String chromePath()
	{
		return p.getProperty("chromepath");
	}
	
}
