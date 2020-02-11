package strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.ClassUtils;

public class StrategyContext {
	private static Map<String, Algorithm> map;
	static {
		List<Object> algorithms = null;
		try {
			algorithms = ClassUtils.getAllObjectByInterface(Algorithm.class);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		map = new HashMap<String, Algorithm>();
		for (int i = 0; i < algorithms.size(); i++) {
			Algorithm algorithm = (Algorithm) algorithms.get(i);
			String name = algorithm.getClass().getSimpleName();
			map.put(name, algorithm);
		}
	}

	private StrategyContext() {
	}

	public static String encry(String content, String algorithm) {
		return map.get(algorithm).encry(content);
	}

	public static String decry(String content, String algorithm) {
		return map.get(algorithm).decry(content);
	}
}
