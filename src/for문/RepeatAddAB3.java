package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RepeatAddAB3 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t,a,b,sum;
		t = Integer.parseInt(reader.readLine());
		for (int i=1; i <= t; i++) {
			String input = reader.readLine();
			String[] inputs = input.split(" ");
			
			a = Integer.parseInt(inputs[0]);
			b = Integer.parseInt(inputs[1]);
			sum = a+b;
			
			writer.write("Case #" + i +": "+ a +" + "+ b + " = "+ sum + "\n");
			
		} 
		writer.flush();
		writer.close();
	}

}
