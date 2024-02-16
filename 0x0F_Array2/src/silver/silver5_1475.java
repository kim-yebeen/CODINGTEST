package silver;

import java.util.Scanner;

public class silver5_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		String N = sc.next(); //방번호입력받음
		
		int count=0; //필요한 숫자 세트의 개수
		
		for(int i=0;i<N.length();i++) {
			//글자 하나하나 꺼내서 비교
			int k=Integer.parseInt(N.substring(i,i+1));
			
			if(k==9) {
				arr[6]++; //9는 6으로 뒤집어 쓸 수 있다.
			}else {
				arr[k]++;
			}
		}
		for(int i=0;i<arr.length; i++) {
			//1.6일 경우
			if(i==6) {
				if(arr[i]%2==0) {
					//2로 나눠지면, 나눈 값이 필요한 세트의 수
					count=Math.max(count, arr[i]/2);
				}else {
					//2로 안나눠지면 나눈값 + 1이 필요한 수
					count=Math.max(count,arr[i]/2 +1);
				}
			}
			//2. 나머지 값의 경우 그냥 arr[i]에 적힌 수가 필요한 세트의 수
			else {
				count = Math.max(count, arr[i]);
			}
		}
		System.out.println(count);
		
		
	}
}
