import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mav5 extends Maven4{
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\Driver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	// driver.get("https://www.facebook.com/");
	WebElement ff = driver.findElement(By.id("email"));
	ff.sendKeys(getData(1,0));
	WebElement gg = driver.findElement(By.id("pass"));
	gg.sendKeys(getData(2,0));
}
}
