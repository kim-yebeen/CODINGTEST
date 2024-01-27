package basic;

import java.util.Scanner;
public class basic_2577 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int result=A*B*C;
		
		//형변환하기
		String rs = Integer.toString(result);
		
		int count=0;
		
		//문자에 i에 해당하는 숫자 있으면 count올려줌
		//for문을 통해 문자열이 존재하는지 확인
		for(int i=0;i<10;i++) {
			for(int j=0;j<rs.length(); j++)
			{if(rs.indexOf(j)>-1) 
			{
				count++;
			}
			}
			System.out.println(count);
		}
	}

}
