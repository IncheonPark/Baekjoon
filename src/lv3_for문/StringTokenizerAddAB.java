package lv3_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class StringTokenizerAddAB {
    public static void main(String args[]) throws IOException {
    	
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int cnt, a, b;
	    cnt = Integer.parseInt(bf.readLine());
	    
	    for(int i=1; i<=cnt ; i++) {
	    	StringTokenizer st = new StringTokenizer(bf.readLine()); //스트링 토크나이저도 입력할 때 사이에 공백 넣어야 한다.

	    		a = Integer.parseInt(st.nextToken());
	    		b = Integer.parseInt(st.nextToken());
	    		
	    		bw.write("Case #" + (i) + ": " + a + " + " + b + " = " + (a+b)+"\n");		

	    }
	    bw.flush();
	    bw.close();
    }
}