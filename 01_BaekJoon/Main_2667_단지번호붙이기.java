package d200307;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main_2667_단지번호붙이기 {
	static int N;
	static int[][] map;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	static LinkedList <Integer> counterQueue = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception {
		// input 입력받기
		System.setIn(new FileInputStream("res/bj_2667.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		String tempStr;
		int numbering=1;
		for(int i=0; i<N; i++) {
			tempStr = br.readLine();
			for(int j=0; j<N; j++) {				
				map[i][j] = tempStr.charAt(j)-48;	// 48로 해도되고 49로 해서 코드 바꿔도 될것같긴한데 일단 48
				}	
		}
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				if(map[r][c] == 1) {
					numbering++;
					//System.out.println(numbering);
					bfs(r,c,numbering);	// numbering은 2부터 시작할 것임
				// 즉 단지는 2단지부터 쭉 생성될 것이며, 마지막단지번호-1이 총 단지 개수일 것이다.
				}
			}
		}
		System.out.println(numbering-1);
		counterQueue.sort(null); // 이렇게 하면 정렬 되나봄
		// 오예 맞았는데 자료구조 2개 써서그런지 아니면 다른 이유가 있는지 저번에 푼 것보다 시간이 오래걸렸네유 ㅠㅠ 그럼 이만...
		while(!counterQueue.isEmpty())
			System.out.println(counterQueue.poll());
		// 저 queue sort 할 줄 몰라요 ㅠ_ㅠ ..... 
		// 그냥 array에 넣을까유...
		
		
		
	}
	
	// 집의 수를 오름차순으로 정렬하여 출력하는 프로그램
	// 문제를 제대로 읽읍시다..ㅠㅠㅠ
	
	private static void bfs(int r, int c, int numbering) {
		LinkedList <int[]> queue = new LinkedList<int[]>();
		int counter = 1;
		int[] orgrc = new int[2];
		int orgr, orgc, tempr, tempc;
		queue.offer(new int[] {r,c});
		map[r][c] = numbering;
		while(!queue.isEmpty()) {
			orgrc = queue.poll();
			// 두번 이상 불러다 쓸거면, 배열에서 직접 갖다가 쓰는것보다 변수에 임시로 저장해서 쓰는게 더 좋대요
			// 이유가 잘 기억이 안나는데 배열을 갖다쓰면 ... 배열이 메모리에 올라간댓나? 스택에 올라간댓나? 큐?
			// 다음에 배우면 알려드리겠습ㅂ니다 . 어쨋든, 배열 그대로 갖다쓰는 것보다는 임시 변수에 저장해서 쓰는걸로
			orgr = orgrc[0];
			orgc = orgrc[1];
		
			for(int i=0; i<4; i++) {
				tempr = orgr+dir[i][0];
				tempc = orgc+dir[i][1];
			
				if(tempr<0 || tempc<0 || tempr>N-1 || tempc>N-1|| map[tempr][tempc]!=1)
					continue;
				else {
					queue.offer(new int[]{tempr,tempc});
					map[tempr][tempc] = numbering;
					counter++;
				}
			}
		}	
		counterQueue.offer(counter);
	}
}
