package d200510;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8016_홀수피라미드 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			long N = Long.parseLong(br.readLine());
			long bleft=2*(N-1)*(N-1)+1, bright=2*N*N-1;
			System.out.println("#" + test_case + " " + bleft + " " + bright);
		}
	}
}
