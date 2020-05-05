package d200504;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1954_달팽이숫자2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int map[][] = new int[N][N];
			int r=0, c=0;
			int input = 1;
			int tilln=N;
			int lr=1;
			int dir;
			while(input<=N*N) {
				dir=1;
				for(int turn=0; turn<2; turn++) {
					for(int i=0; i<tilln-1; i++) {
						map[r][c] = input;
						input++;
						if(lr==1)
						{
							c=c+dir;
						}else {
							r=r+dir;
						}
						System.out.println(turn + " " + i +" " + r+" "+c);
					}
					lr*=-1;
					if(tilln==N) {
						tilln++;
						break;
					}
					dir*=-1;
				}
				tilln--;
			}
			for(int n=0; n<N; n++) {
				System.out.println(Arrays.toString(map[n]));
			}
//			System.out.println("#" + test_case + " " + answer);
		}
	}
// import 
// ctrl+shift+o
}
