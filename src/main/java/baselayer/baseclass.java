package baselayer;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 

{
	public static WebDriver driver ;
	public static Properties prop;
	
	public baseclass() throws IOException{
		
		Properties prop=new Properties();
		
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\project1\\src\\main\\java\\congiglayer\\config.properties");
	    prop.load(fis);
	}
	
	catch (Exception e) {	
		e.printStackTrace();
	}
}
	
	

 public static void initialization() {
	 String  br= prop.getProperty("browser");
	 if(br.equals("google")) {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	 }
	 driver.get(prop.getProperty("url"));
 }


}
