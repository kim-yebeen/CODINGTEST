package basic;

import java.util.Scanner;

public class basic_2440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
			
		
		for(int i=N; i>=1; i--) {
			//�ڹٿ����� ���� ���ϱⰡ *�� �Ұ����ϰ� .repeat���� �ؾ���
			System.out.println("*".repeat(i));
			
		}
		
	}

}
