package basic;

import java.util.Scanner;

public class basic_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
			
		
		for(int i=1; i<=N; i++) {
			//�ڹٿ����� ���� ���ϱⰡ *�� �Ұ����ϰ� .repeat���� �ؾ���
			System.out.println(" ".repeat(N-i)+"*".repeat(i));
			
		}
		
	}
	
}