package d200429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2071_평균값구하기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			double answer=0;
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " " );
			int size = st.countTokens();
			for(int i=0; i<size; i++) {
				answer+=Integer.parseInt(st.nextToken());
			}
			answer/=size;
			System.out.println("#"+test_case+" " + Math.round(answer));
		}
	}
}