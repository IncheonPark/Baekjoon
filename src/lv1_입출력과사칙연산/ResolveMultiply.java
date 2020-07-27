package lv1_입출력과사칙연산;

import java.util.Scanner;

public class ResolveMultiply {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        int one, ten, hund;
        String tempB;
        int aTimesOne, aTimesTen, aTimesHund;
        
        //a와 b는 세자리의 자연수로 입력한다.
        a = sc.nextInt();
        b = sc.nextInt();
        
        tempB = Integer.toString(b); 
        one = Integer.parseInt(tempB.substring(2));
        ten = Integer.parseInt(tempB.substring(1,2));
        hund = Integer.parseInt(tempB.substring(0,1));
        
        aTimesOne = a * one;
        aTimesTen = a * ten;
        aTimesHund = a * hund;
        
        System.out.println(aTimesOne);
        System.out.println(aTimesTen);
        System.out.println(aTimesHund);
        System.out.println(aTimesOne + (aTimesTen*10) + (aTimesHund*100));
        
        sc.close();
    }

}
