package d200505;
import java.io.*;
public class Solution_1928_Base64Decoder {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_1928.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int storage[] = new int[123];
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			String temp = br.readLine();
			int tempInt = 0;
			for(int i=0; i<26; i++) {
				storage['A'+i] = i;
				storage['a'+i] = i+26;
			}
			for(int i=52; i<62; i++)
				storage['0'+i-52] = i;
			storage['+'+0]=62;
			storage['/'+0]=63;
			String six2str = "";
			for(int i=0; i<temp.length(); i++) {
				tempInt = storage[temp.charAt(i)];
				String tempBinary = Integer.toBinaryString(tempInt);
				for(int j=0; j<6-tempBinary.length(); j++)
					six2str=six2str.concat("0");
				six2str=six2str.concat(tempBinary);
			}
			System.out.print("#" + test_case + " ");
			for(int i=0; i<six2str.length(); i=i+8) 
				System.out.print((char)Integer.parseInt(six2str.subSequence(i, i+8).toString(),2));
			System.out.println();
		}
	}
}
