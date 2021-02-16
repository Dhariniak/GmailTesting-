package gmailLogin.GmailTesting;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) throws ParseException {
	    WebDriver wd;
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\chromedriver_win32\\chromedriver.exe");
	    wd = new ChromeDriver();
	    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    wd.get("https://cosmocode.io/automation-practice-webtable/");
	    //To locate table.
	    WebElement mytable = wd.findElement(By.xpath("//*[@id=\"countries\"]"));
	    //To locate rows of table.
	    List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
	    //To calculate no of rows In table.
	    int rows_count = rows_table.size();
	    //Loop will execute till the last row of table.
	    for (int row = 0; row < rows_count; row++) {
	       //To locate columns(cells) of that specific row.
	       List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
	       //To calculate no of columns (cells). In that specific row.
	       int columns_count = Columns_row.size();
	       //System.out.print(row);
	       //Loop will execute till the last cell of that specific row.
	       for (int column = 0; column < columns_count; column++) {
	           // To retrieve text from that specific cell.
	           String celtext = Columns_row.get(column).getText();
	           System.out.print(celtext+" ");
	       }
	       System.out.println();
	    }
	    }
	}