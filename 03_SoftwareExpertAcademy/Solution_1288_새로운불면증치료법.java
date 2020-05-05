package d200505;
import java.io.*;
public class Solution_1288_새로운불면증치료법 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			String nstr;
			int goal = 1023;
			int answer = 0;
			int mul = 1;
			while (answer != 1023) {
				nstr = Integer.toString(N * (mul++));
				for(int l = 0; l<nstr.length(); l++) {
					//System.out.print(nstr.charAt(l)-'0'+ " ");
					answer = (1<<(nstr.charAt(l)-'0'))&goal | answer;
					//System.out.println(nstr.charAt(l)-'0' + " " + Integer.toBinaryString(answer ));
				}
/*				answer = (1 << 9)&goal;
				System.out.println(Integer.toBinaryString(answer ));*/
				
			}
			
//			while(checker)
//			
			System.out.print("#" + test_case + " " + (mul-1)*N);
//			for(int i=0; i<5; i++)
//				System.out.print(answer[i] + " " );
//			System.out.println();
		}
	}
}
