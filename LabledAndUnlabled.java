
package labled.and.unlabled;


public class LabledAndUnlabled {

    
    public static void main(String[] args) {
        frist:
        for(int i=1;i<5;i++){
            second:
            for(int j=1;j<3;j++){
                System.out.println("i="+i+";j= "+j);
                if(i==2)
                     break frist;
            }
        }
    }
    
}
