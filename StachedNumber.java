
package stached.number;
import java.util.Scanner;

public class StachedNumber {
public int isStached(int n){
    int sum=0;
    int a=0;
    for(int i=0;i<=n;i++){
        sum=sum+i;
    
    if(n==sum){
        a=1;
    }   
    }
    return a;
}
   
    public static void main(String[] args) {
        int n;
        int x;
        System.out.println("Enter a number");
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
       StachedNumber no1= new StachedNumber();
         x=no1.isStached(n);
         System.out.println(x);
                 
    }
    
}
