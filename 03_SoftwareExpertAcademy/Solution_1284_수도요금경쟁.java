package d200505;
import java.io.*;
import java.util.StringTokenizer;
public class Solution_1284_수도요금경쟁 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int P=Integer.parseInt(st.nextToken());
			int Q=Integer.parseInt(st.nextToken());
			int R=Integer.parseInt(st.nextToken());
			int S=Integer.parseInt(st.nextToken());
			int W=Integer.parseInt(st.nextToken());
			
			// A사
			int a = P*W;
			int b=0;
			if(W>R) {
				b=Q+(W-R)*S;
			}else {
				b=Q;
			}
			if(a<b)
				b=a;
			System.out.println("#" + test_case + " " + b);
		}
	}
}
