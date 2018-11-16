package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritingProperties {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("config.properties",true);

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "root");
			prop.setProperty("dbpassword", "root");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	  }
}
