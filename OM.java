package KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OM {
	
	
	WebDriver driver;
	public String AccessApp() throws Throwable {
		String homepageinfo="";
		System.setProperty("webdriver.chrome.driver","D:\\Selena T06\\Browser Drivers\\Google Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
		Thread.sleep(5000);
		homepageinfo=driver.findElement(By.xpath("html/body/div[3]/div/h3")).getText();
		return homepageinfo;
	}
	public String Division() throws Throwable
	{
		String divresults="";
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("25");
	   Select sc =	new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select")));
	         sc.selectByIndex(1);
	   driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");
	   driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	   Thread.sleep(5000);
	   divresults=driver.findElement(By.xpath("html/body/div[3]/table/tbody/tr/td[3]")).getText();
	   return divresults;
	}

}
