package bronze;

import java.util.Scanner;

public class bronze2_133000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//한 방에 배정할 수 있는 최대 인원수 K가 주어졌을 때
		//조건에 맞게 모든 학생을 배정하기 위해 필요한 방의 최소 개수를 구하는 프로그램
		//같은 학년, 같은 성별만 방을 같이 사용할 수 있음
		
		//참가하는 학생의 수 N, 한 방에 배정할 수 있는 최대 인원수 K
		long N = sc.nextLong();
		long K = sc.nextLong();
		int count = 0;
		// 01/0123456
		int[][] Student = new int[2][7];
		
		for(int i=0;i<N;i++) {
			int S = sc.nextInt();//성별
			int Y = sc.nextInt();//학년
		
			Student[S][Y]++;
		}
		sc.close();
		
		for(int i = 0; i < 2; i++) {
            for (int j = 1; j <= 6; j++) {
            	//Student[i][j]double로 해서 소수점나눗셈?가능하게
            	//최대인원수로 나눈 몫을 반올림해서 count해줌
                count += Math.ceil((double) Student[i][j] / K);
            }
        }
		System.out.println(count);
		
	}
}
