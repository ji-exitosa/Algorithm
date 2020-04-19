package d200417;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
public class Solution_8840_아바바바 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/sea_8840.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Integer.parseInt(br.readLine());		
		for(int test_case = 1; test_case<=T; test_case++) {
			BigDecimal L = BigDecimal.valueOf(Long.parseLong(br.readLine())/2);
//			System.out.println("#" + test_case + " " + ((L-1)*(L-1)/4));
			BigDecimal sum = L.pow(2);
			System.out.println("#" + test_case + " " + sum);
		}
	}
}