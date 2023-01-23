package TestCases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestTryIT {

	public static void main(String[] args) {
		ChromeDriver	driver = new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
