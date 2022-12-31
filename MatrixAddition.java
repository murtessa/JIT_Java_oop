
package matrixaddition;

/**
 *
 * @author murtii
 */
public class MatrixAddition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] a={{1,2,3},{4,5,6},{7,8,9}};
       int[][] b={{9,8,7},{6,5,4},{3,2,1}};
       int[][] c=new int[3][3];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<b.length;j++){
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" ");
           }
           System.out.println();
       }
    }
    
}
