package d200429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1989_초심자의회문검사 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			String temp = br.readLine();
			int l = temp.length();
			int answer = 1;
			for(int i=0; i<=l/2; i++) {
				if(temp.charAt(i)!=temp.charAt(l-1-i))
					answer=0;
			}
			System.out.println("#"+test_case+" " +answer);
		}
	}
}
