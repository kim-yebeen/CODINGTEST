package silver;

import java.util.Scanner;

public class silver5_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		String N = sc.next(); //���ȣ�Է¹���
		
		int count=0; //�ʿ��� ��Ʈ�� ����
		
		for(int i=0;i<N.length();i++) {
			int k=Integer.parseInt(N.substring(i,i+1));
			
			if(k==9) {
				arr[6]++; //9�� 6���� ������ �� �� �ִ�.
			}else {
				arr[k]++;
			}
		}
		for(int i=0;i<arr.length; i++) {
			if(i==6) {
				if(arr[i]%2==0) {
					count=Math.max(count, arr[i]/2);
				}else {
					count=Math.max(count,arr[i]/2 +1);
				}
			}else {
				count = Math.max(count, arr[i]);
			}
		}
		System.out.println(count);
		
		
	}
}
