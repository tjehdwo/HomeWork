

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("숫자를 입력해주세요.");
           int num = sc.nextInt();
           
           if(num < 1) {
        	   System.out.println("1 이상의 숫자를 말해주세요.");
           }else {
        	   for(int i = 1;i<=num;i++) {
        		   System.out.println(i);   
        	   }
        	   
           }
           
           
	}

}
