package basic;

import java.util.Scanner;
import java.util.Arrays;

public class basic_2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�迭 ���� �� ũ�� �Ҵ�
		int[] arr = new int[5];
		int sum = 0;
		
		//for ���� ���� ���� ���ϱ�
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum/5);
		Arrays.sort(arr);//�迭������ ���� �߾Ӱ� ���ϱ�
		System.out.println(arr[2]);
	}
}
