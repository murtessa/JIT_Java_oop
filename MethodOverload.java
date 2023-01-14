
package method.overload;


public class MethodOverload {
public void calculateArea(int h,int w)
{
    int area;   
    area=h*w;
    System.out.println("the frist area: "+area);
}
public void calculateArea(double h,int w)
{
  double area;
  area=h*w;
System.out.println("the second area "+area);  
}
 public void calculateArea(double h,double w)
 {
  double area;
  area=h*w;
  System.out.println("the threed area: "+area);
  
 }
 public void calculateArea(int h,int w,int z)
 {
     int area;
     area=h*w*z;
     System.out.println("the forth area: "+area);
 }
    public static void main(String[] args) {
      MethodOverload box=new MethodOverload ();
      box.calculateArea(4,5);
      box.calculateArea(5.5567, 6.85678);
      box.calculateArea(4.6,89);
      box.calculateArea(4,7,8);
      System.out.println("good evening");
    }
    
}
