package d200307;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1697_숨바꼭질 {
	static int N, K;
	static boolean[] visited;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/bj_1697.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		if(N<K) {
			visited = new boolean[100001];
			// 범위도 엉망으로 설정했었음 처음에
			bfs();
		}else {
			System.out.println(N-K);
		}
	}
	private static void bfs() {
		LinkedList<int[]> queue = new LinkedList<int[]>();
		int tempArr[] = new int [2];
		queue.offer(new int[] {N,0});
		visited[N]=true;
		int orgNum, orgTime, tempNum[]=new int[3];
		while(!queue.isEmpty()) {
			tempArr = queue.poll();
			orgNum = tempArr[0];
		//	System.out.println(orgNum);
			orgTime = tempArr[1];
			tempNum[0] = orgNum*2;
			tempNum[1] = orgNum+1;
			tempNum[2] = orgNum-1;
			orgTime += 1;
			for(int i=0; i<3; i++) {
				if(tempNum[i]>=0 && tempNum[i]<=visited.length-1 && !visited[tempNum[i]]) { 	
					if(tempNum[i]==K) {
					//if(tempNum[i] == K-1 || tempNum[i] == K+1 || tempNum[i]*2 == K) {
						// 이렇게 검사하면 중간에 하나를 건너뛰고 검사하나봄..! 
						System.out.println(orgTime);					
						return;
					}
					queue.offer(new int[] {tempNum[i], orgTime});
					visited[tempNum[i]]=true;
				}
			}
			//System.out.println();
		}		
		// 순열 .. 뽑는 개수는 안정해져있지만, 뽑는 개수값이랑 최소값 계속 비교해가면서 저장하긴 해야될거같은데
		// 초기 최소값을 17-5 로 잡자. 온전히 +1, -1만 해서 갈 수 있는 거리 계산.
		// 즉, 배열의 크기는 아무리 커도 min. min 사이즈 초과하면 더 계산할 필요 없음
		// 자꾸 bfs가 마음에 걸린다 bfs 뭐 어떻게 풀면 bfs? 퍼트린다., 음.,.,., 아 혹시
		// 5를 기준으로 *2, +1, -1 해보고
		// 그 값, 즉 10, 6, 4를 기준으로 또 각각 *2,+1,-1 해보면 되는건가!?
		// 맞는거같음
		// 그러면
		
		// t = 1초
		// 5 --> 10,6,4
		
		// t = 2초
		// 10--> 20,11,9
		// 6--> 12,7,5
		// 4--> 8,5,3
		
		// t = 3초
		// 20--> 	40,21,19 //17 초과했으므로 가 아니고 계속해야지
		// 11--> 	22,12,10
		// 9-->		18,10,8
		// 12-->	24,13,11
		// 7-->		14,8,6
		// 5-->		10,6,4
		// 8-->		16,9,7
		// 5--> 	10,6,4	// 5가 두개네
		// 3-->		6,4,2
		
		// t = 4초
		// 여기서 저기 위에 9-->18 나온거에서 -1하거나, 8-->16 나온거에서 +1 하면 17 나와서 답이 4 !!!
		
		// 이래서 bfs였구나
		
	}
}
