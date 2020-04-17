package d200417;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_8931_제로 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_8931.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		Stack <Integer> stack= new Stack<Integer>();
		int input;
		int sum;
		int K;
		for(int test_case = 1; test_case<=T; test_case++) {
			sum = 0;
			K = Integer.parseInt(br.readLine());
			for(int k=0; k<K; k++) {
				input = Integer.parseInt(br.readLine());
				if(input != 0) 
					stack.push(input);
				else 
					stack.pop();	
			}
			while(!stack.isEmpty()) {
				sum+=stack.pop();
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
// import 
// ctrl+shift+o
}
