package while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Add_AB_5 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a, b;
		String[] input;
		
		input = reader.readLine().split(" ");
		a = Integer.parseInt(input[0]);
		b = Integer.parseInt(input[1]);
		
		while (a+b != 0) {
			
			if (a > 0 && a < 10) {
				if (b > 0 && b < 10) {
					writer.write((a+b)+"\n");
				}
			}
			
			input = reader.readLine().split(" ");
			a = Integer.parseInt(input[0]);
			b = Integer.parseInt(input[1]);
		}
		
		writer.flush();
		writer.close();
	}

}
