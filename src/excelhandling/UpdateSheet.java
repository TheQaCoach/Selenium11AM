package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateSheet {

	public static void main(String[] args) throws Exception {
		
		
		for(int x=1;x<=10;x++) {
			if(x%2==0)
			{
				updateSheet("TC_"+x, "TC_Summary_"+x, "TC_Description_"+x, "TC_Steps_"+x, "PASS", "C://xyz", "This test case is passed");
			}else
			{
				updateSheet("TC_"+x, "TC_Summary_"+x, "TC_Description_"+x, "TC_Steps_"+x, "FAIL", "D://xyz", "This test case is Failed");
			}
		}
		
		
	}
	
	
	
	public static void updateSheet(String sr,String summary,String description,String steps,String status,String screenshot,String remarks) throws Exception {
		String filePath = "excelfolder/testcase.xlsx";
		File file = new File(filePath);
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = null;
		
		if(filePath.endsWith(".xlsx")) {
			wb = new XSSFWorkbook(fis);
		}else if(filePath.endsWith(".xls")){
			wb = new HSSFWorkbook(fis);
		}else {
			System.out.println("File format not supported!");
		}
		
		Sheet sh = wb.getSheet("Tests");
		
		Row row = sh.createRow(sh.getLastRowNum()+1);

		row.createCell(0).setCellValue(sr);
		row.createCell(1).setCellValue(summary);
		row.createCell(2).setCellValue(description);
		row.createCell(3).setCellValue(steps);
		row.createCell(4).setCellValue(status);
		row.createCell(5).setCellValue(screenshot);
		row.createCell(6).setCellValue(remarks);
		
		
		
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		sh.autoSizeColumn(2);
		sh.autoSizeColumn(3);
		sh.autoSizeColumn(4);
		sh.autoSizeColumn(5);
		sh.autoSizeColumn(6);
		
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		wb.close();
		
	}
	
	
	
}
