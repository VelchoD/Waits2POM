package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.Base;
import testdata.testdata;

public class Page2Objects extends Base {
	
	 testdata td=new testdata ();


	//Web element picture 1
	@FindBy(xpath ="//img[@id='compass']")
	WebElement picture1;
	
	//Web element picture2
	@FindBy(xpath = "//img[@id='calendar']")
	WebElement picture2;
	
	//Web element picture3
	@FindBy(xpath = "//img[@id='award']")
	WebElement picture3;
	
	//Web element picture4
	@FindBy(xpath = "//img[@id='landscape']")
	WebElement picture4;
	
	//Web element text
	@FindBy(xpath = "//p[@id='text']")
	WebElement text;
	
	//Init Elements
	public Page2Objects() {
		PageFactory.initElements(driver, this);
	}
	
	/*Mehod*/
	public void Page2() {
		WebDriverWait wait=new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='compass']")));
	    picture1.isDisplayed();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='calendar']")));
	    picture2.isDisplayed();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='award']")));
	    picture3.isDisplayed();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='landscape']")));
	    picture4.isDisplayed();
	        
	    
	}
}
