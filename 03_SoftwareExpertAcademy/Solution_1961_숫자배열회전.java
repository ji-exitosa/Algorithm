package d200504;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Solution_1961_숫자배열회전 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1961.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine());		
			String arr[][] = new String[N][N];
			String storage[][] = new String[N][3];
			for(int n=0; n<N; n++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				Arrays.fill(storage[n], "");
				for(int m=0; m<N; m++) {
					arr[n][m]=st.nextToken();
				}
			}
			int nn=0;
			for(int m=0; m<N; m++) {
				for(int n=N-1; n>=0; n--) {
					storage[nn][0]=storage[nn][0].concat(arr[n][m]);
				}
				nn++;
			}
			nn=0;
			for(int n=N-1; n>=0; n--) {
				for(int m=N-1; m>=0; m--) {
					storage[nn][1]=storage[nn][1].concat(arr[n][m]);
				}
				nn++;
			}
			nn=0;
			for(int m=N-1; m>=0; m--) {
				for(int n=0; n<N; n++) {
					storage[nn][2]=storage[nn][2].concat(arr[n][m]);
				}
				nn++;
			}
			System.out.println("#" + test_case);
			for(int n=0; n<N; n++) {
				for(int m=0; m<3; m++) {					
					System.out.print(storage[n][m]+ " " );			
				}
				System.out.println();
			}
		}
	}
}
