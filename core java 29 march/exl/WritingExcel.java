package exl;

import java.util.*;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class WritingExcel {	
	
	public static void main(String[] args)  throws Exception
	{  
		    List<Student> studentList = new ArrayList<Student>();		 
		 	studentList.add(new Student("Magneto","90","100","80"));		 
		 	studentList.add(new Student("Wolverine","60","60","90"));		 
		 	studentList.add(new Student("Prof","100","100","100"));
		 	studentList.add(new Student("Asst_Prof1","400","300","100"));
		 
		 	writeStudentsListToExcel(studentList);
	}
	
	public static void writeStudentsListToExcel(List<Student> studentList) throws Exception
	{ 		 
			  Workbook workbook = new XSSFWorkbook(); 
			  Sheet studentsSheet = workbook.createSheet("Students"); 
			   int rowIndex = 0; 
			   for(Student student : studentList){ 
			            Row row = studentsSheet.createRow(rowIndex++); 
			            int cellIndex = 0; 
			            row.createCell(cellIndex++).setCellValue(student.getName());  
			            row.createCell(cellIndex++).setCellValue(student.getMaths());  
			            row.createCell(cellIndex++).setCellValue(student.getScience());  
			            row.createCell(cellIndex++).setCellValue(student.getEnglish()); 
			        }
			    
			   File excel = new File("D:\\Excel\\Employee_3.xlsx");			        	
			   FileOutputStream fos = new FileOutputStream(excel,true); 
			   
			   workbook.write(fos); 
			   fos.close(); 
			   workbook.close();
			   System.out.println("FILE is successfully written"); 
	}	        		       
			        		 
}  