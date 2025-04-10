package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.constants;

public class FetchDataFromExcel {
	
	public static String getURL(int x, int y) throws IOException {
		
		FileInputStream fs = new FileInputStream(constants.URLvalue);
		
		try (XSSFWorkbook workbook = new XSSFWorkbook(fs)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			XSSFCell cellvalue = sheet.getRow(x).getCell(y);
			String URL = cellvalue.toString();
			return URL;
		}
	}

}
