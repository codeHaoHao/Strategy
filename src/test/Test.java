package test;

import java.io.IOException;
import strategy.StrategyContext;

public class Test {
	public static void main(String[] args) throws IOException {
		StrategyContext context = new StrategyContext();
		System.out.println(context.encry("sfsdf", "PasswordAlgorithm"));
		System.out.println(context.decry("sada", "RedisKeyAlgorithm"));
	}
}
