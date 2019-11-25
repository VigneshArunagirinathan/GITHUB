import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updt {
public static void main(String[] args) throws Throwable {
	File f=new File("C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\xl\\Vicky details.xlsx");
	FileInputStream fs=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fs);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell cel = r.getCell(2);
		System.out.println(cel);
		 Date dd = cel.getDateCellValue();
		 SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy");
		 String form = sf.format(dd);
	 
	System.out.println(form);
		if(form.equals("12-Jul-90"))
		{
			cel.setCellValue("11-MAY-19");
			FileOutputStream ff=new FileOutputStream(f);
			w.write(ff);
		}
		
		
		
		
		
}}