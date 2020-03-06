package d200306;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// dfs로 바꿔보기!!!!
// 이게 왜 bfs 문제로 들어갔는지 알겠다
// dfs로 풀거면 dfs로 지나온 길 방문체크를 다시 풀어줘야되는데 그게 어려운것같음
// 어려우니까 굳이 dfs로 더 풀진 않겠습니다..! 왜 안되는지 알았고 앞으로 이렇게 길찾기, 최단경로찾기 문제가 나오면 bfs로 푸는게 수월할것이다..!라는
// 깨달음만 가지고 갈게유 .... ^_6.... 저 오늘 14문제 풀어야되는데 지금 밤 11시 32분인데... 지금 이거 두번째 문제네여 ^_^.... 큰일....
// 그럼 이만.. .안녕....

public class Main_2178_미로탐색_dfs {

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
		}
		
		// 탐색 시작
		dfs();
		System.out.println(min);
	}
	private static void dfs() {
		Stack <int[]> stack = new Stack<int[]>();
		int orgArr[] = new int[3];
		int orgr, orgc, orgMoved;
		int tempr, tempc;
		stack.push(new int[] {0,0,1});
		// 스택이니까 방문체크는 pop 할 때~! 
		while(!stack.isEmpty()) {
			System.out.println(stack.peek()[0] + " " + stack.peek()[1] + " " + stack.peek()[2]);
			orgArr = stack.pop();
			orgr = orgArr[0];
			orgc = orgArr[1];
			orgMoved = orgArr[2];
			charArr[orgr][orgc] = 'v';		// 방문체크
			
			if(orgArr[0]==N-1 && orgArr[1]==M-1) {
				if(orgMoved<min)
					min = orgMoved;
				continue;
			}
			
			for(int i=0; i<4; i++) {
				tempr = orgr + dir[i][0];
				tempc = orgc + dir[i][1];
				if(tempr < 0 || tempc < 0 || tempr > N-1 || tempc > M-1 || charArr[tempr][tempc] != '1')
					continue;
				else{
					//System.out.println(tempr + " " + tempc + " " + (orgMoved+1)); // orgMoved 값 제대로 들어가는지 출력
					stack.push(new int[] {tempr, tempc, orgMoved+1});
					//System.out.println(queue.peek()[0] + " " + queue.peek()[1] + " " + queue.peek()[2]); // orgMoved 값 제대로 들어가는지 출력
					charArr[tempr][tempc] = 'v';
				}
			}
		}
		
	}
}