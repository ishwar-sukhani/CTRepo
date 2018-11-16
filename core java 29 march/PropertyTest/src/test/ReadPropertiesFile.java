package test;

import java.io.*;
import java.util.*;

public class ReadPropertiesFile {

	public static void main(String[] args) {
		try {
			File file = new File("db.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			
			
			String driverName = properties.getProperty("driver");
			System.out.println("Driver " + ": " + driverName);

			/*Enumeration enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				System.out.println(key + ": " + value);
			}*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
