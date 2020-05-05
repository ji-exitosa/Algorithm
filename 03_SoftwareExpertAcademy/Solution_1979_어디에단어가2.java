package d200504;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1979_어디에단어가2 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1979.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N=Integer.parseInt(st.nextToken());
			int K=Integer.parseInt(st.nextToken());
			int answer = 0;
			int arry[] = new int[N];
			for(int n=0; n<N; n++) {	
				int x=0;
				st = new StringTokenizer(br.readLine()," ");
				for(int m=0; m<N; m++) {
					if(Integer.parseInt(st.nextToken())==1){
						++x;
						++arry[m];
					}else {
						arry[m]=0;
						x=0;
					}
					if(x==K) answer++;
					if(arry[m]==K) answer++;
					if(x==K+1)  answer--;
					if(arry[m]==K+1)  answer--;
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
