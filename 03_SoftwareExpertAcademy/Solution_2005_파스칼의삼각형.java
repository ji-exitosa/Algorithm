package d200408;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2005_파스칼의삼각형 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_2005.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][];
			
			for(int i=0; i<N; i++) {
				arr[i] = new int[i+1];
				for(int j=0; j<=i; j++) {
					if(j==0||j==i)
						arr[i][j] = 1;
					else
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
			System.out.println("#" + test_case);
			for(int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
