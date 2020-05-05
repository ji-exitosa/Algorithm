package d200504;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Solution_1966_숫자를정렬하자 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine());		
			int arr[] = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int n=0; n<N; n++) {
				arr[n]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			System.out.print("#" + test_case + " ");
			for(int n=0; n<N; n++) {
				System.out.print(arr[n] + " " );
			}
		}
	}
}
