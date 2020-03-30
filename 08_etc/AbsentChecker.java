package absentChecker;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AbsentChecker {

	public static void main(String[] args) throws Exception {
		// 반 명단 입력받기
		String[] nameArray = new String[25];
		System.setIn(new FileInputStream("res/list.txt"));
		BufferedReader brList = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 25; i++) 
			nameArray[i] = brList.readLine();
		
		boolean sbdAbsent = false;
		// 출석 목록 입력받기
		System.setIn(new FileInputStream("res/temp.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int repeatNum = st.countTokens();
		//String[] strArray = new String[25];
		String temp = "";
		for (int i = 0; i < repeatNum; i++) {
			temp = st.nextToken();
			if (temp.length() > 9 && temp.charAt(7) == '9') {
				temp = temp.substring(1, 4);
				for(int idx=0; idx<25; idx++) {
					if(temp.compareTo(nameArray[idx])==0) {
						nameArray[idx]="";
					}
				}
			}
		}

		for(String t:nameArray) {
			if(t.compareTo("")>0) {
				System.out.println(t);
				sbdAbsent=true;
			}
		}
		
		if(!sbdAbsent)
			System.out.println("전원출석");
	}

}
