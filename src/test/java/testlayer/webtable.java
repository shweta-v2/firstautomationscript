package testlayer;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baselayer.baseclass;

public class webtable {

	WebDriver driver ;
	@BeforeMethod
	public void browserOpen() {
		baseclass.initialization();
	}
	@Test
	public void function() {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> rowsNumber = driver.findElements(By.xpath("//table[@class='table table-data table-condensed spacer-lg'][1]/tbody/tr[1]/td[1]"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
}
