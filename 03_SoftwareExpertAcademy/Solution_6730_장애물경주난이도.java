package d200509;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_6730_장애물경주난이도 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int before= Integer.parseInt(st.nextToken()), now, up=0, down=0;
			for(int n=1; n<N; n++) {
				now = Integer.parseInt(st.nextToken());
				if(before<now) {
					if(up<now-before)
						up = now-before;
				}else {
					if(down<before-now)
						down = before-now;
				}
				before=now;
			}
			System.out.print("#" + test_case + " " + up + " " + down);
			System.out.println();
		}
	}
// import 
// ctrl+shift+o
}
