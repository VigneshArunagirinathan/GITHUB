import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;
public class Baseclasss {
	static WebDriver driver; 
public static String getdata(int rw,int cl) throws Throwable 
{  
	String value=null;
	File f=new File("C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\xl\\Vicky details.xlsx");
	FileInputStream io=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(io);
	Sheet st = w.getSheet("Sheet1");
		Row r = st.getRow(rw);
		Cell c = r.getCell(cl);
		int cty = c.getCellType();
		if(cty==1)
		{
			value = c.getStringCellValue();
		}
		else if(cty==0)
		{
			if(DateUtil.isCellDateFormatted(c))
			{
		Date dd = c.getDateCellValue();
		SimpleDateFormat ss=new SimpleDateFormat();
		 value = ss.format(dd);
			}
			else
			{
		double l = c.getNumericCellValue();
		long d=(long)l;
		 value = String.valueOf(d);
			}
		}
		return value;}
	public static void launch(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public static void text(WebElement loc)
	{
	loc.sendKeys();
	}}


