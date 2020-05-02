package d200502;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1974_스도쿠검증 {
	static int answer = 0;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1974.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		int map[][] = new int[9][9];
		int sum=0;
		int temp;
		int isOK = 1;
		for(int test_case = 1; test_case<=T; test_case++) {
			isOK = 1;
			int sumColumn[] = new int[9];
			int sum3by3[] = new int[9];
			for(int r=0; r<9; r++) {
				sum=0;
				st = new StringTokenizer(br.readLine(), " ");
				if(isOK==1) {
					for(int c=0; c<9; c++) {
						temp = Integer.parseInt(st.nextToken());
						map[r][c]= temp;
						if(isOK == 1) {
							sumColumn[c]+= temp;
							sum+=temp;
							sum3by3[c/3+3*(r/3)]+=temp;
						}
					}					
					if(sum!=45)
						isOK = 0;
				}				
			}
			if(isOK==1) {
				for(int i=0; i<9; i++) {
					if(sumColumn[i]!=45 || sum3by3[i]!=45) {
						isOK = 0;
						break;
					}
				}	
			}
			System.out.println("#" + test_case + " " + isOK);
		}
	}
}
