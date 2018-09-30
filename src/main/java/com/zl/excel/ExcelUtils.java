/**
 * 
 */
package com.zl.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author	zhanglei
 * @date	2018年8月23日
 * @Description	
 */
public class ExcelUtils {
	
	Workbook wb =null;
	Sheet sheet = null;
	
	
	public  Sheet initExcel(String sheetName, String title,String filePath) {
		InputStream in=null;
		try {
			in=new FileInputStream(filePath);
			if(wb!=null) {
				if(filePath.endsWith(".xls")) {
					wb=new HSSFWorkbook(in);
				}else if(filePath.endsWith(".xlsx")){
					wb=new XSSFWorkbook(in);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		sheet = wb.createSheet(sheetName);
		Row row1 = sheet.createRow(0);
		Cell cell = row1.createCell(0);
		// 样式设置
		XSSFCellStyle cellStyle = (XSSFCellStyle) wb.createCellStyle();
		XSSFFont font = (XSSFFont) wb.createFont();
		font.setBold(true);
		font.setFontHeightInPoints((short) 20);
		cellStyle.setFont(font);
		cellStyle.setAlignment(HorizontalAlignment.CENTER);// 居中
		cell.setCellStyle(cellStyle);
		cell.setCellValue(title);
		// 合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 6));
		return sheet;
	}
	
	
	public static void main(String[] args) {
		Date date = new Date();
	}
}
