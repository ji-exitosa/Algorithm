package d200505;
import java.io.*;
import java.util.*;
public class Solution_1946_간단한압축풀기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			String temp = "";
			int N = Integer.parseInt(br.readLine());		
			for(int n=0; n<N; n++) {
				st = new StringTokenizer(br.readLine()," ");
				String repeatedStr = st.nextToken();
				int repeat = Integer.parseInt(st.nextToken());
				for(int r = 0; r<repeat; r++)
					temp=temp.concat(repeatedStr);
			}
			System.out.println("#" + test_case);
			for(int i=0; i<temp.length()/10; i++)
				System.out.println(temp.subSequence(i*10, (i+1)*10));
			System.out.println(temp.subSequence((temp.length()/10)*10, (temp.length()/10)*10+temp.length()%10));
		}
	}
}
