
package pkgreturn.square;
import java.util.Scanner;

public class ReturnSquare {
public int isSquare(int a){
    int returnVal=0;
    for(int i=0;i<=a;i++){
        if(i*i==a){
            returnVal=1;
        }
    }
    return returnVal;
}
   
    public static void main(String[] args) {
        int a,b;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number");
        a=input.nextInt();
        ReturnSquare square= new ReturnSquare();
       b= square.isSquare(a);
        System.out.println(b);
    }
    
}
