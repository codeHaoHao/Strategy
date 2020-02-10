package strategy;

public class SessionAlgorithm implements Algorithm{

	@Override
	public String encry(String content) {
		return "session algorithm encry";
	}

	@Override
	public String decry(String content) {
		return "session algorithm decry";
	}

}
