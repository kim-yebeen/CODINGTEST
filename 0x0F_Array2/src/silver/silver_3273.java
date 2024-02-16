package silver;

import java.util.HashSet;
import java.util.Scanner;

public class silver_3273 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();//수열의 크기
		int [] arr = new int [n];//수열에 포함되는 수
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			set.add(arr[i]);
		}		
		
		int x = sc.nextInt();//수열의합을 만족하는 수
		sc.close();	
		
		int count =0;
	}
}
