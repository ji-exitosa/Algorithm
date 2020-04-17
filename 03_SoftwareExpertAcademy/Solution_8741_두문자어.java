package d200416;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8741_두문자어 {

	static String answer;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_8741.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			st = new StringTokenizer(br.readLine()," ");
			int l = st.countTokens();
			answer = "";
			for(int i=0; i<l; i++) {
				answer = answer.concat(st.nextToken().substring(0, 1));
			}
			System.out.println("#" + test_case + " " + answer.toUpperCase());
		}
	}
}
