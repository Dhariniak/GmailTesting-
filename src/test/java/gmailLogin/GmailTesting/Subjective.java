package gmailLogin.GmailTesting;
import java.io.File;



import org.openqa.selenium.By;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Subjective {
	 public static void main(String args[]) {
		    File file = new File("C:\\Users\\training\\chromedriver_win32\\chromedriver.exe");
		    String filePath = file.getAbsolutePath();
		    System.out.println(filePath);
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.get("http://demo.guru99.com/test/newtours/register.php");
		    driver.manage().window().maximize();
		    Select drpCountry = new Select(driver.findElement(By.name("country")));
		    drpCountry.selectByVisibleText("AUSTRALIA");

		     


		    }
		    }


