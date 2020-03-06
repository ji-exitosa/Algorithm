package d200306;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


// bfs, dfs 둘 다 코딩해보기!
// 일단 bfs로 코딩하고 dfs로 바꿔보는걸로
public class Main_2178_미로탐색_bfs {

	static int N, M;
	static String tempStr;
	static char charArr[][];
	static int min=Integer.MAX_VALUE;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/bj_2178.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		charArr = new char[N][M];
				
		// 입력받기
		for(int idx = 0; idx < N; idx++) {
			tempStr = br.readLine();
			charArr[idx] = tempStr.toCharArray();
//			System.out.println(Arrays.toString(charArr[idx]));
		}
		
		// 탐색 시작
		bfs();
		System.out.println(min);
	}
	private static void bfs() {
		LinkedList <int[]> queue = new LinkedList <int[]>();
		int orgArr[] = new int[3];
		int orgr, orgc, orgMoved;
		int tempr, tempc;
		queue.offer(new int[] {0,0,1}); 	// '1,1에서 시작, 첫번째 칸'이라는 뜻
		charArr[0][0] = 'v';		// 방문체크
		while(!queue.isEmpty()) {
			//System.out.println(queue.peek()[0] + " " + queue.peek()[1] + " " + queue.peek()[2]);
			orgArr = queue.poll();
			orgr = orgArr[0];
			orgc = orgArr[1];
			orgMoved = orgArr[2];
			
			if(orgArr[0]==N-1 && orgArr[1]==M-1) {
				if(orgMoved<min)
					min = orgMoved;
			}
			for(int i=0; i<4; i++) {
				tempr = orgr + dir[i][0];
				tempc = orgc + dir[i][1];
				if(tempr < 0 || tempc < 0 || tempr > N-1 || tempc > M-1 || charArr[tempr][tempc] != '1')
					continue;
				else{
					//System.out.println(tempr + " " + tempc + " " + (orgMoved+1)); // orgMoved 값 제대로 들어가는지 출력
					queue.offer(new int[] {tempr, tempc, orgMoved+1});
					//System.out.println(queue.peek()[0] + " " + queue.peek()[1] + " " + queue.peek()[2]); // orgMoved 값 제대로 들어가는지 출력
					charArr[tempr][tempc] = 'v';
				}
			}
			
		}
	}

}