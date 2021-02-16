package gmailLogin.GmailTesting;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.sun.jna.platform.FileUtils;
public class ScreenShot{
    public WebDriver driver;
    @Test
    public void openBrowser() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("palanivicky1999@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

        try{
            driver.findElement(By.id("testing")).sendKeys("test");

        }
        catch (Exception e){
            System.out.println("I'm in exception");
            getscreenshot();
        }
    }
    public void getscreenshot() throws Exception
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile, new File("E:\\screenshot1.png"));
    }
}