import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement ff = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	ff.click();
	Thread.sleep(4000);
	 org.openqa.selenium.Alert al = driver.switchTo().alert();
	 al.accept();
	 
	
}
}
