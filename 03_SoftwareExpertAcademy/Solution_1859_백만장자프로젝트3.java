package d200406;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859_백만장자프로젝트3 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_1859.txt"));BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[N];
			long profit = 0;
			for (int n = 0 ; n < N; n++)
				arr[n] = Integer.parseInt(st.nextToken());
			int max=0;
			int[] newarr = new int[N];
			for (int n = N-1; n>=0; n--){
				max = Math.max(max, arr[n]);
				newarr[n] = max;
			}
			for (int n=0; n<N; n++) {
				if(newarr[n]>arr[n])
					profit += newarr[n]-arr[n];
			}
			System.out.println("#" + test_case + " " + profit);
		}
	}
}
