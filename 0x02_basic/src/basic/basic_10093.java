package basic;

import java.util.Scanner;

public class basic_10093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�� ���� ������ �־����� ��, �� �� ���̿� �ִ� ������ ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		//A�� 1�̶� 1000���̿�, B�� 1�̶� 1000���̿� 
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		//ù° �ٿ��� �� �� ���̿� �ִ� ���� ������ ����Ѵ�.

		//��°�ٿ��� �� �� ���̿� �ִ� ���� ������������ ����Ѵ�.
	
		//A=B�� ���� ���
		if(A==B){
			System.out.println("0");
			System.out.println("0");
		}//B�� A���� ���� ���
		else if(A>B) {
			System.out.println(A-B-1);

			for(long i=B+1;i<A;i++) {
				System.out.print(i+" ");
			}
		}
		else if(A<B){
			System.out.println(B-A-1);
			
			for(long i=A+1;i<B;i++) {
				System.out.print(i+" ");
		}
		}
		}
}