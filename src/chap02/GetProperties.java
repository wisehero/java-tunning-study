package chap02;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GetProperties {
	public static void main(String[] args) {
		System.setProperty("JavaTuning", "Tune Lee");
		Properties properties = System.getProperties();
		Set<Object> keys = properties.keySet();

		for (Object key : keys) {
			String curKey = key.toString();
			System.out.format("%s=%s\n", curKey, properties.getProperty(curKey));
		}
	}
}
