package lv3_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStarsRightside {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int time;
        String answer = "";
        String blank = "";
        String br = "\n";
        time = Integer.parseInt(reader.readLine());
        int subTime = time-1;
      
        	//쓰고 출력하고 다시 덧쓰고 반복
        	//공백 " "을 time-1개부터 time-(time-1)개 까지 반복입력
        	 while (subTime >= 0 ) {
        		for (int subTime2 = subTime; subTime2 > 0; subTime2--) {
            		blank += " ";
            	} 
        		writer.write(blank);
        		blank = ""; //blank write하고 값 초기화
        		answer += "*";
        		writer.write(answer);
        		writer.write(br);
        		subTime --;
        	}
        
        	writer.flush();
        	writer.close();
	}

}
