package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcheckboxex {
	
	public static WebDriver driver;
	
	
	public static boolean isElementPresent(By by)
	{	
		int sizes=driver.findElements(by).size();

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
		// How to check the click the checkboxes in selenium
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	for ( int i=1;i<=4;i++)
		/*{
		//driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		 
		
		 * driver.findElement(By.xpath("//div[4]/input[2]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[3]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[4]")).click();
		 }
		// $x('//div[4]/input[1]')
*/	
		//int i=1;
		//int Counter=0;
		
		/*while(isElementPresent(By.xpath("//div[4]/input["+i+"]")))
		{
		
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
				i++;
				Counter++;
				 
		}
		System.out.print("Total Values are : "+Counter);
	*/		WebElement blocks= driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
			List <WebElement> CheckBox= blocks.findElements(By.name("sports"));
			System.out.print("Total Values are : "+CheckBox.size());
			 for (WebElement web:CheckBox) 
			 {
				 web.click();
				 
			 }
			
			 
			
	} 
		
	
	
	 
	}
