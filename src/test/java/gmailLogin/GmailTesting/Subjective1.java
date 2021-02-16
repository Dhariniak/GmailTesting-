package gmailLogin.GmailTesting;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		


public class Subjective1 {
	public static void main(String[] args) {									
		
		   
        System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\chromedriver_win32\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://demo.guru99.com/test/login.html";					
        driver.get(baseUrl);					

       	
        WebElement email = driver.findElement(By.id("email"));							

       	
        WebElement password = driver.findElement(By.name("passwd"));							

        email.sendKeys("dharini@gmail.com");					
        password.sendKeys("akdhar");					
        System.out.println("value entered");					
         
        
        email.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					

       
        WebElement login = driver.findElement(By.id("SubmitLogin"));							
                    		
       	
        email.sendKeys("dharini@gmail.com");					
        password.sendKeys("lakhatsa");					
        login.click();			
        System.out.println("Login Done with Click");					
        		
        	
        driver.get(baseUrl);					
        driver.findElement(By.id("email")).sendKeys("dharini@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("akdhar");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Logged in");					
         
		driver.close();		
        		
    }		
}


