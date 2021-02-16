package gmailLogin.GmailTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefinition {
   
    public static WebDriver obj=null;
   
    @Given("^url opened$")
    public void url_opened() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\training\\chromedriver_win32\\chromedriver.exe");
        obj=new ChromeDriver();
        obj.manage().window().maximize();
        obj.get("https://mail.google.com");
    }

    @Then("^enter user id and click next$")
    public void enter_user_id_and_click_next() throws InterruptedException  {
        obj.findElement(By.cssSelector("input")).sendKeys("dharinikavitha@gmail.com");
        //obj.findElement(By.linkText("Next")).click();
        obj.findElement(By.xpath("//div[@id='identifierNext']")).click();

        Thread.sleep(2000);
    }

    @Then("^enter password$")
    public void enter_password()  {
        obj.findElement(By.xpath("input[type='password']")).sendKeys("YOURPASSWORD");
           
        }

    @Then("^click login$")
    public void click_login() throws InterruptedException  {
        obj.findElement(By.cssSelector("input")).click();
        Thread.sleep(6000);
    }

    @Then("^Close browser$")
    public void close_browser() {
        obj.quit();
    }
}