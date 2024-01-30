package bronze;

import java.util.Scanner;
import java.util.Arrays;

public class bronze2_1919 {
public static void main(String[] args) {
	//애너그램 만들기
	
	//단어는 소문자
	Scanner sc= new Scanner(System.in);
	String A = sc.next();
	String B = sc.next();
	sc.close();
	
	//문자열에 담기
	char[] Asort=A.toCharArray();
	char[] Bsort=B.toCharArray();
	
    //문자열 정렬
    Arrays.sort(Asort);
    Arrays.sort(Bsort);
    
	int count =0;
	int i=0;
    int j=0;
	
    while(i<Asort.length && j<Bsort.length){
        if(Asort[i]==Bsort[j]){
            i++;
            j++;
            count++;
        }else if(Asort[i]<Bsort[j]){
            i++;
        }else{
            j++;
        }
    }
	
    System.out.println(Asort.length+Bsort.length-count*2);
	}
	

}