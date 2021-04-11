package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranit\\Downloads\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		    //to open a web site //http://retailm1.upskills.in/
			driver.get("http://retailm1.upskills.in/");
			//to maximize screen 
			driver.manage().window().maximize();
			//dropdown menu for login page
			driver.findElement(By.xpath("//*[@class='tb_link dropdown tb_menu_system_account_account']")).click();
			//email
		    driver.findElement(By.id("input-email")).sendKeys("pranit@gmail.com");
		    //password
            driver.findElement(By.id("input-password")).sendKeys("pranit234");
            //delay
            Thread.sleep(2000);
            //click on login
            driver.findElement(By.xpath("//*[@class='btn btn-primary' and @value='Login']")).click();
            //delay
            Thread.sleep(3000);

	}

}
