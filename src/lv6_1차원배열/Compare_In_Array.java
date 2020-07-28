package lv6_1차원배열;

import java.util.Scanner;

public class Compare_In_Array {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputs = new int[10];
		int count = 0;
		int compare;
		
		/*int[] arrResult = new int[42]; 나눌 수가 길이인 배열을 생성하고 n%42의 나머지를 arrResult의 인덱스로 삼았다. (0~41까지 생성) 
        int temp;
        while(br.ready()) {
            temp = Integer.parseInt(br.readLine());
            arrResult[temp%42]++; 
        }*/
		for (int i = 0; i < 10; i ++) {
			inputs[i] = sc.nextInt()%42;
		}
		for (int i = 0; i < inputs.length; i ++) {
			
			if( inputs[i] < 0) {
				continue;
			} else {
				count ++;
				compare = inputs[i];
				for (int j = 0; j < inputs.length; j ++) {
					
					if (compare == inputs[j]) {
						inputs[j] = -1;
					}
						
				}
			}
		
		}
			System.out.println(count);
			sc.close();
	}

}
