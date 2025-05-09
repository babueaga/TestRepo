package testPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestInt {
	static int sum = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		String file = "C:\\Users\\HP\\Downloads\\Automatics_Knowledge_Plan.xlsx";
		FileInputStream in = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int num = sheet.getLastRowNum();
		System.out.println(num);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
	}
}
