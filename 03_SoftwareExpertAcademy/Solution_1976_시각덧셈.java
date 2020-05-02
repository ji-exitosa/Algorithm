package d200502;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1976_시각덧셈 {
	static int answer = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			st = new StringTokenizer(br.readLine()," ");
			int hour = Integer.parseInt(st.nextToken());
			int min = Integer.parseInt(st.nextToken());
		
			hour += Integer.parseInt(st.nextToken());
			min += Integer.parseInt(st.nextToken());
			
			if(min/60>=1) {
				hour++;
				min-=60;
			}
			
			if(hour/12>=1) {
				hour-=12;
			}
			System.out.println("#" + test_case + " " + hour + " " + min);
		}
	}
}