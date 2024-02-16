package bronze;

//����� ����
import java.util.Scanner;

public class bronze2_25501 {
	
	static int count;
	
	//main �Լ�
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();//�׽�Ʈ���̽� ���� T
		
		for(int i=0; i<T; i++) {
			count=0;
			String S = sc.next(); //���ڿ�			
			System.out.println(isPalindrome(S)+" "+count); 
		}
        sc.close();		
	}
	
	//����Լ�
	public static int recursion(String s, int l, int r) {
		count++; //��� ȣ���� �Ͼ�� ȣ�� Ƚ�� ����
		if(l>=r) return 1;
		else if(s.charAt(l)!=s.charAt(r))return 0;
		else return recursion(s,l+1,r-1);
	}
    
	//Palindrome�Լ�
	public static int isPalindrome(String s) {
		return recursion(s,0,s.length()-1);
	}
	

}
