package basic;

import java.util.Scanner;

public class bronze2_10804 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1���� 20���� ������������ �ʱ�ȭ�� �迭
        int[] cards = new int[20];
        for (int i = 0; i < 20; i++) {
            cards[i] = i + 1;
        }

        // 10���� ������ ���� ó��
        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            // �־��� ������ ī�� ������
            for (int j = 0; j < (end - start + 1) / 2; j++) {
                int k = cards[start - 1 + j];
                cards[start - 1 + j] = cards[end - 1 - j];
                cards[end - 1 - j] = k;
            }
        }

        sc.close();

        // ��� ���
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
    }
}
