package lv3_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintNumberFromOneToN {
	public static void main(String[] args) throws IOException {
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        
        for (int i=1; i <= n; i++) {
        	
            writer.write(i + "\n"); //"\n"을 넣어서 write메서드의 파라미터를 int가 아닌 String으로 받게 한다.
        }
        writer.flush();
        writer.close();
        } catch (IOException e) {
        	
        }
    } 

}
