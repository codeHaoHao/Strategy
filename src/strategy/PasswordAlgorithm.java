package strategy;

public class PasswordAlgorithm implements Algorithm{

	@Override
	public String encry(String content) {
		
		return "password algorithm encry";
	}

	@Override
	public String decry(String content) {
		
		return "password algorithm decry";
	}

}
