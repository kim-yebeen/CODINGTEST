package silver;

import java.util.Scanner;

public class silver5_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		String N = sc.next(); //���ȣ�Է¹���
		
		int count=0; //�ʿ��� ���� ��Ʈ�� ����
		
		for(int i=0;i<N.length();i++) {
			//���� �ϳ��ϳ� ������ ��
			int k=Integer.parseInt(N.substring(i,i+1));
			
			if(k==9) {
				arr[6]++; //9�� 6���� ������ �� �� �ִ�.
			}else {
				arr[k]++;
			}
		}
		for(int i=0;i<arr.length; i++) {
			//1.6�� ���
			if(i==6) {
				if(arr[i]%2==0) {
					//2�� ��������, ���� ���� �ʿ��� ��Ʈ�� ��
					count=Math.max(count, arr[i]/2);
				}else {
					//2�� �ȳ������� ������ + 1�� �ʿ��� ��
					count=Math.max(count,arr[i]/2 +1);
				}
			}
			//2. ������ ���� ��� �׳� arr[i]�� ���� ���� �ʿ��� ��Ʈ�� ��
			else {
				count = Math.max(count, arr[i]);
			}
		}
		System.out.println(count);
		
		
	}
}
