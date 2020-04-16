package d200415;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_8888_시험 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_8888.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int TC = Integer.parseInt(br.readLine());
		int N, P;
		int arr[][];
		int score[];
		for (int test_case = 1; test_case <= TC; test_case++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			final int T = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			arr = new int[N][T+3];
			score = new int[T];
			for (int n = 0; n < N; n++) {				
				st = new StringTokenizer(br.readLine(), " ");
				arr[n][T+1] = T;
				arr[n][T+2] = n;
				for (int t = 0; t < T; t++) {
					arr[n][t] = Integer.parseInt(st.nextToken());
					if(arr[n][t]==0) {
						score[t]++;
						arr[n][T+1]--;
					}
				}
			}
			for(int n=0; n<N; n++) {
				for (int t = 0; t < T; t++) {
					if(arr[n][t]>0) {
						arr[n][T] += score[t]*arr[n][t];
					}
				}
			}
			Arrays.sort(arr,new Comparator<int[]>(){
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[T] < o2[T])
						return 1;
					else if(o1[T]>o2[T])
						return -1;
					else {
						if(o1[T+1]<o2[T+1])
							return 1;
						else if(o1[T+1]>o2[T+1])
							return -1;
						else {
							if(o1[T+2]>o2[T+2])
								return 1;
							else if(o1[T+2]<o2[T+2])
								return -1;
							else
								return 0;
						}
					}
				}
			});
			for(int p = 0; p < N; p++) {
				if(arr[p][T+2]==P-1) {
					P = p;
					break;
				}
			}			
			for(int i=0; i<N ;i++) {
				for(int j=0; j<T+3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("#" + test_case + " " + arr[P][T]+" "+(P+1));
		}
	}
}
