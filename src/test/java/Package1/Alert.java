package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
public WebDriver driver;
	
	
  @Test
  public void alert() throws Exception  {
	 
	  driver.findElement(By.id("alertButton")).click();
	 String str = driver.switchTo().alert().getText();
	 System.out.println(str);
	 Thread.sleep(2000);
	 
	 driver.switchTo().alert().accept();
	 
	  
  }
  
  
  @BeforeTest
  public void Openurl() throws Exception{
	 WebDriverManager.firefoxdriver().setup();
	 driver = new FirefoxDriver();
	 driver.get("https://demoqa.com/alerts");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 
	  
  }

  
  
  @AfterTest
  public void afterTest() {
  }

}
