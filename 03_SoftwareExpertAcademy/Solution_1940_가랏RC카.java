package d200505;
import java.io.*;
import java.util.*;
public class Solution_1940_가랏RC카 {
	public static void main(String[] args) throws Exception{
		int command[] = {0,1,-1};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int moved = 0,speed = 0, input = 0;
			for(int n=0;n<N;n++) {
				st=new StringTokenizer(br.readLine()," ");
				input = Integer.parseInt(st.nextToken());
				if(input==0) {}
				else
					speed += command[input]*Integer.parseInt(st.nextToken());
				if(speed<0)
					speed = 0;
				moved += speed;
			}
			System.out.print("#" + test_case + " " + moved);
		}
	}
}
