package d200417;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9229_한빈이와spotmart {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_9229.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		int N, M;
		int weights[];
		for(int test_case = 1; test_case<=T; test_case++) {
			st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			weights = new int [N];
			st = new StringTokenizer(br.readLine()," ");
			int max = -1;
			int temp;
			for(int n=0; n<N; n++) 
				weights[n] = Integer.parseInt(st.nextToken());
			
			for(int i=0; i<N-1; i++) {
				for(int j=i+1;j<N;j++) {
					temp = weights[i]+weights[j];
					if(temp<=M && max<temp)
						max = temp;
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}
}
