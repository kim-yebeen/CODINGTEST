package bronze;

import java.util.Scanner;
public class bronze2_2577 {
//������ ����
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//a*b*c ��� ����� 0���� 9���� ������ ���ڰ� �� ���� ��������
		//100���� ũ�� 1000���� ���� �ڿ��� ->long Ÿ�� ���
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		sc.close();
		
		String result = Long.toString(A*B*C);
		
		int [] count = new int[10];
		
		//�ش� ���ڰ� ������ count[i] ++
		for(int i=0;i<10; i++) {
			for(int j=0;j<result.length();j++)
				{
				//���ڿ��� ���ڿ��� ��
				String k = Integer.toString(i);
				//string Ÿ�԰� char �ٷ� �񱳿��� �Ұ���. k�� charAt���Τ� ���ֱ�
				if(result.charAt(j)==k.charAt(0)) {
					count[i]++;
				}
			
		}System.out.println(count[i]);
	}
	}
}
