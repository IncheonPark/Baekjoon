package lv4_while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add_AB_6 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		String answer = "";
		String[] inputs;
		
		//!((input = reader.readLine()).trim().isEmpty()) - null말고 공백 비교할 떄 쓰는 조건
		while ((input = reader.readLine()) != null) { 
			inputs = input.split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			answer += ((a+b)+"\n");
			
		}
		System.out.print(answer);
	}

}
