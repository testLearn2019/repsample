package newproject.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Newsel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver ();
        driver.get("https://www.facebook.com/");
        //comment
        //driver.findElement(By.partialLinkText("Forgotten")).click();
        //driver.findElement(By.xpath("//input[@name='firstname']")).click();
        //driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
        //Select day = new Select (driver.findElement(By.id("day")));
        //day.selectByVisibleText("5");
        //Select month = new Select(driver.findElement(By.id("month")));
        //month.selectByValue("6");
        //Select year = new Select(driver.findElement(By.id("year")));
        //year.selectByIndex(3);
        //driver.quit();or close
         driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
         Thread.sleep(3000);
       // driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).sendKeys("priya");
         driver.findElement(By.id("identify_email")).sendKeys("priyaprakirthi@gmail.com",Keys.ENTER);
	}

	
	}
	


