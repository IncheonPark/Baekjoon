package if문;

import java.util.Scanner;

public class Alarm45mEarly {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h, m ;
        
        h = sc.nextInt();
        m = sc.nextInt();
        
        if (m >= 45) {
            m = m - 45;
            
            System.out.println(h);
            System.out.println(m);
            
        } else if (m < 45) {
            if ( h == 0) {
                h = h + 24 -1;
                m = m + 60 - 45;
                
               System.out.println(h);
                System.out.println(m);
            } else {
                h = h-1;
                m = m + 60 - 45;
                
                System.out.println(h);
                System.out.println(m);
            } 
        }
    }

}
