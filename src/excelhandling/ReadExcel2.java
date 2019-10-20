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

public class ReadExcel2 {
	public static void main(String[] args) throws IOException {
		String filePath = "excelfolder/employeedetails.xlsx";
		File file = new File(filePath);
		System.out.println(file.getAbsolutePath());

		FileInputStream fis = new FileInputStream(file.getAbsolutePath());

		Workbook wb = null;
		if (file.getAbsolutePath().endsWith(".xls")) {
			wb = new HSSFWorkbook(fis);
		} else if (file.getAbsolutePath().endsWith(".xlsx")) {
			wb = new XSSFWorkbook(fis);
		} else {
			System.out.println("File Format not supported");
		}

		System.out.println(wb.getNumberOfSheets());

		for (int x = 0; x < wb.getNumberOfSheets(); x++) {
			System.out.println(wb.getSheetName(x));
		}

		for (int l = 0; l < wb.getNumberOfSheets(); l++) {
			Sheet sh = wb.getSheetAt(l);
			for (int x = 0; x <= sh.getLastRowNum(); x++) {
				Row row = sh.getRow(x);

				for (int y = 0; y < row.getLastCellNum(); y++) {
					Cell cell = row.getCell(y);
					System.out.print(cell.getStringCellValue());
					if (y != row.getLastCellNum() - 1) {
						System.out.print(" | ");
					}
				}
				System.out.println();
			}
		}

		wb.close();
	}
}
