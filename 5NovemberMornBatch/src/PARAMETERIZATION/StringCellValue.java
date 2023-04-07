package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringCellValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Selenium Parameter\\DemoParameterization.xlsx");
		  String data = WorkbookFactory.create(file).getSheet("Sheet1")
		.getRow(3).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
		
		
	}

}
