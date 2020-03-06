package d200306;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main_1260_dfs와bfs_제출용 {
	static int N,M,V;
	static int tempr,tempc;
	static int answer = 0;
	static boolean [][] map;
	static boolean [] visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " " );
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		map = new boolean[N+1][N+1];
		for(int i=1; i<=M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			tempr = Integer.parseInt(st.nextToken());
			tempc = Integer.parseInt(st.nextToken());
			
			map[tempr][tempc] = true;
			map[tempc][tempr] = true;
		}
		dfs();
		System.out.println();
		bfs();
		System.out.println();
	}
	private static void bfs() {
		LinkedList <Integer> queue = new LinkedList <Integer>();
		visited = new boolean[N+1];
		int temp=0;		
		queue.offer(V);
		visited[V] = true;
		while(!queue.isEmpty()) {
			temp = queue.poll();
			System.out.print(temp + " ");		
			for(int i=1; i<=N; i++) {
				if(map[temp][i] && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
	private static void dfs() {
		Stack <Integer> stack = new Stack <Integer>();
		visited = new boolean[N+1];
		int temp = 0;
		stack.push(V);
		while(!stack.isEmpty()) {
			temp = stack.pop();
			if(!visited[temp]) {
				visited[temp] = true;				
				System.out.print(temp + " ");		
			}
			for(int i=N; i>0; i--) {
				if(map[temp][i] && !visited[i]) {
					stack.push(i);
				}
			}			
		}
	}
}
