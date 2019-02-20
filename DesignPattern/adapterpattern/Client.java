package adapterpattern;

public class Client {
	public static void main(String[] args) {
		PhoneTarget phoneTarget = new Adapter();
		String input1 = "sljlwqfjwl;";
		String input2 = "123";
		String input3 = "0765616889";
		System.out.println(input1 + " is phone number: " + phoneTarget.checkPhoneNumber(input1));
		System.out.println(input2 + " is phone number: " + phoneTarget.checkPhoneNumber(input2));
		System.out.println(input3 + " is phone number: " + phoneTarget.checkPhoneNumber(input3));
	}
}
