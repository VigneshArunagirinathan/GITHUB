import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Maven4{
	public static String getData(int rw,int cl) throws Throwable {
		String value=null;
		File f=new File("C:\\Users\\vignesh\\eclipse-workspace\\Vignesh\\Maven1st\\xl\\Vicky details.xlsx");
		FileInputStream fs=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fs);
		Sheet s = w.getSheet("Sheet1");
//		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	//	{
		Row r = s.getRow(rw);
		//for(int j=0;j<s.getPhysicalNumberOfRows();j++)
		//{
		Cell c = r.getCell(cl);
		int k = c.getCellType();
		if(k==1)
		{
			String Value = c.getStringCellValue();
		//	System.out.println(cellValue);
		}
		else if(k==0)
		{
			if (DateUtil.isCellDateFormatted(c)) {
	             Date dateCell = c.getDateCellValue();
	             SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
	              value = sim.format(dateCell);
	      //       System.out.println(out);
			}
			else		{
				double nc = c.getNumericCellValue();
				long ll=(long)nc;
				 value = String.valueOf(ll);
			}
}
		return value;}

}