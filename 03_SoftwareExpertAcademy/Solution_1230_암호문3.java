package d200509;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Solution_1230_암호문3 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_1230.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int test_case = 1; test_case <= 10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			LinkedList<Integer> arr = new LinkedList<Integer>();
			st = new StringTokenizer(br.readLine(), " ");
			for (int n = 0; n < N; n++)
				arr.add(Integer.parseInt(st.nextToken()));
			int commNum = Integer.parseInt(br.readLine());
			char comm;
//			int num = (commNum + 10) > N ? N : commNum+10;
			//System.out.println(num);
			int X = 0, Y = 0, Z = 0;
			//System.out.println(arr.toString());
			st= new StringTokenizer(br.readLine(), " ");
			for (int commN = 0; commN < commNum; commN++) {
				comm = st.nextToken().charAt(0);
				if (comm == 'I') {
					X = Integer.parseInt(st.nextToken());
					if (arr.size() >= X) {
						Y = Integer.parseInt(st.nextToken());
						for (int y = 0; y < Y; y++) {
							arr.add(X + y, Integer.parseInt(st.nextToken()));
						}
					}
				} else if (comm == 'D') {
					X = Integer.parseInt(st.nextToken());
					Y = Integer.parseInt(st.nextToken());
					if (arr.size() >= X) {
						for (int y = 0; y < Y; y++) {
							arr.remove(X);
						}
					}
				} else if (comm == 'A') {
					Y = Integer.parseInt(st.nextToken());
					for (int y = 0; y < Y; y++) {
						arr.add(Integer.parseInt(st.nextToken()));
					}
				}
				//System.out.println(arr.toString());
			}
			System.out.print("#" + test_case + " ");
			for(int i=0; i<10; i++)
				System.out.print(arr.get(i) + " ");
			System.out.println();
		}
	}
// import 
// ctrl+shift+o
}
