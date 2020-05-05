package d200505;
import java.io.*;
import java.util.*;
public class Solution_1945_간단한소인수분해 {
	public static void main(String[] args) throws Exception{
		int arr[] = {2,3,5,7,11};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			int answer[] = new int[5];
			Arrays.fill(answer, 0);
			int N = Integer.parseInt(br.readLine());
			for(int i=0; i<5; i++) {
				while(N%arr[i]==0) {
					/*System.out.println(N + " " + arr[i]);*/
					answer[i]++;
					N/=arr[i];
				}
			}
			System.out.print("#" + test_case + " " );
			for(int i=0; i<5; i++)
				System.out.print(answer[i] + " " );
			System.out.println();
		}
	}
}
