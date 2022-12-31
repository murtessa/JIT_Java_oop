
package commonelement;
import java.util.Arrays;
/**
 *
 * @author murtii
 */
public class CommonElement {

    
    public static void main(String[] args) {
        int[] array1={1,2,3,3,4,6,5,7,9};
        int[] array2={1,0,6,15,10,7,3,8};
//        System.out.println("Arrays1:"+Arrays.toString(array1));
//        System.out.println("Arrays2:"+Arrays.toString(array2));
        for(int i=0;i<array1.length;i++){
           for(int j=0;j<array2.length;j++){
               if(array1[i]==array2[j]){
                System.out.println("Common elements is:"+(array2[i]));   
               }
               
           } 
        }
       
    }
    
}
