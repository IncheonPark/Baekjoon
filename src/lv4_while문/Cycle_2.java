package lv4_while문;

import java.util.Scanner;

public class Cycle_2 {
	
	public static void main(String[] args) { //문자열을 사용하지 않고 식으로만 해결하는 방법
		
		int N, temp =0;
		int a, b = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //26
		temp = N; //26
		do {
			a = temp % 10; //6 일의자리 수 구하고
			b = temp / 10 + a; //2+6 십자리랑 1자리랑 더하고
			b %= 10; //0
			temp = a * 10 + b; //68 --- 일자리 십자리로 보내고6  1자리에 더한수의 1의자리 넣고8
			result++;
		} while (N != temp);
		
		System.out.println(result);
		sc.close();
	}
}
