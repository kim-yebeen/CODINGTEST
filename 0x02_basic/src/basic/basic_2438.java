package basic;

import java.util.Scanner;

public class basic_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
	
		for(int i=1; i<=N; i++) {
			//�ڹٿ����� ���� ���ϱⰡ *�� �Ұ����ϰ� .repeat���� �ؾ���
			System.out.println("*".repeat(i));
			//�ٹٲ� ���ص� �ǳ�..
			//System.out.println("\n");
		}
		
	}
	
}