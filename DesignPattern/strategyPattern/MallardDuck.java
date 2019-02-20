package strategyPattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyRocketPowered();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
