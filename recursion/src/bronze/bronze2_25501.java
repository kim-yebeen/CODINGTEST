package bronze;

//재귀의 귀재
import java.util.Scanner;

public class bronze2_25501 {
	
	static int count;
	
	//main 함수
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();//테스트케이스 개수 T
		
		for(int i=0; i<T; i++) {
			count=0;
			String S = sc.next(); //문자열			
			System.out.println(isPalindrome(S)+" "+count); 
		}
        sc.close();		
	}
	
	//재귀함수
	public static int recursion(String s, int l, int r) {
		count++; //재귀 호출이 일어나면 호출 횟수 증가
		if(l>=r) return 1;
		else if(s.charAt(l)!=s.charAt(r))return 0;
		else return recursion(s,l+1,r-1);
	}
    
	//Palindrome함수
	public static int isPalindrome(String s) {
		return recursion(s,0,s.length()-1);
	}
	

}
