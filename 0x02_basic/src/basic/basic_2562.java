package basic;

import java.util.Scanner;

public class basic_2562 {
	public static void main(String[] args) {
		
		//스캐너를 통해 입력받기
		//배열에 넣기
		//max값의 배열의 수? 구하기
		//최대값 출력
		//번째수출력
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int arr[] = new int[9];
		int num=0;
		
		for(int i=0; i<9;i++) {
			arr[i] = sc.nextInt();
			max = Math.max(arr[i], max);
			
			if(arr[i]>max) {
				num=i;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}

}
