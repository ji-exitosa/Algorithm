package d200310;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_7793_오나의여신님_제출 {
	static final char GOD = 'D';
	static final char DEVIL = '*';
	static final char SUYEON = 'S';
	static final char ROCK = 'X';
	static final char EMPTY = '.';
	static LinkedList<int[]> queue;

	static int R, C;
	static char[][] map;
	static int dir[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int time;
	static int godr, godc;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_7793.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String temp;
		int[] suyeonInfo = new int[4];
		// test_case 시작
		for (int test_case = 0; test_case < T; test_case++) {
			time = -1;
			queue = new LinkedList<int[]>();
			st = new StringTokenizer(br.readLine(), " ");
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			map = new char[R][C];
			for (int r = 0; r < R; r++) {
				temp = br.readLine();
				for (int c = 0; c < C; c++) {
					map[r][c] = temp.charAt(c);
					switch (map[r][c]) {
					case SUYEON:
						suyeonInfo = new int[] { r, c, 0, SUYEON - 0 };
						break;

					case GOD:
						godr = r;
						godc = c;
						break;

					case DEVIL:
						queue.offer(new int[] { r, c, 0, DEVIL - 0 });
						break;
					}
				}
			}
			queue.offer(suyeonInfo);
			bfs();
			if(time == -1) {
				System.out.println("#" + (test_case + 1) + " GAME OVER");
				continue;
			}
			System.out.println("#" + (test_case + 1) + " " + time);
		}
	}

	private static void bfs() {
		int[] temprc;
		int orgr, orgc, orgtime, tempr, tempc;
		int orgid;
		char tempchar;
		while (!queue.isEmpty()) {
			temprc = queue.poll();
			orgr = temprc[0];
			orgc = temprc[1];
			orgtime = temprc[2];							
			orgid = temprc[3];

			if(orgr==godr && orgc==godc) {
				time = orgtime;
				return;
			}
			
			if(orgid == DEVIL-0) { 			// 악마이면
				for(int i=0; i<4; i++) {
					tempr = orgr + dir[i][0];
					tempc = orgc + dir[i][1];
					if(tempr<0 || tempr>R-1 || tempc<0 || tempc>C-1)
						continue; 
					tempchar = map[tempr][tempc];
					if(tempchar==EMPTY || tempchar == SUYEON) {
						map[tempr][tempc] = DEVIL;
						queue.offer(new int[] {tempr, tempc, orgtime+1, DEVIL-0});
					}
				}				
			}else if(orgid == SUYEON-0) {		// 수연이면
				for(int i=0; i<4; i++) {
					tempr = orgr + dir[i][0];
					tempc = orgc + dir[i][1];
					if(tempr<0 || tempr>R-1 || tempc<0 || tempc>C-1)
						continue; 
					tempchar = map[tempr][tempc];
					if(tempchar==EMPTY) {
						map[tempr][tempc] = SUYEON;
						queue.offer(new int[] {tempr, tempc, orgtime+1, SUYEON-0});
					}else if(tempchar==GOD) {
						time = orgtime+1;
						return;
					}
				}
			}
		}
	}
}
