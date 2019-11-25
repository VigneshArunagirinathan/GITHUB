import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mavenupdt {
public static void main(String[] args) throws Throwable {
	File loc=new File("C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\xl\\Vicky details.xlsx");
	FileInputStream fs=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(1);
	Cell c = r.getCell(2);
	Date dateCellValue = c.getDateCellValue();
SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
String form = sim.format(dateCellValue);
	System.out.println(form);	
	/*if(form.equals("12-MAR-90"))
	{
		c.setCellValue("12-MAY-90");
}
	FileOutputStream o=new FileOutputStream(loc);
	w.write(o);
	System.out.println("updated succes");*/
	
	
	

	
}
}
