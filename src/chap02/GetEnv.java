package chap02;

import java.util.Map;
import java.util.Set;

public class GetEnv {
	public static void main(String[] args) {
		Map<String, String> envMap = System.getenv();
		Set<String> keys = envMap.keySet();
		for (String key : keys) {
			String curkey = key;
			System.out.format("%s = %s\n", curkey, envMap.get(curkey));
		}
	}
}
