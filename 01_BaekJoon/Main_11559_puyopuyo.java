package d200419;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main_11559_puyopuyo {

	static final int R = 12;
	static final int C = 6;
	static char map[][] = new char[R][C];
	static char tmap[][] = new char[R][C];
	static boolean isChanged = false;
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // 상 하 좌 우
	static int counter = 0;

	public static void main(String[] args) throws Exception {
		// 입력
		System.setIn(new FileInputStream("res/bj_11559.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		int nr;
		for (int r = 0; r < R; r++) {
			temp = br.readLine();
			for (int c = 0; c < C; c++) {
				map[r][c] = temp.charAt(c);
			}
		}

		while (true) {
			for (int r = 0; r < R; r++) {
				Arrays.fill(tmap[r], '.');
			}
			// 아랫줄부터 탐색
			isChanged = false;
			for (int r = R - 1; r > -1; r--) {
				for (int c = 0; c < C; c++) {
					if (map[r][c] != '.') {
						bfs(r, c);
					}
				}
			}

			if (isChanged == false) {
				break;
			} else {
				counter++;
				for (int c = 0; c < C; c++) {
					nr = R - 1;
					for (int r = R - 1; r > -1; r--) {
						if (map[r][c] != '.') {
							tmap[nr][c] = map[r][c];
							nr--;
						}
					}
				}
				for (int r = 0; r <R; r++) {
					for (int c = 0; c < C; c++) {
						map[r][c] = tmap[r][c];
					}
				}
			}
		}
		System.out.println(counter);

	}

	private static void bfs(int r, int c) {
		LinkedList<int[]> queue = new LinkedList<int[]>();
		LinkedList<int[]> tempqueue = new LinkedList<int[]>();
		queue.offer(new int[] { r, c });
		int on = 1;
		char target = map[r][c];
		map[r][c] = '.'; // 방문체크 대신에 바꿔버림
		tempqueue.offer(new int[] { r, c });
		int org[] = new int[3];
		int or, oc, tr = 0, tc = 0;
		while (!queue.isEmpty()) {
			org = queue.poll();
			or = org[0];
			oc = org[1];
			for (int d = 0; d < 4; d++) {
				tr = or + dir[d][0];
				tc = oc + dir[d][1];
				if (tr < 0 || tr >= R || tc < 0 || tc >= C)
					continue;

				if (map[tr][tc] == target) {
					++on;
					queue.offer(new int[] { tr, tc });
					map[tr][tc] = '.'; // 방문체크 대신에 바꿔버림
					tempqueue.offer(new int[] { tr, tc });
				}
			}
		}

		// 4개 미만이면, 다시 원래대로 돌려놓기
		if (on < 4) {
			while (!tempqueue.isEmpty()) {
				org = tempqueue.poll();
				tr = org[0];
				tc = org[1];
				map[tr][tc] = target;
			}
		} else {
			// 여기서 counter++ 해서 오래걸린거였음
			isChanged = true;
		}
	}

}
