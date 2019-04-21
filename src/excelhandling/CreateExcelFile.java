package excelhandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {

	public static void main(String[] args) throws IOException {

		String filePath = "excelfolder/testcase.xlsx";
		File file = new File(filePath);
		
		Workbook wb = null;
		
		if(filePath.endsWith(".xlsx")) {
			wb = new XSSFWorkbook();
		}else if(filePath.endsWith(".xls")){
			wb = new HSSFWorkbook();
		}else {
			System.out.println("File format not supported!");
		}
		
		Sheet sh = wb.createSheet("Tests");
		
		Font font = wb.createFont();
		font.setFontName("Times New Roman");
		font.setBold(true);
		font.setColor(IndexedColors.WHITE.getIndex());

		CellStyle cs = wb.createCellStyle();
		cs.setFont(font);
		cs.setFillBackgroundColor(IndexedColors.RED.index);
		cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		Row row0 = sh.createRow(0);
		Cell cell0 = row0.createCell(0);
		cell0.setCellStyle(cs);
		Cell cell1 = row0.createCell(1);
		cell1.setCellStyle(cs);
		Cell cell2 = row0.createCell(2);
		cell2.setCellStyle(cs);
		Cell cell3 = row0.createCell(3);
		cell3.setCellStyle(cs);
		Cell cell4 = row0.createCell(4);
		cell4.setCellStyle(cs);
		Cell cell5 = row0.createCell(5);
		cell5.setCellStyle(cs);
		Cell cell6 = row0.createCell(6);
		cell6.setCellStyle(cs);
		
		cell0.setCellValue("Sr. #");
		cell1.setCellValue("Summary");
		cell2.setCellValue("Description");
		cell3.setCellValue("Steps");
		cell4.setCellValue("Status");
		cell5.setCellValue("Screenshot");
		cell6.setCellValue("Remarks");
		
		
		
		
		
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		wb.close();
		
	}

}
