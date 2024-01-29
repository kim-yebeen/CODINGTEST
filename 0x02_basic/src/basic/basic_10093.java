package basic;

import java.util.Scanner;

public class basic_10093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.
		
		//A는 1이랑 1000사이에, B도 1이랑 1000사이에 
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		//첫째 줄에는 두 수 사이에 있는 수의 개수를 출력한다.

		//둘째줄에는 두 수 사이에 있는 수를 오름차순으로 출력한다.
	
		//A가 B보다 작을 경우
		if(B>A){
			System.out.println(B-A-1);
			while((B-A)>1) {
				A++;
				System.out.print(A + " ");
			}
		}//B가 A보다 작을 경우
		else if(A<B) {
			System.out.println(A-B-1);
			while((A-B)>1) {
				B++;
				System.out.print(B + " ");
				}
		}//A=B가 같은 경우
		else{
			System.out.println("0");
		}
		
	}
}
