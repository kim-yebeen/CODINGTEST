package basic;

import java.util.Scanner;

public class basic_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
			
		
		for(int i=1; i<=N; i++) {
			//자바에서는 문자 곱하기가 *로 불가능하고 .repeat으로 해야함
			System.out.println(" ".repeat(N-i)+"*".repeat(i));
			
		}
		
	}
	
}
