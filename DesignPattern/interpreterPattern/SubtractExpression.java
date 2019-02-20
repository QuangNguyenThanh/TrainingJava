package interpreterPattern;

public class SubtractExpression implements Expression {

	private String expression;
	
	public SubtractExpression(String expression) {
		this.expression = expression;
	}
	
	@Override
	public double interpret(InterpreterEngineContext context) {
		// TODO Auto-generated method stub
		return context.subtract(expression);
	}
}
