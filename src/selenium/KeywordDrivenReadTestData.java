package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeywordDrivenReadTestData {

	public static Map<String,String> getDataSet(String testcasenumber) throws IOException {
		
		Map<String,String> dataset = new HashMap<String, String>();
		
		
		
		File file = new File("testdata//readdata1.xlsx");
		if(file.exists()) {
			
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheetAt(0);
			//sh = wb.getSheet("Sheet1");
			Row row = sh.getRow(0);
			int lastcolumn = row.getLastCellNum();
			
			for(int x = 0;x<lastcolumn;x++) {
				Cell cell = null;
				String cellvalue=null;
				try {
					cell = row.getCell(x);	
					cellvalue = cell.getStringCellValue();
				}catch(Exception e) {
					
				}
				
				if(cellvalue!=null && cellvalue.equalsIgnoreCase(testcasenumber)) {
					int header = x;
					int data = x+1;
					
					for(int y=1;y<sh.getLastRowNum();y++) {
						try {
							String h = sh.getRow(y).getCell(header).getStringCellValue();
							String d = sh.getRow(y).getCell(data).getStringCellValue();
							
							dataset.put(h, d);
						}catch(Exception e) {
							
						}
					}
					
					break;
				}
				
			}
			
			
			for (Map.Entry<String,String> entry : dataset.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue());
			
			
			
		}
		return dataset;

	}

}
