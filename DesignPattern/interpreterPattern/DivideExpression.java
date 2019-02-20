package interpreterPattern;

public class DivideExpression implements Expression {
	private String expression;
	
	public DivideExpression(String expression) {
		this.expression = expression;
	}
	
	@Override
	public double interpret(InterpreterEngineContext context) {
		// TODO Auto-generated method stub
		return context.divide(expression);
	}

}
