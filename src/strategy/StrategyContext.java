package strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.ClassUtils;

public class StrategyContext {
	private List<Object> algorithms;
	private Map<String, Algorithm> map;

	public StrategyContext() {
		try {
			algorithms = ClassUtils.getAllObjectByInterface(Algorithm.class);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		init();
	}

	private void init() {
		map = new HashMap<String, Algorithm>();
		for (int i = 0; i < algorithms.size(); i++) {
			Algorithm algorithm = (Algorithm) algorithms.get(i);
			String name = algorithm.getClass().getSimpleName();
			map.put(name, algorithm);
		}
	}

	public String encry(String content, String algorithm) {
		return map.get(algorithm).encry(content);
	}

	public String decry(String content, String algorithm) {
		return map.get(algorithm).decry(content);
	}
}
