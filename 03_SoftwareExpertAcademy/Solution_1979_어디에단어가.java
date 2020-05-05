package d200504;
import java.util.*;
public class Solution_1979_어디에단어가 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; test_case++) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			int answer = 0;
			int arry[] = new int[N];
			for(int n=0; n<N; n++) {	
				int x=0;
				for(int m=0; m<N; m++) {
					if(sc.nextInt()==1){
						++x;
						++arry[m];
					}else {
						arry[m]=0;
						x=0;
					}
					if(x==K) answer++;
					if(arry[m]==K) answer++;
					if(x==K+1)  answer--;
					if(arry[m]==K+1)  answer--;
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
