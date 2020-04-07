package d200406;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859_백만장자프로젝트 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_1859.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int N;
		int max;
		int maxIdx;
		int start;
		int[] arr;
		long profit;
		for (int test_case = 1; test_case <= T; test_case++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			arr = new int[N];
			start = 0;
			profit = 0;
			max = 0;
			maxIdx = 0;
			for (int n = start; n < N; n++) {
				arr[n] = Integer.parseInt(st.nextToken());
				// max 값과 max index값 저장
				if (max < arr[n]) {
					max = arr[n];
					maxIdx = n;
				}
			}
			while (start < N) {
				for (int n = start; n < maxIdx; n++) {
					profit += (max - arr[n]);
				}
				start = maxIdx + 1;
				max = 0;
				maxIdx = 0;
				for (int n = start; n < N; n++) {
					if (max < arr[n]) {
						max = arr[n];
						maxIdx = n;
					}
				}
			}
			System.out.println("#" + test_case + " " + profit);
		}
	}

}
