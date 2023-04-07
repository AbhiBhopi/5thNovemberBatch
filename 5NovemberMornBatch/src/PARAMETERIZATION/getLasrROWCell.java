package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLasrROWCell {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Selenium Parameter\\DemoParameterization.xlsx");
		  int lastCellNumber = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getLastCellNum();
		System.out.println(lastCellNumber);

}
}