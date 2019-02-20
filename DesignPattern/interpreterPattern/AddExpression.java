package interpreterPattern;

public class AddExpression implements Expression {

	private String expression;
	
	public AddExpression(String expression) {
		this.expression = expression;
	}
	
	@Override
	public double interpret(InterpreterEngineContext context) {
		// TODO Auto-generated method stub
		return context.add(expression);
	}
	
}
