package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit {
	public WebDriver driver;
	
	
  @Test
  public void operation() throws Exception {
	  
	// First name
				driver.findElement(By.id("firstName")).sendKeys("Durga"); 
				// Last name
				driver.findElement(By.id("lastName")).sendKeys("Prasad");
				//Email
				driver.findElement(By.id("userEmail")).sendKeys("durga1@gmail.com");
				//Gender
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label")).click();
				//Mobile
				driver.findElement(By.id("userNumber")).sendKeys("9985768979");
				//D.O.B
				driver.findElement(By.id("dateOfBirthInput")).click();
				//Month
				new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("January");
				//year
				new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("2000");
				//date
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[7]")).click();
				// Subjects
				driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
				driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
				//Hobbies
				
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]/label")).click();
				 // select picture
			  //WebElement A =	driver.findElement(By.id("uploadPicture"));
				driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\lenovo\\Desktop\\prabhas.jpeg");
			    Thread.sleep(3000);
			    
			    //driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\lenovo\\Desktop\\DurgaPrasadajax.exe");
                //driver.findElement(By.id("uploadPicture")).click();
				//Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\DurgaPrasadajax.exe");
				//Current address
				driver.findElement(By.id("currentAddress")).sendKeys("Bhimavaram");
				// shift to Next as "TAB" works
			    driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
				// select state
				driver.switchTo().activeElement().sendKeys("NCR");
				driver.switchTo().activeElement().sendKeys(Keys.TAB);
				driver.switchTo().activeElement().sendKeys(Keys.TAB);
				// select city
				driver.switchTo().activeElement().sendKeys("Noida");
				driver.switchTo().activeElement().sendKeys(Keys.TAB);
				driver.switchTo().activeElement().sendKeys(Keys.TAB);
				//Submit
				driver.findElement(By.id("submit")).click();
				//Close
				driver.findElement(By.id("closelargemodel")).click();
  
	  
  } 
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
