package basic;

import java.util.Arrays;
import java.util.Scanner;

public class basic_2752 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B=sc.nextInt();
		int C =sc.nextInt();
	
		sc.close();
		
		int[] array = {A,B,C};
		
		//�ڹٿ��� �⺻ �����ϴ� ���� �Լ�
		// �߰��� ���� �˰����� : �� ����, ��������, ���� ����
		
		Arrays.sort(array);
	
		for(int i =0;i<3;i++) {
			System.out.println(array[i]);
		}
	}

}