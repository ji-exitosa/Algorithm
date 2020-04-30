package d200429;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Solution_4050_재관이의대량할인 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_4050.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int arr[] = new int[num];
			int answer = 0;
			for(int i=0; i<num; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				answer+=arr[i];
			}
			Arrays.sort(arr);
			int startpoint = num%3;
			for(int i=startpoint; i<num; i=i+3) {
				answer-=arr[i];
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
