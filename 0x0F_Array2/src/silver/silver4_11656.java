package silver;

import java.util.Arrays;
import java.util.Scanner;

public class silver4_11656 {

	//���̻�迭
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();//���� �Է¹ޱ�
		sc.close();
		// �迭�� ũ��� ���ڼ���ŭ
		String [] Arr = new String[S.length()];
		
		//�迭�� ���� substring�ؼ� �־��ֱ�
		for(int i=0;i<S.length();i++) {
			Arr[i]=S.substring(i);
		}
		//����
		Arrays.sort(Arr);
		//���
		for(int i=0;i<S.length();i++) {
			System.out.println(Arr[i]);
		}
	}
}
