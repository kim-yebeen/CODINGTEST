package silver;

import java.util.Scanner;
import java.util.Stack;

public class silver4_10773 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int K = sc.nextInt(); //받을 정수의 개수
		
		Stack<Integer> stack = new Stack<>();
		
		int sum=0;
		
		for(int i=0;i<K;i++) {
			int num=sc.nextInt();
			
			if(num!=0)//입력된 수가 0이 아닌 경우
			{
				stack.push(num);//0이 아닌수는 스택에 추가
				sum+=num;
			}
			else {//입력된 수가 0일 경우
				int rmNum=stack.pop();//스택에 가장 위에 있는 요소를 제거하고 반환하는 함수
				sum-=rmNum;
			}
		}
		System.out.println(sum);
	}
}
