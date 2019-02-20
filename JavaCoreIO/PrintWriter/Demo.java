package PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;

public class Demo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(System.out, true);
		long start = System.nanoTime();
		pw.println("Nguyen");
		long start1 = System.nanoTime();
		pw.println("Thanh");
		long start2 = System.nanoTime();
		pw.println("Quang");
		long end = System.nanoTime();
		pw.println("Step 1: " + (start1 - start));
		pw.println("Step 2: " + (start2 - start1));
		pw.println("Step 3: " + (end - start2));
		pw.println("Runtime: " + (end - start));
		pw.close();
		
		PrintWriter pw1 = new PrintWriter(System.err);
		long start_1 = System.nanoTime();
		pw1.println("Nguyen");
		long start1_1 = System.nanoTime();
		pw1.println("Thanh");
		long start2_1 = System.nanoTime();
		pw1.println("Quang");
		long end_1 = System.nanoTime();
		pw1.println("Step 1: " + (start1_1 - start_1));
		pw1.println("Step 2: " + (start2_1 - start1_1));
		pw1.println("Step 3: " + (end_1 - start2_1));
		pw1.println("Runtime: " + (end_1 - start_1));
		pw1.close();
	}
}
