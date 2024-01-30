package bronze;

import java.util.Scanner;
public class bronze2_2577 {
//숫자의 개수
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//a*b*c 계산 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지
		//100보다 크고 1000보다 작은 자연수 ->long 타입 사용
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		sc.close();
		
		String result = Long.toString(A*B*C);
		
		int [] count = new int[10];
		
		//해당 숫자가 있으면 count[i] ++
		for(int i=0;i<10; i++) {
			for(int j=0;j<result.length();j++)
				{
				//문자열은 문자열과 비교
				String k = Integer.toString(i);
				//string 타입과 char 바로 비교연산 불가능. k를 charAt으로ㅗ 해주기
				if(result.charAt(j)==k.charAt(0)) {
					count[i]++;
				}
			
		}System.out.println(count[i]);
	}
	}
}
