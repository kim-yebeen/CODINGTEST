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
	
		//A�� B���� ���� ���
		if(B>A){
			System.out.println(B-A-1);
			while((B-A)>1) {
				A++;
				System.out.print(A + " ");
			}
		}//B�� A���� ���� ���
		else if(A<B) {
			System.out.println(A-B-1);
			while((A-B)>1) {
				B++;
				System.out.print(B + " ");
				}
		}//A=B�� ���� ���
		else{
			System.out.println("0");
		}
		
	}
}
