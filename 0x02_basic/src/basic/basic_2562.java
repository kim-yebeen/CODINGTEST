package basic;

import java.util.Scanner;

public class basic_2562 {
	public static void main(String[] args) {
		
		//��ĳ�ʸ� ���� �Է¹ޱ�
		//�迭�� �ֱ�
		//max���� �迭�� ��? ���ϱ�
		//�ִ밪 ���
		//��°�����
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
