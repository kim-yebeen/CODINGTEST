package bronze;

import java.util.Scanner;

public class bronze2_133000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�� �濡 ������ �� �ִ� �ִ� �ο��� K�� �־����� ��
		//���ǿ� �°� ��� �л��� �����ϱ� ���� �ʿ��� ���� �ּ� ������ ���ϴ� ���α׷�
		//���� �г�, ���� ������ ���� ���� ����� �� ����
		
		//�����ϴ� �л��� �� N, �� �濡 ������ �� �ִ� �ִ� �ο��� K
		long N = sc.nextLong();
		long K = sc.nextLong();
		int count = 0;
		// 01/0123456
		int[][] Student = new int[2][7];
		
		for(int i=0;i<N;i++) {
			int S = sc.nextInt();//����
			int Y = sc.nextInt();//�г�
		
			Student[S][Y]++;
		}
		sc.close();
		
		for(int i = 0; i < 2; i++) {
            for (int j = 1; j <= 6; j++) {
            	//Student[i][j]double�� �ؼ� �Ҽ���������?�����ϰ�
            	//�ִ��ο����� ���� ���� �ݿø��ؼ� count����
                count += Math.ceil((double) Student[i][j] / K);
            }
        }
		System.out.println(count);
		
	}
}
