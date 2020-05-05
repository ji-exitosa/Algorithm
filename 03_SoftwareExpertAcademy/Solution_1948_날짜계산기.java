package d200505;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1948_날짜계산기 {
	public static void main(String[] args) throws Exception{
		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		int pm, pd, lm, ld;
		for(int test_case = 1; test_case<=T; test_case++) {
			int answer = 0;
			st = new StringTokenizer(br.readLine()," ");
			pm=Integer.parseInt(st.nextToken());
			pd=Integer.parseInt(st.nextToken());
			lm=Integer.parseInt(st.nextToken());
			ld=Integer.parseInt(st.nextToken());
			for(int month = pm; month<=lm; month++) {
				answer+=days[month];
			}
			answer=answer-(pd-1+days[lm]-ld-1+1);
			System.out.println("#" + test_case + " " + answer);
		}
	}
// import 
// ctrl+shift+o
}
