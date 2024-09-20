package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2 {
	public static void main(String[] args) {
		 
	
			 WebDriverManager.firefoxdriver().setup();
		     WebDriver driver = new FirefoxDriver();
		     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		   
		        driver.get("https://alchemy.hguy.co/jobs/");
		     
		     	        
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
		      		        
		        String text = driver.findElement(By.className("entry-title")).getText();
		        System.out.println(text);
 	      	      
		        driver.quit();

		}

	}
