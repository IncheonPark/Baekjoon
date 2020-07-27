package lv5_실습1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average_Score_up40 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] intInputs = new int[5];
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			intInputs[i] = Integer.parseInt(reader.readLine());
			if (intInputs[i] <= 40 ) {
				intInputs[i] = 40;
			} sum += intInputs[i];
		} System.out.println(sum/5);
		
	}

}
