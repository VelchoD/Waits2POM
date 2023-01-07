package Page2TestCases;

import org.testng.annotations.Test;

import Base.Base;
import PageObjects.Page2Objects;
import testdata.testdata;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class WaitsPage2TestCases extends Base {
	
	Page2Objects pw;
	testdata td ;

 
  @BeforeMethod
  public void beforeMethod()  {
		
	    openApplication();
		pw = new Page2Objects();
		td = new testdata();
	}
  
  @Test
  public void TestWaits1() {
	  pw.Page2 ();
	  String actualtext=driver.findElement(By.xpath("//p[@id='text']")).getText();
	  Assert.assertEquals(actualtext,td.expectedtext);
	  System.out.println(actualtext);
		 
	  
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
  }  
 }

