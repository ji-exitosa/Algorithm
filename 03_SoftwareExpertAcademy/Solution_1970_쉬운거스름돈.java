package d200504;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class Solution_1970_쉬운거스름돈 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1970.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			int changes[] = {50000,10000,5000,1000,500,100,50,10};
			int input= Integer.parseInt(br.readLine());
			System.out.println("#" + test_case);
			for(int i=0; i<8; i++) {
				System.out.print(input/changes[i]+" ");
				input%=changes[i];
			}
			System.out.println();
		}
	}
}
