package basic;

import java.util.Scanner;

public class basic_2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		//println은 엔터 쳐짐
		//print는 엔터 안쳐짐
		for(int i =N-1;i>=0;i--) {
			for(int j=0;j<=N-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*이클립스에서는 돌아가는데 백준에서 안돌아감..
		for(int i=N; i>=1; i--) {
			int n=1;
			System.out.println(" ".repeat(N-i)+
					"*".repeat(2*i-n)
					+" ".repeat(N-i));
			n=n+2;
		}*/
		
	}

}