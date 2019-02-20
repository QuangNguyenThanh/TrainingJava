package singletonpattern;

public class StaticBlock {
	private static StaticBlock instance;

	public StaticBlock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	static {
		try	{
			instance = new StaticBlock();
		} catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlock getInstance() {
		return instance;
	}
}
