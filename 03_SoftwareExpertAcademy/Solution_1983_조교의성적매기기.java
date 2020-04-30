package d200430;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_1983_조교의성적매기기 {
	static int answer = 0;
	public static void main(String[] args) throws Exception {
		String[] scoreStr = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		int[] mul = {35, 45, 20} ;
		System.setIn(new FileInputStream("res/sea_1983.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			double arr[][] = new double[N][2];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[i][0] = i + 1;
				for (int x = 0; x < 3; x++)
					arr[i][1] += Integer.parseInt(st.nextToken())*mul[x];
				arr[i][1] /= 3.0;
			}
			int rankcutter = N / 10;
			Arrays.sort(arr, new Comparator<double[]>() {
				@Override
				public int compare(double[] o1, double[] o2) {
					if (o1[1] < o2[1])
						return 1;
					else
						return -1;
				}
			});
			
/*			
			for(int i=0; i<N; i++) {
				System.out.print(arr[i][0]);
				System.out.println(" " + arr[i][1]);				
			}*/

			int rank = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i][0] == K)
					rank = i;
			}
			int score = (rank / rankcutter);

			System.out.println("#" + test_case + " " + scoreStr[score]);
		}
	}
}

/*			LinkedList <double[]> arr= new LinkedList <double[]>();
			for(int i=0; i<N; i++) {
				int temp=0;
				st = new StringTokenizer(br.readLine()," ");
				for(int x=0; x<3; x++)
					temp += Integer.parseInt(st.nextToken());
				temp/=3.0;
				arr.add(new double[]{i+1, temp});
			}
			arr.sort(new Comparator<double[]>() {
				@Override
				public int compare(double[] o1, double[] o2) {
					if(o1[1]<o2[1])
						return 1;
					else
						return -1;
				}
			});
			System.out.println("#" + test_case + " " + );*/
