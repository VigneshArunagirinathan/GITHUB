import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelInteg extends Baseclasss {
public static void main(String[] args) throws Throwable {
	Baseclasss.launch("https://www.facebook.com/");
	WebElement test = driver.findElement(By.id("email"));
	test.sendKeys(getdata(2,0));
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(getdata(2,2));
	WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
	btn.click();

}
}
