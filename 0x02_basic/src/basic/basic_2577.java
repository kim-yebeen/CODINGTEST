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
		
		//����ȯ�ϱ�
		String rs = Integer.toString(result);
		
		int count=0;
		
		//���ڿ� i�� �ش��ϴ� ���� ������ count�÷���
		//for���� ���� ���ڿ��� �����ϴ��� Ȯ��
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
