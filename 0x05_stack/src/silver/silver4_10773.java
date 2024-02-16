package silver;

import java.util.Scanner;
import java.util.Stack;

public class silver4_10773 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int K = sc.nextInt(); //���� ������ ����
		
		Stack<Integer> stack = new Stack<>();
		
		int sum=0;
		
		for(int i=0;i<K;i++) {
			int num=sc.nextInt();
			
			if(num!=0)//�Էµ� ���� 0�� �ƴ� ���
			{
				stack.push(num);//0�� �ƴѼ��� ���ÿ� �߰�
				sum+=num;
			}
			else {//�Էµ� ���� 0�� ���
				int rmNum=stack.pop();//���ÿ� ���� ���� �ִ� ��Ҹ� �����ϰ� ��ȯ�ϴ� �Լ�
				sum-=rmNum;
			}
		}
		System.out.println(sum);
	}
}
