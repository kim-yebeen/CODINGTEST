package basic;

import java.util.Scanner;

public class basic_2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		//println�� ���� ����
		//print�� ���� ������
		for(int i =N-1;i>=0;i--) {
			for(int j=0;j<=N-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*��Ŭ���������� ���ư��µ� ���ؿ��� �ȵ��ư�..
		for(int i=N; i>=1; i--) {
			int n=1;
			System.out.println(" ".repeat(N-i)+
					"*".repeat(2*i-n)
					+" ".repeat(N-i));
			n=n+2;
		}*/
		
	}

}