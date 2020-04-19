package d200419;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8658_Summation {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_8658.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			st = new StringTokenizer(br.readLine()," ");
			int num = st.countTokens();
			for(int i=0; i<num; i++) {
				int tempI=0;
				String temp = st.nextToken();				
				for(int t = 0; t < temp.length(); t++) {
					tempI += temp.charAt(t)-'0';
				}
				if(tempI>max)
					max = tempI;
				if(tempI<min)
					min = tempI;
			}
			System.out.println("#" + test_case + " " + max + " " + min);
		}
	}
}
