package TestCases;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//shiva//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		// $$('[name=language]')
		// $$('')
		// Creating an object of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).sendKeys("Dansk");

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		Select select = new Select(dropdown);

		// select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		// How to get all the elements from the dropdown list.
		/*
		 * List <WebElement> values =driver.findElements(By.tagName("Option")); int
		 * Total_Values =values.size();
		 * System.out.println("Total_values are : "+values.size());
		 * System.out.println(values.get(7).getText());
		 * 
		 * 
		 * for(int i=0 ;i <Total_Values;i++) {
		 * //System.out.println(values.get(i).getText());
		 * System.out.println(values.get(i).getAttribute("lang")); }
		 */

		// How to find all the links in a website

		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * System.out.println(links.size());
		 * System.out.println("Total no of links are :" + links.size());
		 * 
		 * 
		 * for (WebElement link: links) {
		 * System.out.println(link.getText()+"-- URL is--  "+
		 * link.getAttribute("href"));
		 * 
		 * 
		 * }
		 */
		  
		  // How to find the links in a particular elements.
		  List<WebElement> blocks= driver.findElements(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[11]/div[3]"));
		  blocks.size();
		  System.out.println("Blocks size are : "+blocks.size());
		  for (int j=0; j<blocks.size();j++)
		  {

			  System.out.println(blocks.get(j).getText());
			
		  }
		  
		 
}}
