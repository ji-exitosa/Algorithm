package d200511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8500_극장좌석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int sum=N, max=0, input=0;
			st = new StringTokenizer(br.readLine()," ");
			for(int n=0; n<N; n++) {
				input = Integer.parseInt(st.nextToken());
				max = max<input?input:max;
				sum+=input;
			}
			sum+=max;
			System.out.println("#" + test_case + " " + sum);
		}
	}
}
