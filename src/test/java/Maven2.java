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
public class Maven2 {
public static void main(String[] args) throws Throwable {
	File f=new File("C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\xl\\Vicky.xlsx");
	FileInputStream fs=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s = w.getSheet("Sheet1");
	for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	{
	Row r = s.getRow(i);
	for(int j=0;j<s.getPhysicalNumberOfRows();j++)
	{
	Cell c = r.getCell(j);
	int k = c.getCellType();
	if(k==1)
	{
		String cellValue = c.getStringCellValue();
		System.out.println(cellValue);
	}
	else if(k==0)
	{
		if (DateUtil.isCellDateFormatted(c)) {
             Date dateCell = c.getDateCellValue();
             SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
             String out = sim.format(dateCell);
             System.out.println(out);
		}
	}
	}
	
}}}
