package d200504;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1986_지그재그숫자 {
	static int answer;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine());		
			answer = 0;
			for(int i=1; i<=N; i++) {
				if(i%2==0)
					answer-=i;
				else if(i%2==1)
					answer+=i;
			}
			
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
