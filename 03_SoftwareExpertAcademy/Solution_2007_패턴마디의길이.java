package d200419;
import java.io.*;
public class Solution_2007_패턴마디의길이 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sea_2007.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int T = Integer.parseInt(br.readLine().trim());
		String storage;
		for(int test_case = 1; test_case<=T; test_case++) {
			storage = br.readLine();
			int i=1;
			while(!((storage.subSequence(0, i).equals((String)storage.subSequence(i+1,2*i+1)))&&
					(storage.subSequence(i+1,2*i+1).equals((String)storage.subSequence(2*(i+1),3*i+2)))))
				i++;
			System.out.println("#"+test_case+" " + (i+1));
		}
	}
}
