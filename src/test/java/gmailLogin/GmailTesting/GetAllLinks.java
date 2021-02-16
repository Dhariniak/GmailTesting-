package gmailLogin.GmailTesting;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetAllLinks {
	public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
	
		 driver.get("https://wordpress.com/?aff=58022&cid=8348279");
		 driver.manage().window().maximize();
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		 for(WebElement link:allLinks){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
	
		 }
		 
		}


