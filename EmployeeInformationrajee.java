
package employee.information;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import static jdk.nashorn.tools.ShellFunctions.input;
@SuppressWarnings("serial")
class Employee implements Serializable
{
    String name;
    String Id;
    String depart;
    double salary;
    int age;
    int phone_no;
    String sex;
     public Employee(String name, String Id, String depart, String sex,int phone_no, double salary, int age)
    {
      this.name=name;
      this.Id=Id;
      this.depart=depart;
      this.salary=salary;
      this.phone_no=phone_no;
      this.age=age;
      this.sex=sex;
    }
     public String toString()
     {
         return "\nEmployee Details :" +"\nName :" + this.name + "\nID :" + this.Id + "\nDepartement :" + this.depart +
         "\nSex :" + this.sex + "\nPhone Number :" + this.phone_no + "\nsalary :" + this.salary + "\nAge :" + this.age;
     }
}

public class EmployeeInformationrajee {
static void Display(ArrayList<Employee> emp)
{
    System.out.println("*********** EMPLOYEE LIST *************");
    for(Employee e:emp){
    System.out.println("NAME :" + e.name);
    System.out.println("ID :" + e.Id);
    System.out.println("DEPARTEMENT :" + e.depart);
    System.out.println("SEX :" + e.sex);
    System.out.println("PHONE NUMBER :" + e.phone_no);
    System.out.println("SALARY :" + e.salary);
    System.out.println("AGE :" + e.age);
    }
//    System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s%-15%-20s%-10%-20%-15s", "name","Id","depart","sex","phone_no","salary","age"));
//    for(Employee e:emp)
//    {
//        System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s%-5s%-20s%-10s%-15s",e.name,e.Id,e.depart,e.sex,e.phone_no,e.salary,e.age));
//    }
}
  // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
    String name;
    String Id;
    String depart;
    double salary;
    int age;
    int phone_no;
    String sex;
    Scanner sc= new Scanner(System.in);
    ArrayList<Employee>emp=new ArrayList<Employee>();
    File f=null;
    FileInputStream fis=null;
    ObjectInputStream ois=null;
    FileOutputStream fos=null;
    ObjectOutputStream oos=null;
    
    try
    {
        f= new File("employee.txt");
        if(f.exists()){
            fis= new  FileInputStream(f);
            ois=new ObjectInputStream (fis);
            emp=(ArrayList<Employee>)ois.readObject();
        }
    }
    catch(Exception exp){
    System.out.println(exp);
}
   do
   { 
     //  ArrayList<Employee>emp=new ArrayList<Employee>();
   
        Scanner input=new Scanner(System.in);
        Scanner sca=new Scanner(System.in);
      System.out.println("\n*********Welcome To The Employee Informatoin System*********");
      
       System.out.println("1. To add Employee");
     System.out.println("2. To update Employee");
     System.out.println("3. To Delete Employee");
     System.out.println("4. TO Display all Employee");
     System.out.println("5. To Search"); 
     System.out.println("6. To Exit"); 
     System.out.println("Please enter your choice  :");
     int ch=input.nextInt();
     switch(ch)
     {
         case 1:
             System.out.println("Enter the following details to add employee");
              System.out.println("Enter employee name: ");
            String Name = sc.nextLine();
            input.nextLine();
            System.out.println("Enter employee ID: ");
            String ID = input.nextLine();
            System.out.println("Enter employee Departement: ");
            String Depart=input.nextLine();
            System.out.println("Enter employee age: ");
            int Age = input.nextInt();
            System.out.println("Enter the employee phone number");
            int Phone_no=input.nextInt();
            System.out.println("Enter employee Sex: ");
            String Sex=sc.nextLine();
           // input.nextLine();
            System.out.println("Enter employee Salary: ");
            double Salary=input.nextDouble();
            emp.add(new Employee(Name,ID,Depart,Sex,Phone_no,Salary,Age));
           System.out.println("employee added succusfull");
            break;
         case 2:
             System.out.println("Enter the Employee ID to EDIT the Details");
            String id=sc.nextLine();
            //input.nextLine();
            int j=0;
            try{
            for(Employee e:emp)
            {
                if(id.equals(e.Id)){
                    j++;
                    do
                    {
                        int ch1=0;
                        System.out.println("Edited Employee Detials Are :\n" +
                                          "1). Employee ID\n" +
                                          "2). Employee Name\n" +
                                          "3) Employee Salary\n" +
                                          "4). Employee Phone Number\n" +
                                          "5). Employee Age\n" +
                                          "6). Employee Departement\n" +
                                          "7). GO BACK\n");
                        System.out.println("Enter your choice :");
                        
            ch1=input.nextInt();
            switch(ch1)
            {
                case 1:
                     System.out.println("Enter employee ID: ");
                    e.Id = sca.nextLine();
                    System.out.println(e+"\n");
                    break;
                case 2:
                    System.out.println("Enter employee name: ");
                    e.name = sca.nextLine();
                    System.out.println(e+"\n");
                    break;
                case 3:
                     System.out.println("Enter employee Salary: ");
                     e.salary=sca.nextDouble();
                     System.out.println(e+"\n");
                    break;
                case 4:
                    System.out.println("Enter the employee phone number");
                    e.phone_no=sc.nextInt();
                    System.out.println(e+"\n");
                    break;
                case 5:
                     System.out.println("Enter employee age: ");
                     e.age = input.nextInt();
                     System.out.println(e+"\n");
                     break;
                case 6: System.out.println("Enter employee Departement: ");
                        e.depart=sc.nextLine();
                        System.out.println(e+"\n");
                        break;
                case 7: j++;
                       break;
                default:
                    System.out.println( "wrong choice");
                    break;
            }
            } while(j==1);
                    
              }
              }
            if(j==0)
            {
                System.out.println("Employee Information are not found");
            }}
            catch(Exception exps)
             {
              System.out.println(exps);
             }
            break;
         case 3:
             System.out.println("Enter The Employee ID to Delete");
             id=sc.nextLine();
             int k=0;
             try{
                 for(Employee e:emp)
                 {
                     if(id.equals(e.Id))
                     {
                         emp.remove(e);
                         Display(emp);
                         k++;
                     }
                 }
                 if(k==0)
                 {
                     System.out.println("Employee Information are not found");
                 }
             }
             catch(Exception ex)
             {
              System.out.println(ex);
             }
             break;
         case 4:
             try
             {
                 emp=(ArrayList<Employee>)ois.readObject();
             }
             catch(ClassNotFoundException e2)
             {
                 System.out.println(e2);
             }
             catch(Exception e2)
             {
              System.out.println(e2);
             }
             Display(emp);
             break;
         case 5:
             System.out.println("Enter the Employee ID to Search :");
             id=sc.nextLine();
             int i=0;
             try
             {
             for(Employee e:emp)
             {
                 if(id.equals(e.Id))
                 {
                     System.out.println(e+"\n");
                     i++;
                 }
             }
             if(i==0){
                 System.out.println("Employee Information s not found");
             }}
              catch(Exception exs)
             {
              System.out.println(exs);
             }
             break;
         case 6:
             try
         {
             fos=new FileOutputStream(f);
             oos=new ObjectOutputStream(fos);
             oos.writeObject(emp);
     }
             catch(IOException e1)
     {
         e1.printStackTrace();
     }
     //  catch(IOException e2)
    //   {
    //     e2.printStackTrace();   
    //   }
             finally{
                 try{
                     fis.close();
                     ois.close();
                     fos.close();
                     oos.close();
                 }
                 catch(Exception e1)
                 {
                   e1.printStackTrace();   
                 }
             }
             System.out.println("You Have choicen EXIT");
             input.close();
             System.exit(0);
         default:
             System.out.println("Wrong chioce");
             break;
    }
}while(true);
}
}