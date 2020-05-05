package d200504;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1984_중간평균값구하기 {
	static int answer;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1984.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		int temp;
		for(int test_case = 1; test_case<=T; test_case++) {
			st = new StringTokenizer(br.readLine()," ");
			answer = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i=0; i<10; i++) {
				temp = Integer.parseInt(st.nextToken());
				answer+=temp;
				if(max<temp)
					max = temp;
				if(min>temp)
					min = temp;
			}
			answer=(int) Math.round((answer-max-min)/8.0);
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
