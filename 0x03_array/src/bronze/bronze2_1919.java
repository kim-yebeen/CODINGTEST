package bronze;

import java.util.Scanner;
import java.util.Arrays;

public class bronze2_1919 {
public static void main(String[] args) {
	//�ֳʱ׷� �����
	
	//�ܾ�� �ҹ���
	Scanner sc= new Scanner(System.in);
	String A = sc.next();
	String B = sc.next();
	sc.close();
	
	//���ڿ��� ���
	char[] Asort=A.toCharArray();
	char[] Bsort=B.toCharArray();
	
    //���ڿ� ����
    Arrays.sort(Asort);
    Arrays.sort(Bsort);
    
	int count =0;
	int i=0;
    int j=0;
	//���ڿ��� ���� ��� count++
    //aabc abc
    while(i<Asort.length && j<Bsort.length){
        if(Asort[i]==Bsort[j]){//a-a
            i++;
            j++;
            count++;
        }else if(Asort[i]<Bsort[j]){//a-b
            i++;//b-b
        }else{
            j++;
        }
    }
	//asort���� +bsort���� - count(�������ڿ�)*2
    System.out.println(Asort.length+Bsort.length-count*2);
	
}
	

}