package com.cg.conferenceRegistration;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties{
	static Properties properties = new Properties();
	public static void readProperties() {
		
		try {
			InputStream is = new FileInputStream(
					"C:\\Shruthi\\conferenceRegistrationApplication\\src\\main\\java\\configure.properties");
			properties.load(is);
			System.out.println(properties.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
