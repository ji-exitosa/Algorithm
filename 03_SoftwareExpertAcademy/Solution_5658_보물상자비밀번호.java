package d200429;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_5658_보물상자비밀번호 {
	static int answer;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_5658.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		int N,K;
		for(int test_case = 1; test_case<=T; test_case++) {
			st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			String inputStr = br.readLine();
			String arr[] = new String[N];
			int arrInt[] = new int[N];
			String tempStr="";
			Arrays.fill(arr, "#");
			for(int n=0; n<N/4; n++) {
				tempStr="";
				for(int m=0; m<4;m++) {
					arr[n*4+m] = arr[n*4+m].concat(inputStr.substring(N/4*m, N/4*(m+1)));						
				}
				tempStr = tempStr.concat(inputStr.substring(1));
				tempStr = tempStr.concat(inputStr.substring(0,1));
				inputStr = tempStr;
			}
			for(int i=0; i<N; i++) {
				arrInt[i] = Integer.decode(arr[i]);
			}
			Arrays.sort(arrInt);
			System.out.println(Arrays.toString(arrInt));

			int temp=-1;
			int goal = 0;
			int answer=0;
			for(int i=N-1; i>0; i--) {
				if(arrInt[i]!=temp) {
					goal++;
					temp=arrInt[i];
				}else {
					System.out.println(goal + "중복");
				}
				if(goal==K) {
					answer = arrInt[i];
					break;
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
