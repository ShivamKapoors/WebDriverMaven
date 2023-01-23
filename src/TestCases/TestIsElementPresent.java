package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIsElementPresent {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(String locator)
	{		
		
		/*
		 * try { driver.findElement(By.id(locator)); return true; } catch(Throwable t) {
		 * return false;
		 * 
		 * }
		 */
		
		int sizes=driver.findElements(By.id("searchLanguage")).size();

		if(sizes==0)
		{
			return false;
		}
		else
		{
		return true;
		}
		
	}	
	
		
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
		//System.out.println(driver.findElement(By.id("searchLanguage")).isDisplayed());
		// ISdisplayed - To check the visisbielity of the element.
		
		System.out.print(isElementPresent("searchLanguage"));
			
		
	}

}
	