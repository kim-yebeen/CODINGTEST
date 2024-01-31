package basic;

import java.util.Arrays;
import java.util.Scanner;

public class bronze2_2309 {
//ÀÏ°ö³­ÀïÀÌ
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
	
		//ÀÏ°ö³­ÀïÀÌ hap = 100
		// sum = hap + ºô·± 2¸í
		// sum-ºô·± 2¸í=100
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
		
		//¿À¸§Â÷¼øÀ¸·Î Á¤·Ä ¹× Ãâ·Â
		Arrays.sort(arr);
		for(int i=2;i<9;i++) {
			System.out.println(arr[i]);
		}
	}
}
