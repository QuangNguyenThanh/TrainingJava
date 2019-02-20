package interpreterPattern;

public class InterpreterEngineContext {
	public int add(String input) {
		String[] tokens = interpret(input);
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		return (num1 + num2);
	}
	
	public int subtract(String input) {
		String[] tokens = interpret(input);
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		return (num1 - num2);
	}
	
	public int multiply(String input) {
		String[] tokens = interpret(input);
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		return (num1 * num2);
	}
	
	public double divide(String input) {
		String[] tokens = interpret(input);
		double num1 = Double.parseDouble(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		if (num2 == 0) 
			return -1;
		return (num1 / num2);
	}
	
	private String[] interpret(String input) {
		String str = input.replaceAll("[^0-9]", " ");
		str = str.replaceAll("( )+", " ").trim();
		return str.split(" ");
	}
}