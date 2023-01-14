
package pkginterface;
interface animals
{
   public void wildAnimal();
   public void eat();
    
}
interface grass
{
    public void cows();
}
interface brids extends animals,grass
{
    public void layingEgg();
    
        
    
}
class better implements brids
{
    public void cows()
    {
        System.out.println("cows are source of milks");
    }
     public void information()
    {
     System.out.println("Be carefull with brids");   
    }
    public void wildAnimal()
    {
        System.out.println("Always doin the right things");
    }
     public void eat()
     {
         System.out.println("do you kwnows the value of persons");
     }
      public void layingEgg()
      {
          System.out.println("EVERY THINGS ARE NOTHING FOR ....");
      }
    
}
class Mamals implements animals,grass
{
    public void information()
    {
     System.out.println("INFORMATION ABOUT ANIMALS: ");   
    }
    public void wildAnimal()
    {
        System.out.println("some mamals are wild animals");
    }
     public void eat()
     {
         System.out.println("all animal eat some things");
     }
      public void cows()
      {
          System.out.println("cows has four leggs and eat grass");
      }
}

public class Interface {

       public static void main(String[] args) {
       Mamals obj1=new Mamals();
       obj1.information();
       obj1.wildAnimal();
       obj1.eat();
       obj1.cows();
       better obj2=new better();
       obj2.layingEgg();
       obj2.information();
       obj2.eat();
       obj2.wildAnimal();
       obj2.cows();
    }
    
}
