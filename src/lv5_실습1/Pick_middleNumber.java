package lv5_실습1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pick_middleNumber {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String[] inputs = input.split(" ");
		int[] intInputs = new int[3];
		
		for (int i=0; i < 3; i ++) {
			intInputs[i] = Integer.parseInt(inputs[i]);
		}
		Arrays.sort(intInputs);
		System.out.println(intInputs[1]);
		
	}

}
