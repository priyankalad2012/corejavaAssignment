package Guru99;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileReader {

	
	
	String sheetPath="E:\\Guru99Day3Task_parama_Login.xlsx";
	String sheetName ="day3";
	
	
	public fileReader(String sheetPath, String sheetName) {
		// TODO Auto-generated constructor stub
		
		
		this.sheetPath=sheetPath;
		this.sheetName=sheetName;
	}

	public int rowCount() {
		
		int row=0;
		try (XSSFWorkbook workbook = new XSSFWorkbook(sheetPath)) {
			XSSFSheet sheet = workbook.getSheet(sheetName);
			row=sheet.getPhysicalNumberOfRows();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		return row;
	}
	
public int colCount() {
		
		int col=0;
		try (XSSFWorkbook workbook = new XSSFWorkbook(sheetPath)) {
			XSSFSheet sheet = workbook.getSheet(sheetName);
			col=sheet.getRow(0).getPhysicalNumberOfCells();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		return col;
	}


public String getdata(int row,int col) {
	
	String data=null;
	try (XSSFWorkbook workbook = new XSSFWorkbook(sheetPath)) {
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		data=sheet.getRow(row).getCell(col).getStringCellValue();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
	
	return data;
}
}
