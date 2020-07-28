package lv6_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class min_max {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		int[] intInputs = new int[n];
		String[] inputs;
		
		String input = reader.readLine();
		inputs = input.split(" ");
				
		for (int i = 0; i < intInputs.length; i ++ ) {
			intInputs[i] = Integer.parseInt(inputs[i]);
		}
		Arrays.sort(intInputs);
		System.out.println(intInputs[0]+" "+intInputs[intInputs.length-1]);
		
	}

}
