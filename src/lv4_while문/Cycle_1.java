package lv4_while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycle_1 {
	
	public static void main(String[] args) throws IOException { //문자열을 이용해 해결하는 방법
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int iTen, iOne, sum;
		int cycle = 1;
		String strSum;
		String input = reader.readLine();//1을 줌
		String firstInput;
		firstInput = input;
		//입력값 받고 한지리인지 두자리인지 판단
		//1의 자리 숫자 추출, 10의 자리 1의 자리 숫자 서로 더하고 더해서 나온 숫자를 다시 1의 자리 숫자 추출, 다시 서로 더하고 처음 값과 일치하는지 비교.
		//처음 input값이 변하다가 firstInput값과 일치하게 되면 break;
		
		while(true) {
			if (input.length() != 2 ) {
				input = "0"+input;
				}
			char one = input.charAt(1);
			iTen = Character.getNumericValue(input.charAt(0));
			iOne = Character.getNumericValue(input.charAt(1));
			sum = iTen + iOne;
			
			if(Integer.toString(sum).length() != 2) {
				strSum = "0"+sum;				
			} else {
				strSum = Integer.toString(sum);
			}
			
			input = one + Character.toString(strSum.charAt(1));
			
			//비교값이 "01"과 "1"일 떄 같은 값으로 판단시키기 위해 int형으로 변환.
			if (Integer.parseInt(input) == Integer.parseInt(firstInput)) { 
				break;
			}
			cycle ++;
		}
		System.out.println("cycle: "+cycle);
	}

}
