package TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBrowserr {


	public static void main(String[] args) {
		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C://Users//shiva//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		
		//Creating an object of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		// Implicit Waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Explicit Waits
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"identifierId\"]"))).sendKeys("shivamkapoor8666@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")));
		// Fluent Wait
		
		
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shivamkapoor8666@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		

	}

}
