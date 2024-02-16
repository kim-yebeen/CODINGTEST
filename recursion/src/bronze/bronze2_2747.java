package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

//�Ǻ���ġ ��
public class bronze2_2747 {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in); //�Է¹ޱ�
		//int num = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num+1];
		arr[0]=0;
		arr[1]=1;
		
		System.out.println(recursion(num, arr));
		br.close();

	}
	
	static int recursion(int i, int[] arr) {
		if(i<=1) return arr[i];
		if(arr[i]==0) {//���̱⺻������ 0���� �ʱ�ȭ�Ǿ��ձ⶧����..
			arr[i]=recursion(i-1, arr)+recursion(i-2,arr);
		}
		return arr[i];
	}
	
}
