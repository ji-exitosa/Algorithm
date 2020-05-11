package d200505;
import java.io.*;
import java.util.LinkedList;
import java.util.Set;
public class Solution_1928_Base64Decoder3 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1928.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		LinkedList <Character> list = new LinkedList<Character>();
/*		Set <Character> set = new Set<Character>();*/
		for(int test_case = 1; test_case<=T; test_case++) {
			String temp = br.readLine();
			int tempInt = 0;
			for(int i=0; i<26; i++) {
				list.add((char) ('A'+i));
//				set.add((char) ('A'+i));
			}
			for(int i=26; i<52; i++) {
				list.add((char) ('a'+i-26));
//				set.add((char) ('a'+i-26));
			}
			for(int i=52; i<62; i++) {
				list.add((char) ('0'+i-52));
//				set.add((char) ('0'+i-52));
			}
			list.add('+');
//			set.add('+');
			list.add('/');
//			set.add('/');
/*			for(int i=0; i<list.size();i++) {
//				System.out.println(list.get(i));
			}*/
			/*System.out.println(set.contains((char)('a')));*/
/*			String binary24 = "";
			for(int i=0; i<temp.length(); i++) {
				tempInt = temp.charAt(i)-'A';
				String tempBinary = Integer.toBinaryString(tempInt);
				System.out.println(tempBinary.length());
				for(int j=0; j<8-tempBinary.length(); j++) {
					binary24=binary24.concat("0");
				}
				binary24=binary24.concat(tempBinary);
				System.out.println(binary24);
			}*/
			//TGl
			/*10011
			110
			101011*/
			
			System.out.println("#" + test_case + " " + 1);
		}
	}
}
