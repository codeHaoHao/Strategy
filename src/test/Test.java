package test;

import java.io.IOException;
import strategy.StrategyContext;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println(StrategyContext.encry("sfsdf", "PasswordAlgorithm"));
		System.out.println(StrategyContext.decry("sada", "RedisKeyAlgorithm"));
	}
}
