package basic;

import java.util.Arrays;
import java.util.Scanner;

public class bronze2_2309 {
//�ϰ�������
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
	
		//�ϰ������� hap = 100
		// sum = hap + ���� 2��
		// sum-���� 2��=100
		int arr[] = new int[9];
		int sum=0;
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
	
		sc.close();
		
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if(sum - arr[i] - arr[j]==100) {
					arr[i]=0;
					arr[j]=0;
					i=9;
					break;
				}
			}
		}
		
		//������������ ���� �� ���
		Arrays.sort(arr);
		for(int i=2;i<9;i++) {
			System.out.println(arr[i]);
		}
	}
}
