package silver;

import java.util.HashSet;
import java.util.Scanner;

public class silver_3273 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();//������ ũ��
		int [] arr = new int [n];//������ ���ԵǴ� ��
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			set.add(arr[i]);
		}		
		
		int x = sc.nextInt();//���������� �����ϴ� ��
		sc.close();	
		
		int count =0;
	}
}
