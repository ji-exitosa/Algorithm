package d200508;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3431_준환이의운동관리 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_3431.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		int L,U,X;
		for(int test_case = 1; test_case<=T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int answer = 0;
			L = Integer.parseInt(st.nextToken());
			U = Integer.parseInt(st.nextToken());
			X = Integer.parseInt(st.nextToken());
			
			if(X<L)
				answer = L-X;
			else if(X>U)
				answer = -1;
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
// import 
// ctrl+shift+o
}
