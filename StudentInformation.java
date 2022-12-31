package student.information;


public class StudentInformation {

   String name;
int roll;
   int phone;
   String aderess;
   public StudentInformation(String name,int roll){
    this.name=name;
     this.roll=roll;
}
   public StudentInformation(String name,int phone,int roll,String aderess){
        this.name=name;
        this.phone=phone;
        this.roll=roll;
        this.aderess=aderess;
   }
   void display(){
       System.out.println("Name:   "+name);
        System.out.println("Id:    "+roll);
        System.out.println("Phone:  "+phone);
        System.out.println("Address:  "+aderess);
   }
    public static void main(String[] args) {
        StudentInformation std1= new StudentInformation("tolassa",896745);
        StudentInformation std2= new StudentInformation("chala",8934,23,"Ambo");
         std1.display();
         System.out.println("#############");
        std2.display();
      
       
        
        
    }
    
}
