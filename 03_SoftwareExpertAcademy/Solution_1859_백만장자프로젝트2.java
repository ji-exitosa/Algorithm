package d200406;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859_백만장자프로젝트2 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_1859.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int N;
		int max=0;
		int[] arr;
		long profit;
		for (int test_case = 1; test_case <= T; test_case++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			arr = new int[N];
			profit = 0;
			max=0;
			for (int n = 0 ; n < N; n++)
				arr[n] = Integer.parseInt(st.nextToken());
			
			for (int n = N-1; n>=0; n--){
				if(arr[n]>max)
					max = arr[n];
				else
					profit+=max-arr[n];
			}
			System.out.println("#" + test_case + " " + profit);
		}
	}

}
