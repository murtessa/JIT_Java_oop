
package reverse.digits;
import java.util.Scanner;

public class ReverseDigits {

    
    public static void main(String[] args) {
      int num;
      int reversnum=0;
      System.out.println("enter a number");
      Scanner input= new Scanner(System.in);
      num=input.nextInt();
      while(num!=0){
          reversnum=reversnum*10;
          reversnum=reversnum+num%10;
          
          num=num/10;
      }
      System.out.println("reverse of input numbers are:"+reversnum);
    }
    
}
