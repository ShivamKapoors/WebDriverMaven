package TestCases;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {

	public static void main(String[] args) {
		ChromeDriver	driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("Way2Automation");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
		WebElement mouseover=driver.findElement(By.xpath("//*[@id=\"menu-item-27617\"]/a/span[2]"));
		Actions action= new Actions(driver);
		action.moveToElement(mouseover).perform();
		driver.findElement(By.xpath("//*[@id=\"menu-item-27618\"]/a/span[2]")).click();
		// How to slide an element
		
		
		
		
	}

}
