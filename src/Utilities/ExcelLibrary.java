package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
public static String FetchStringData
			(String sheetName,int rowNum,int cellNum) throws Exception
{
File f=new File(Constants.FILEPATH);
FileInputStream fis=new FileInputStream(f);
Workbook wb=WorkbookFactory.create(fis);
String data=wb.getSheet(sheetName).getRow(rowNum)
					.getCell(cellNum).getStringCellValue();
return data;
}
public static double FetchNumericData
				(String sheetName,int rowNum,int cellNum) throws Exception
{
File f=new File(Constants.FILEPATH);
FileInputStream fis=new FileInputStream(f);
Workbook wb=WorkbookFactory.create(fis);
double data=wb.getSheet(sheetName).getRow(rowNum)
				.getCell(cellNum).getNumericCellValue();
return data;
}
}





