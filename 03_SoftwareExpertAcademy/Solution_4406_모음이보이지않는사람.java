package d200509;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution_4406_모음이보이지않는사람 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		char arr[] = {'a','e','i','o','u'};
		for (int test_case = 1; test_case <= T; test_case++) {
			String temp = br.readLine();
			System.out.print("#" + test_case + " ");
			for(int i = 0 ; i<temp.length(); i++) {
				if(temp.charAt(i)!=arr[0]&&temp.charAt(i)!=arr[1]&&temp.charAt(i)!=arr[2]&&temp.charAt(i)!=arr[3]&&temp.charAt(i)!=arr[4])
						System.out.print(temp.charAt(i));
			}
			System.out.println();
		}
	}
// import 
// ctrl+shift+o
}
