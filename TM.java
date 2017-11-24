package KeywordDriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TM extends OM {

	
	
	public String Addition() throws Throwable {
		String addresults="";
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("25");
	   Select sc =	new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select")));
	         sc.selectByIndex(0);
	   driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");
	   driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	   Thread.sleep(5000);
	   addresults=driver.findElement(By.xpath("html/body/div[3]/table/tbody/tr/td[3]")).getText();
	   return addresults;
	}

	public String Subtraction() throws Throwable
	{
		String subresults="";
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("25");
	   Select sc =	new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select")));
	         sc.selectByIndex(4);
	   driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");
	   driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	   Thread.sleep(3000);
	   subresults=driver.findElement(By.xpath("html/body/div[3]/table/tbody/tr/td[3]")).getText();
	   return subresults;
	}
	public void close() 
	{
		driver.close();
		
	
	}
	
	
	public  void Executor() throws Throwable {

		File f=new File("D:\\Selena T06\\KeyWord1\\onlinecal.txt");
		FileReader fr=new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		for(int i=1;i<5;i++)	
		{	

			String line=br.readLine();
			String[] data=line.split("#");
			String toExecute=data[2];
			System.out.println(toExecute);


			if(toExecute.equals("Y")){
				String Keyword=data[3];
				System.out.println(Keyword);	

				String TestResult="";
				switch(Keyword){
				case "AccessTest":{
					TestResult= AccessApp() ;
					break;
				}
				case "DivisionTest":{
					TestResult= Division();
					break;
				}
				case "AditionTest":{
					TestResult=Addition();	
					break;

				}
				case "SubtractionTest":
				{
					TestResult= Subtraction();
					break;
				}
				case "QuitBrowser":
				{
					close();
				}
				System.out.println(TestResult);
			}
		}
		}
	}
}
