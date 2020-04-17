package d200415;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_8821_적고지우기 {

	static int answer = 0;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_8821.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			answer = 0;
			String input = br.readLine();
			int length = input.length();
			int checker =0;
			int thisNum;
			for(int i=0; i<length; i++) {
				thisNum = input.charAt(i)-'0';
				if((checker & (1 << thisNum )) == 0){
					answer++;
					checker = checker | (1<<thisNum);
					//System.out.println(checker);
				}else{
					answer--;
					checker = checker & ~(1<<thisNum);
					//System.out.println(checker);
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
// import 
// ctrl+shift+o
}
