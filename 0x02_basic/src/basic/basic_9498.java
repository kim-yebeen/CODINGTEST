package basic;

import java.util.Scanner;

public class basic_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		if(x>=0 && x<=100) {
		
			if(x>=90) {
				System.out.println("A");
			}else if(x>=80) {
				System.out.println("B");
			}else if(x>=70) {
				System.out.println("C");
			}else if(x>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
		else {
			System.out.println("0과 100사이의 숫자를 입력하세요");
		}
	}

}
