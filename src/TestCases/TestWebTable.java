package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebTable {

	public static void main(String[] args) {
		ChromeDriver	driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List <WebElement> rows= driver.findElements(By.xpath("//Table[@class='dataTable']/tbody/tr"));
		System.out.println("Total rows are :"+rows.size());
		List <WebElement> col= driver.findElements(By.xpath("//Table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.print("Total rows are :"+col.size());
		 for (int row=1;row <rows.size();row++)
		 {
			 for (int cols=1; cols< col.size();cols++)
			 {
				 
				 
			System.out.println(driver.findElement(By.xpath("//Table[@class='dataTable']/tbody/tr["+row+"]/td["+cols+"]")).getText());
				 
			 }
		 }
	}
// $x("//Table[@class='dataTable']/tbody/tr")
	// $x("//Table[@class='dataTable']/tbody/tr[1]/td")
}
