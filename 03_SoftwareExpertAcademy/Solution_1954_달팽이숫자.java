package d200504;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1954_달팽이숫자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int map[][] = new int[N][N];
			int r = 0, c = -1;
			int input = 1;
			int turn = N;
			int dir = 1;
			while (input <= N * N) {
				for (int i = 0; i < turn; i++) {
					c += dir;
					map[r][c] = input++;
				}
				turn--;
				if (input == N * N)
					break;
				for (int i = 0; i < turn; i++) {
					r += dir;
					map[r][c] = input++;
				}
				dir *= -1;
			}
			System.out.println("#" + test_case);
			for (int n = 0; n < N; n++) {
				for (int m = 0; m < N; m++)
					System.out.print(map[n][m]+ " ");
				System.out.println();
			}
		}
	}
// import 
// ctrl+shift+o
}
