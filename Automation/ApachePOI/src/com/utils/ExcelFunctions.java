package com.utils;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctions {
	
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	public void getExcelFile(String filePath, String sheetName) {
		
		try {
			workbook = new XSSFWorkbook(filePath);
			sheet = workbook.getSheet(sheetName);
		}
		catch (IOException e) {
			System.out.println("Error in fetching Excel file... ");
			e.printStackTrace();
		}
	}
	
	public void getCellData(int rownum, int colnum) {
		
		try {
			row = sheet.getRow(rownum);
			cell = row.getCell(colnum);
			if(cell == null){
				System.out.println("No data to fetch at provided Row and Column number...");
			}
			else{
				String cellData = cell.getStringCellValue();
				System.out.println(cellData);
			}
		}
		catch (NullPointerException e) {
			System.out.println("Error in getting cell data from Excel file...");
			//e.printStackTrace();
		}
	}
	
	public void getRowData() {
		
	}
	
	public void setCellData(String result, int rownum, int colnum) {
		
		try {
			
			if(sheet.getRow(rownum) == null){
				row = sheet.createRow(rownum);
			}
			//row = sheet.getRow(rownum);
			System.out.println(row);
			cell = row.getCell(colnum);
			//System.out.println(row.getCell(2));
			System.out.println("Before IF");
			if(cell == null){
				System.out.println(cell);
				cell = row.createCell(colnum);
				System.out.println(cell);
				cell.setCellValue(result);
				System.out.println("IF Ended");
			}
			else{
				System.out.println("Date already exists at provided Row and Column number, hence cannot override...");
			}
			System.out.println();
			FileOutputStream fw = new FileOutputStream("D:\\Workspace\\TestData.xlsx");
			workbook.write(fw);
			fw.flush();
			workbook.close();
			fw.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ExcelFunctions obj = new ExcelFunctions();
		obj.getExcelFile("D:\\Workspace\\TestData.xlsx", "Sheet1");
		//obj.getCellData(9, 0);
		obj.setCellData("Bhavesh", 9, 0);
	}
}
