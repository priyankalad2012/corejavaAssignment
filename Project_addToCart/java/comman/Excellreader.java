package comman;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellreader {
	String sheetpath;
	String sheetName;
	public Excellreader(String sheetpath, String sheetName) {
		super();
		this.sheetpath = sheetpath;
		this.sheetName = sheetName;
	}
	public int rowCount() {
		int row=0;
		try {
			XSSFWorkbook workbook= new XSSFWorkbook(sheetpath);
			
			XSSFSheet sheet=workbook.getSheet(sheetName);
			row=sheet.getPhysicalNumberOfRows();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}
	
	public int colCount() {
		int col=0;
		try {
			XSSFWorkbook workbook= new XSSFWorkbook(sheetpath);
			
			XSSFSheet sheet=workbook.getSheet(sheetName);
			col=sheet.getRow(0).getPhysicalNumberOfCells();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return col;
	}
	
	public String Getdata(int row, int col)
	{
		String data=null;
		try {
			XSSFWorkbook workbook= new XSSFWorkbook(sheetpath);
			
			XSSFSheet sheet=workbook.getSheet(sheetName);
			data=sheet.getRow(row).getCell(col).getStringCellValue();	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
}
