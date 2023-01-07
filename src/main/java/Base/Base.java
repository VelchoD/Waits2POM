package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

		public static WebDriver driver;
		public String homeURL = "https://bonigarcia.dev/selenium-webdriver-java/loading-images.html";
		
		
		
		public void openApplication() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(homeURL);
			driver.manage().window().maximize();
			
		}
}
