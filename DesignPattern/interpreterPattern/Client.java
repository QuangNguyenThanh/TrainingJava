package interpreterPattern;

public class Client {
	public static void main(String[] args) {
		System.out.println("20 cộng 8 = " + interpret("20 cộng 8"));
		System.out.println("10 trừ 4 = " + interpret("10 trừ 4"));
		System.out.println("10 nhân 4 = " + interpret("10 nhân 4"));
		System.out.println("10 chia 4 = " + interpret("10 chia 4"));
	}
	
	private static double interpret(String input) {
		Expression exp = null;
		if (input.contains("cộng")) {
			exp = new AddExpression(input);
		} else if (input.contains("trừ")) {
			exp = new SubtractExpression(input);
		} else if (input.contains("nhân")) {
			exp = new MultiplyExpression(input);
		} else if (input.contains("chia")) {
			exp = new DivideExpression(input);
		} else {
			throw new UnsupportedOperationException();
		}
		return exp.interpret(new InterpreterEngineContext());
	}
}
