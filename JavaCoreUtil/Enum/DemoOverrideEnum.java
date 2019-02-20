package Enum;

public class DemoOverrideEnum {
	enum Color {
		RED("red") {
			@Override
			public String getHexCode() {
				// TODO Auto-generated method stub
				return "#ff0000";
			}
		},
		GREEN("green") {
			@Override
			public String getHexCode() {
				// TODO Auto-generated method stub
				return "#00ff00";
			}
		},
		BLUE("blue") {
			@Override
			public String getHexCode() {
				// TODO Auto-generated method stub
				return "#0000ff";
			}
		};
		
		private String name;
		
		Color(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public abstract String getHexCode();
	}
	
	public static void main(String[] args) {
		System.out.println("RED: " + Color.RED.getHexCode());
		System.out.println("GREEN: " + Color.GREEN.getHexCode());
		System.out.println("BLUE: " + Color.BLUE.getHexCode());
	}
}
