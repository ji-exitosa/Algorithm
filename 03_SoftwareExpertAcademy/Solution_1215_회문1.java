package d200508;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class Solution_1215_회문1 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_1215.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			int answer = 0;
			int len = Integer.parseInt(br.readLine());
			char arr[][] = new char[8][8];
			String temp;
			for (int i = 0; i < 8; i++) {
				temp = br.readLine();
				for (int j = 0; j <= 8 - len; j++) 
					if (isPalindrome(temp.substring(j, j + len)))
						answer++;
				arr[i] = temp.toCharArray();
			}
			for (int j = 0; j < 8; j++) {
				temp="";
				for (int i = 0; i < 8; i++) 
					temp+=arr[i][j];
				for (int i = 0; i <= 8 - len; i++) 
					if (isPalindrome(temp.substring(i, i + len)))
						answer++;
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}

	private static boolean isPalindrome(String substring) {
		// n이 짝수면 pi 개수가 n/2개 --> 4/2 = 2 앞뒤로 2개씩
		// n이 홀수면 pi 개수가 (n-1)/2개 --> 3/2 = 1 앞뒤로 1개씩
		boolean returnval = true;
		int len = substring.length();
		for (int i = 0; i < len / 2; i++) {
				if (substring.charAt(i) != substring.charAt(len-1-i)) {
					returnval = false;
					break;
				}
		}
//		System.out.print(substring + " " + returnval + " / ");
		return returnval;
	}

}
