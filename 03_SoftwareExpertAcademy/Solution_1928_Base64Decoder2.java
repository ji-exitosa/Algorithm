package d200505;
import java.io.*;
public class Solution_1928_Base64Decoder2 {
	public static void main(String[] args) throws Exception{
		int arr[][] = new int[64][2];
		System.setIn(new FileInputStream("res/sea_1928.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			String temp = br.readLine();
			int tempInt = 0;
/*			for(int i=0; i<26; i++) {
				arr[i][0] = i;
				arr[i][1] = 'A'+i;
				arr[i+26][0] = i+26;
				arr[i+26][1] = 'a'+i;
				System.out.println(arr[i][0] + " " + (char)arr[i][1]);
				System.out.println(arr[i+26][0] + " " + (char)arr[i+26][1]);
			}
			for(int i=52; i<62; i++){
				arr[i][0] = i;
				arr[i][1] = i-52;
				System.out.println(arr[i][0] + " " + arr[i][1]);
			}
			arr[62][0] = 62;
			arr[62][1] = '+';
			arr[63][0] = 63;
			arr[63][1] = '/';*/

			String binary24 = "";
			for(int i=0; i<temp.length(); i++) {
				tempInt = temp.charAt(i)-'A';
				String tempBinary = Integer.toBinaryString(tempInt);
				System.out.println(tempBinary.length());
				for(int j=0; j<8-tempBinary.length(); j++) {
					binary24=binary24.concat("0");
				}
				binary24=binary24.concat(tempBinary);
				System.out.println(binary24);
			}
			//TGl
			/*10011
			110
			101011*/
			
			System.out.println("#" + test_case + " " + 1);
		}
	}
}
