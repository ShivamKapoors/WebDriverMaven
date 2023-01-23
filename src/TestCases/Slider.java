package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		ChromeDriver	driver = new ChromeDriver();
		//driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Mainslider=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		int width=Mainslider.getSize().width/2;
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		new Actions(driver).dragAndDropBy(slider, width, 0).perform();
	}

}
