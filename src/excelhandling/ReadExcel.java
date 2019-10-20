package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		String filePath = "excelfolder/employeedetails.xlsx";
		File file = new File(filePath);
		System.out.println(file.getAbsolutePath());
		
		FileInputStream fis = new FileInputStream(file.getAbsolutePath());
		
		Workbook wb = null;
		if(file.getAbsolutePath().endsWith(".xls")) {
			wb = new HSSFWorkbook(fis);
		}else if(file.getAbsolutePath().endsWith(".xlsx")) {
			wb = new XSSFWorkbook(fis);
		}else {
			System.out.println("File Format not supported");
		}
		
		System.out.println(wb.getNumberOfSheets());
		
		for(int x=0;x<wb.getNumberOfSheets();x++) {
			System.out.println(wb.getSheetName(x));			
		}
		
		Sheet sh = wb.getSheet("details");
		
		Row row1 = sh.getRow(0);
		
		Cell cell1 = row1.getCell(0);
		
		//cell1.setCellType(CellType.STRING);
		
		String cellValue = cell1.getStringCellValue();
		
		System.out.println(cellValue);
		
		wb.close();
	}
}
