package interpreterPattern;

public class MultiplyExpression implements Expression{
	private String expression;
	
	public MultiplyExpression(String expression) {
		this.expression = expression;
	}
	@Override
	public double interpret(InterpreterEngineContext context) {
		// TODO Auto-generated method stub
		return context.multiply(expression);
	}

}
