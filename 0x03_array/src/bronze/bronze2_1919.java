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
	//문자열이 같을 경우 count++
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
	//asort길이 +bsort길이 - count(같은문자열)*2
    System.out.println(Asort.length+Bsort.length-count*2);
	
}
	

}