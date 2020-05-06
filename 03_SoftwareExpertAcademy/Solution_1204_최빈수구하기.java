package d200505;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Solution_1204_최빈수구하기 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1204.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			Integer.parseInt(br.readLine());		
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int arr[][] = new int[101][2];
			for(int i=1; i<101; i++) {
				arr[i][0] = i;
				arr[i][1] = 0;
			}
			for(int n=0; n<1000; n++) 
				arr[Integer.parseInt(st.nextToken())][1]++;
			/*for(int i=0; i<100; i++) 
				System.out.println(arr[i][0] + " " + arr[i][1]);*/
			Arrays.sort(arr,new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1]>o2[1]) {
						return -1;
					}else if(o1[1]<o2[1]){
						return 1;
					}else {
						if(o1[0]>o2[0])
							return -1;
						else
							return 1;
					}
				}
			});
			/*for(int i=0; i<100; i++) 
				System.out.println(arr[i][0] + " " + arr[i][1]);*/
			
			System.out.println("#" + test_case + " " + arr[0][0]);
		}
	}
}
