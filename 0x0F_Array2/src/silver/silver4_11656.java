package silver;

import java.util.Arrays;
import java.util.Scanner;

public class silver4_11656 {

	//접미사배열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();//문자 입력받기
		sc.close();
		// 배열의 크기는 글자수만큼
		String [] Arr = new String[S.length()];
		
		//배열에 글자 substring해서 넣어주기
		for(int i=0;i<S.length();i++) {
			Arr[i]=S.substring(i);
		}
		//정렬
		Arrays.sort(Arr);
		//출력
		for(int i=0;i<S.length();i++) {
			System.out.println(Arr[i]);
		}
	}
}
