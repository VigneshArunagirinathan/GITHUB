import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extendsclass extends Baeclass {
public static void main(String[] args) throws Throwable {
	launch("https://www.facebook.com/");
	WebElement aaa = driver.findElement(By.id("email"));
	type(aaa,"vicky");
	WebElement bbb = driver.findElement(By.id("pass"));
type(bbb,"123456");
driver.manage().window().maximize();
TakesScreenshot tk=new ChromeDriver();
Thread.sleep(3000);
File sc = tk.getScreenshotAs(OutputType.FILE);
File f=new File("C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\Screenshot\\vicky.png");
drag(sc,f);
Thread.sleep(6000);
WebElement fff = driver.findElement(By.xpath("//input[@type='submit']"));
cli(fff);
	
	
	
	
	
}
}
