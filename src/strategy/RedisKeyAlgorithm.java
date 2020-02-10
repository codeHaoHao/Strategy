package strategy;

public class RedisKeyAlgorithm implements Algorithm{

	@Override
	public String encry(String content) {
		
		return "redis key algorithm encry";
	}

	@Override
	public String decry(String content) {
		
		return "redis key algorithm decry";
	}

}
