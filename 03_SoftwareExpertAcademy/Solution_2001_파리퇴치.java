package d200414;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_2001_파리퇴치 {

	static int answer = 0;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_2001.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int N, M;
		int[][] arr, sumarr;
		for (int test_case = 1; test_case <= T; test_case++) {
			answer = 0;
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			sumarr = new int[N - M + 1][N - M + 1];
			for (int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int m = 0; m < N; m++) {
					arr[n][m] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int n=0; n<N-M+1; n++) {
				for(int m=0; m<N-M+1; m++) {
					for(int i=0;i<M;i++) {
						for(int j=0; j<M; j++) {
							sumarr[n][m]+=arr[n+i][m+j];
						}
					}
/*					for (int i = 0; i < M; i++) {
						for (int j = 0; j < M; j++) {
							int tempi = n-i;
							int tempj = n-j;
							
							if(tempi<0)
								tempi = 0;
							if(tempj<0)
								tempj = 0;
							
							sumarr[tempi][tempj] += arr[n][m];
							if(sumarr[tempi][tempj] > answer)
								answer = sumarr[tempi][tempj];
						}
					}*/
				}
			}
			for(int i=0; i<N-M+1; i++) {
				Arrays.sort(sumarr[i]);
				if(answer < sumarr[i][N-M])
					answer = sumarr[i][N-M];
			}
			
			
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
