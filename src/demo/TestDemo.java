package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void testA() throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		String value = w.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(value);
		
		
	}

}
