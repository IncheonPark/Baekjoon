package lv3_for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UseBufferRepeatAddAB {

	 public static void main(String[] args) throws IOException {
		 try {
			 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		        
		        int t = Integer.parseInt(reader.readLine());
		        
		        //입력값 a와 b사이에 공백을 한 칸 두고 입력한다.
		        for (int i= 0; i < t; i++){
		            String input = reader.readLine();
		            String[] inputs = input.split(" ");
		        	
		        	int a = Integer.parseInt(inputs[0]);
		            int b = Integer.parseInt(inputs[1]);
		            int sum = a+b;
		            
		            writer.write(sum + "\n");
		            
		        }
		        writer.flush();
		        writer.close();
		 } catch(IOException e) {
			
		 }
		 
	 }
	 
}
