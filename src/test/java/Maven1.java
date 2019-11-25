import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Vicky\\Driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement text = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','vicky@gmail.com')",text);
		WebElement password = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','123456')",password);
		Object obj = js.executeScript("return arguments[0].getAttribute('value')",password);
		String str=(String)obj;
		System.out.println(str);
		}
		}



