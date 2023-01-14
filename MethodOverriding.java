
package method.overriding;
 class superclass{
    public String name;
    void display()
    {
        System.out.println("method in super class");
    }
    
}
 class subclass extends superclass
{
  void information()
  {
      System.out.println("DONT TALK MORE ! LISTEN MORE ");
      
  }
  void display()
  {
      //super.display();
      System.out.println("method in sub class");
  }
}

public class MethodOverriding {

    public static void main(String[] args) {
        
     subclass obj=new subclass();
     obj.information();
     obj.display();
    }
    
}
