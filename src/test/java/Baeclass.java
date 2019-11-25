
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Baeclass {
static 	WebDriver driver;		
public static void launch(String url) throws Throwable
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\Driver\\chromedriver.exe");
  driver=new ChromeDriver();
driver.get(url);
}
public static void type(WebElement loc,String text)
{
	loc.sendKeys(text);
}	
public static void cli(WebElement loc)
{
	loc.click();
}
public static void close()
{
	driver.close();
	System.out.println("closed");
	}
public static void drag(File src,File dest) throws IOException
{
	FileUtils.copyFile(src, dest);
	
}







	











}
