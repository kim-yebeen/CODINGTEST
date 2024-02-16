package basic;

import java.util.Scanner;

public class bronze2_10804 {

//카드 역배치
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열에 1-20까지 넣기
        int[] cards = new int[20];
        for (int i = 0; i < 20; i++) {
            cards[i] = i + 1;
        }

        // 10개의 구간에 대해 처리
        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt();//시작위치번호
            int end = sc.nextInt();//끝위치번호

            // 주어진 구간의 카드 뒤집기
            for (int j = 0; j < (end - start + 1) / 2; j++) {
                int k = cards[start - 1 + j];
                cards[start - 1 + j] = cards[end - 1 - j];
                cards[end - 1 - j] = k;
            }
        }

        sc.close();

        // 결과 출력
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
    }
}
