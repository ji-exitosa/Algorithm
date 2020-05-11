package d200510;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1234_비밀번호 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1234.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case<=10; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			String input = st.nextToken();
			LinkedList <Integer> list = new LinkedList<Integer>();
			for(int i=0; i<input.length(); i++)
				list.add(input.charAt(i)-'0');
			for(int i=1; i<list.size(); i++) {
				if(list.get(i-1)==list.get(i)) {
					list.remove(i);
					list.remove(i-1);
					i=i-2>=0?i-2:0;
				}
			}
			System.out.print("#" + test_case + " ");
			for(int i=0; i<list.size(); i++)
				System.out.print(list.get(i)+"");
			System.out.println();
		}
	}
}
