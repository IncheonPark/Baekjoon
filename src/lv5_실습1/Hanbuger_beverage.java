package lv5_실습1;

import java.util.Scanner;

public class Hanbuger_beverage {
	
	public static void main(String[] args) {
		//1,2,3 햄버거 중 싼거, 4,5 음료수중 싼거 구해서 더하고 -50 실행.
		//Arrays.sort() 또는 Math.min을 쓰는 방법도 있다.
		Scanner sc = new Scanner(System.in);
		int[] inputs = new int[5];
		int burger, beverage;
		
		for (int i =0; i < 5; i++) {
			inputs[i] = sc.nextInt();
		}
		
		if (inputs[0] <= inputs[1] && inputs[0] <= inputs[2] ) {
			burger = inputs[0];
		} else if (inputs[1] <= inputs[0] && inputs[1] <= inputs[2]) {
			burger = inputs[1];
		} else {
			burger = inputs[2];
		}
		
		if (inputs[3] <= inputs[4]) {
			beverage = inputs[3];
		} else {
			beverage = inputs[4];
		}
		System.out.println(beverage + burger - 50);
		sc.close();
	}
	
}
