package adapterpattern;

public class Adapter implements PhoneTarget {
	CheckNumberAdaptee checkNumberAdaptee = new CheckNumberAdaptee();
	
	@Override
	public boolean checkPhoneNumber(String input) {
		// TODO Auto-generated method stub
		if (!checkNumberAdaptee.checkNumber(input)) {
			return false;
		}
		
		if (input.length() > 11 || input.length() < 10) {
			return false;
		}
		
		return true;
	}
	
}
