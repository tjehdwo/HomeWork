import java.util.Scanner;

public class practice3 {


public static void main(String[] args) {
	// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("숫자를 입력해주세요.");
       int num = sc.nextInt();
       
       if(num < 1) {
    	   System.out.println("1 이상의 숫자를 말해주세요.");
       }else {
    	   for(int i = num;i>=1;i--) {
    		   System.out.println(i);   
    	   }
    	   
       }
       
       
}

}
