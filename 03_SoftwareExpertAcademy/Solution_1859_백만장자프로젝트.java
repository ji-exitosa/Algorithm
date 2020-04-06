package d200406;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859_백만장자프로젝트 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_1859.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int N;
		int [] arr;
		for(int test_case = 1; test_case<=T; test_case++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			arr = new int[N];
			for(int n=0; n<N; n++) {
				arr[n] = Integer.parseInt(st.nextToken());		
				// max 값과 max index값 저장,
			}
		}
	}

}
