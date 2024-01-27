package basic;

import java.util.Scanner;

public class basic_2567 {
	public static void main(String[] args) {
		//min 함수 Math.min(a,b); a와 b 두 인자 중 가장 작은 값을 리턴하는 함수
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int min =100;
		for(int i=0;i<7;i++) {
			int N = sc.nextInt();
			
			if(N%2==1) {
				sum+=N;
				min = Math.min(min, N);
			}
		}
		
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
