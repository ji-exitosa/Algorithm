
	// 메모리 130116
	// 시간 564

package d200307;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_7576_토마토 {
	static int R,C,immaturedTomato, time;
	static int[][] map;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	static LinkedList <int[]> queue = new LinkedList<int[]>();
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/bj_7576.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " " );
		C = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		
		for(int r=0; r<R; r++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int c=0; c<C; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());				
				if(map[r][c] == 1) 
					queue.offer(new int [] {r,c,time});
				else if(map[r][c] == 0)
					immaturedTomato++;
			}
		}
		
		bfs();
		
		if(immaturedTomato>0)
			System.out.println(-1);
		else
			System.out.println(time-1);

	}
	private static void bfs() {
		int[] orgrc = new int[3];
		int orgr, orgc, tempr, tempc;
		while(!queue.isEmpty()) {
			orgrc = queue.poll();
			orgr = orgrc[0];
			orgc = orgrc[1];
			time = orgrc[2]+1;	
			// queue에 있는 마지막 요소 뽑을 때 일단 time++ 했는데,
			// 아래 for문 돌면서 상하좌우 체크했는데 더이상 갈 곳이 없어서 못감. 하지만 time은 이미 ++ 됐으므로 맨 마지막에 출력하기전에 하나 빼주거나
			// 아니면 여기서 +1 해주지 앟고 저 아래 else 문에서 flag나 조건 걸어가지고 time+1 하는 코드 작성해야함. 전자가 더 수월해서 전자로.
			
			for(int i=0; i<4; i++) {
				tempr = orgr+dir[i][0];
				tempc = orgc+dir[i][1];
				
				if(tempr<0 || tempc<0 || tempr>R-1 || tempc>C-1|| map[tempr][tempc]!=0)
					continue;
				else {
					queue.offer(new int[]{tempr,tempc,time});
					map[tempr][tempc] = 1;
					immaturedTomato--;
				}
			}
		}
	}
}
