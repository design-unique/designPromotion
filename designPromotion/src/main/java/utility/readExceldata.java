package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExceldata {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	
	public static void readExcelData(String filepath, String Sheetname) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		
		workbook=new XSSFWorkbook(fis);
		
		sheet=workbook.getSheet(Sheetname);
		
	}
	
	public static String readcellValue(int Row, int Column)
	{
		cell=sheet.getRow(Row).getCell(Column);
		
		String readcellValue=cell.getStringCellValue();
		
		return readcellValue;
	}
	
	

}
