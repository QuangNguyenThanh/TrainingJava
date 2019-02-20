package Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map;

public class DemoGetSystemProp {
	public static void main(String[] args) {
		//get system properties
		Properties prop = System.getProperties();
		Set set = prop.entrySet();
		//show system properties
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
