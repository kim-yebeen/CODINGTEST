package basic;

import java.util.Scanner;

public class bronze2_10804 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1부터 20까지 오름차순으로 초기화된 배열
        int[] cards = new int[20];
        for (int i = 0; i < 20; i++) {
            cards[i] = i + 1;
        }

        // 10개의 구간에 대해 처리
        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

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
