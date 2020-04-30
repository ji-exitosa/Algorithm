package d200429;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_9778_카드게임 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_9778.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			int arr[] = new int[12];
			Arrays.fill(arr, 4);
			arr[10]=16;
			int getN = Integer.parseInt(br.readLine());
			int temp;
			int sumtil=0;
			for(int i=0; i<getN; i++) {
				temp = Integer.parseInt(br.readLine());
				arr[temp]--;
				sumtil += temp;
			}
			int left = 21-sumtil;
			int good =0, bad = 0;
			for(int i=2; i<=11;i++) {
				if(i<=left)
					good+=arr[i];
				else
					bad+=arr[i];
			}
			if(good>bad)
				System.out.println("#" + test_case + " GAZUA");
			else
				System.out.println("#" + test_case + " STOP");
		}
	}
}
