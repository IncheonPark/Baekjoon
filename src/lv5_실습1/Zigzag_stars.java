package lv5_실습1;

import java.util.Scanner;

public class Zigzag_stars {
	
	public static void main(String[] args) {
		//홀수 번째 줄하고 짝수 번째 줄이 따로 있는것 같다.
		//홀수 타임일 떄는 홀수 값에 " *"추가
		//짝수 타임일 떄는 짝수 값에 " *"추가
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String oddNum = "*";
		String evenNum = "";
		
		if (input == 1) {
			System.out.println(oddNum);
			
		} else if (input >= 2) {
			
			for (int x=2; x <= input; x ++) {
				if (x % 2 != 0) {
					oddNum += " *";
				} else {
					evenNum += " *";
				}
			}
			
			for (int i = 0; i < input; i ++) {
				System.out.println(oddNum);
				System.out.println(evenNum);
			}
		}
	}

}
