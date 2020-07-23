package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ArraysCompare {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length, compare;
		String [] inputs = reader.readLine().split(" ");
		 
		length = Integer.parseInt(inputs[0]);
		compare = Integer.parseInt(inputs[1]);
		String [] nums = new String [length];
		
		nums = reader.readLine().split(" ");
		
		for (String answer : nums) {
			int intAnswer = Integer.parseInt(answer);
			if (compare > intAnswer) {
				writer.write(answer+" ");
			}
		}
		writer.flush();
		writer.close();

	}

}
