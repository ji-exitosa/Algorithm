package d200409;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1197_최소스패닝트리 {
	static int[] parents = new int [10001];
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/bj_1197.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine() , " ");
		
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int [][]arr = new int[E][3];
		for(int e=0; e<E; e++) {
			st = new StringTokenizer(br.readLine() , " ");
			for(int i=0; i<3; i++)
				arr[e][i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[2], o2[2]);
			}
		});
		
		for(int i=0; i<V; i++)
			parents[i]=i;
		
		int cnt = 0;
		int result = 0;
		for(int i=0; i<E;i++) {
			int a = findSet(arr[i][0]);
			int b = findSet(arr[i][1]);
			if(a==b)
				continue;
			parents[b]=a;
			cnt++;
			result += arr[i][2];
			if(cnt == V-1)
				break;
		}
		System.out.println(result);
		
	}
	private static int findSet(int i) {
		if(i==parents[i]) {
			return i;
		}else {
			parents[i] = findSet(parents[i]);
			return parents[i];
		}
	}

}
