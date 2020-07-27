package lv3_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStars {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t;
        String answer = "";
        String br = "\n";
        t = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= t; i++) {
        	//쓰고 출력하고 다시 덧쓰고 반복
        	answer += "*";
        	writer.write(answer);
        	writer.write(br);
        }
        	writer.flush();
        	writer.close();
	}

}
