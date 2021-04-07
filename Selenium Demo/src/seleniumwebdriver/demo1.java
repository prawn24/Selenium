package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranit\\Downloads\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	    //to open a web site //https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//to maximize screen 
		driver.manage().window().maximize();
		//capture the title of the web page 
		String beforetitle = driver.getTitle();
		//print the tile 
		System.out.println(beforetitle);
		
		//Enter the username 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//click on login button
		driver.findElement(By.id("btnLogin")).click();
		//checking the title
		String aftertitle = driver.getTitle();
		System.out.println(aftertitle);
		
		if(beforetitle.equals(aftertitle))
		{
			System.out.println("Title is same please logout");
			driver.findElement(By.id("welcome")).click();
			//delay
			Thread.sleep(3000);
			//delay
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			Thread.sleep(3000);
			//closing the browser
			driver.close();
		}
		else
		{
			System.out.println("Title is not same");
			driver.close();
		}
		
	}

}