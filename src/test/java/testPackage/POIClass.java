package testPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIClass {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		String filePath = "C:\\Users\\HP\\Desktop\\Automatics_Knowledge_Plan.xlsx";
	
		try {
			in = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowNum = sh.getLastRowNum();
		System.out.println(rowNum);
		Row row = sh.getRow(1);
		Cell cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		Row createRow = sh.createRow(rowNum+1);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("babu");
		FileOutputStream out = new FileOutputStream(filePath);
		wb.write(out);
		out.close();
		
		wb.close();
		
	}

}
