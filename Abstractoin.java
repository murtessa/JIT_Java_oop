
package abstractoin;

 abstract class Employee
{
  public void books()
  {
      System.out.println("all things are posibble");
  }
      
     public abstract void display();
      
}
 class Salary extends Employee
{
     public String name;
      int Id;
      int age;
    public Salary(String name,int Id,int age)
      {
          this.name=name;
          this.Id=Id;
          this.age=age;
      }
 public void displayinfo()
 {
  System.out.println("the information of employee are us follow");
 }
  public void display() 
  {
      System.out.println("the employee name: "+name);
      System.out.println("the employee Id: "+Id);
      System.out.println("the employee age: "+age);
      
  }
}
public class Abstractoin {

    
    public static void main(String[] args) {
        Salary obj=new Salary("TOLASSA",22244,36);
       obj.displayinfo();
       obj.display();
       obj.books();
    }
    
}
