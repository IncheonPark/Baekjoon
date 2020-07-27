package lv5_실습1;

import java.util.Scanner;

public class Average_Score_up40_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] inputs = new int[5];
		int sum = 0;
		
		for (int i =0; i < inputs.length; i ++) {
			inputs[i] = sc.nextInt();
			if (inputs[i] <= 40 ) {
				inputs[i] = 40;
			} sum += inputs[i];
		}
		System.out.println(sum/5);
	}

}
