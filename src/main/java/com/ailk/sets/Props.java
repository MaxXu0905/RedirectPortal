package com.ailk.sets;

import java.io.InputStream;
import java.util.Properties;

/**
 * 获得属性文件中的内容
 */
public class Props {

	private static Properties properties = new Properties();

	public Props(String fileName) {
		try {
			InputStream is = Props.class.getClassLoader().getResourceAsStream(fileName);
			properties.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getPropertie(String key, String defVal) {
		String value = "";
		if ("".equals(key.trim())) {
			return value;
		}
		try {
			value = properties.getProperty(key, defVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value.trim();
	}
}
