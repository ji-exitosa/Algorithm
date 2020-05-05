package d200504;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Solution_1959_두개의숫자열 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1959.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int answer = Integer.MIN_VALUE;
			int sum=0;
			int N = Integer.parseInt(st.nextToken());		
			int M = Integer.parseInt(st.nextToken());
			int NM = N>M?N:M;
			int diff = Math.abs(N-M);
			int arrA[] = new int[NM];
			int arrB[] = new int[NM];
			Arrays.fill(arrA, 0);
			Arrays.fill(arrB, 0);
			st = new StringTokenizer(br.readLine()," ");
			for(int n=0; n<N; n++) {
				if(NM==M)
					arrA[n]=Integer.parseInt(st.nextToken());
				else
					arrB[n]=Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine()," ");
			for(int m=0; m<M; m++) {
				if(NM==M)
					arrB[m]=Integer.parseInt(st.nextToken());
				else
					arrA[m]=Integer.parseInt(st.nextToken());
			}
			for(int x=0; x<=diff; x++) {
				sum=0;
				for(int y=0; y<NM; y++) {
					sum+=arrA[(y+NM-x)%NM]*arrB[y%NM];
					//System.out.println(sum + " " + arrA[(y+NM-x)%NM] + " " +arrB[y%NM]);
				}
				if(answer<sum) {
					answer = sum;
					//System.out.println("sum 값 바뀜");
				}else {
					//System.out.println("sum 값 안바뀜");
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
