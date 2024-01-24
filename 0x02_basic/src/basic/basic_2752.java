package basic;

import java.util.Arrays;
import java.util.Scanner;

public class basic_2752 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B=sc.nextInt();
		int C =sc.nextInt();
	
		sc.close();
		
		int[] array = {A,B,C};
		
		//자바에서 기본 제공하는 정렬 함수
		// 추가적 정렬 알고리즘 : 퀵 정렬, 삽입정렬, 버블 정렬
		
		Arrays.sort(array);
	
		for(int i =0;i<3;i++) {
			System.out.println(array[i]);
		}
	}

}
