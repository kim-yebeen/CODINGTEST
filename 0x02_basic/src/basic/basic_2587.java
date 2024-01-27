package basic;

import java.util.Scanner;
import java.util.Arrays;

public class basic_2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열 선언 및 크기 할당
		int[] arr = new int[5];
		int sum = 0;
		
		//for 문을 통해 합을 구하기
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum/5);
		Arrays.sort(arr);//배열정렬을 통해 중앙값 구하기
		System.out.println(arr[2]);
	}
}
