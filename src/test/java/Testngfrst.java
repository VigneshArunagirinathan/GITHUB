import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

class Testngfrst
{
static WebDriver driver;
	@BeforeClass
	private void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	private void tc1() {
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("vaaaaaavv");
		WebElement txt1 = driver.findElement(By.id("pass"));
		txt.sendKeys("32233323223");
		WebElement txt2 = driver.findElement(By.id("loginbutton"));
		txt2.click();

	}
	@Test (priority=-11)
	private void tc2() {
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("xxx");
		WebElement txt1 = driver.findElement(By.id("pass"));
		txt.sendKeys("****");
		WebElement txt2 = driver.findElement(By.id("loginbutton"));
		txt2.click();

	}

}