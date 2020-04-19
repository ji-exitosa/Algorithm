package d200419;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_9280_진용이네주차타워 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_9280.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int Nprices[] = new int[N];
			int Noccupied[] = new int[N];
			int Mcar[] = new int[M];
			int income=0;
			boolean isSucceed = false;
			LinkedList<Integer> queue = new LinkedList<Integer>();
			for (int n = 0; n < N; n++) {
				Nprices[n] = Integer.parseInt(br.readLine());
				Noccupied[n] = -1;
			}
			for (int m = 0; m < M; m++) {
				Mcar[m] = Integer.parseInt(br.readLine());
			}
			for (int m = 0; m < 2 * M; m++) {
				int temp = Integer.parseInt(br.readLine());
				if (temp > 0) {
					for (int i = 0; i < N; i++) {
						if (Noccupied[i] == -1) {
							Noccupied[i] = temp - 1;
							income += Mcar[Noccupied[i]]*Nprices[i];
							isSucceed = true;
							break;
						}
					}
					if (isSucceed == false) {
						queue.offer(temp - 1);
					}else {
						isSucceed = false;
					}
				} else {
					for (int i = 0; i < N; i++) {
						if (Noccupied[i] == (temp * -1) - 1) {
							if (!queue.isEmpty()) {
								Noccupied[i] = queue.poll();
								income += Mcar[Noccupied[i]]*Nprices[i];
								break;
							} else {
								Noccupied[i] = -1;
								break;
							}
						}
					}

				}
			}
			System.out.println("#" + test_case + " " + income);
		}
	}
}
