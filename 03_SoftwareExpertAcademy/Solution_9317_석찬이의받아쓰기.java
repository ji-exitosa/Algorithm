package d200510;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_9317_석찬이의받아쓰기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			int answer = 0;
			int N = Integer.parseInt(br.readLine());
			String correct = br.readLine();
			String needtocheck = br.readLine();
			int len = correct.length();
			for(int i=0; i<len; i++) {
				if(correct.charAt(i)==needtocheck.charAt(i))
					answer++;
			}
			System.out.print("#" + test_case + " " + answer);
		}
	}
}
