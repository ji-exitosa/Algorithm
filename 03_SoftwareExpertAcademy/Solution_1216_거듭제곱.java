package d200508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1216_거듭제곱 {
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			int  M = Integer.parseInt(st.nextToken());
			System.out.println("#"+test_case + " " + getpow(M,1));
		}
	}
	private static int getpow(int m, int result) {
		if(m==0) 
			return result;
		return getpow(m-1,result*N);
	}
}
