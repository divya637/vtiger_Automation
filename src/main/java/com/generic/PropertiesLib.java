package com.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesLib implements Auto_constant{
	
		
		public static String test1(String path,String key)throws Exception
		{
			Properties p=new Properties();
			p.load(new FileInputStream(Properties_path));
			String value=p.getProperty(key);
			System.out.println(value);
			return value;
		}
}
