
package nested.ciass;

/**
 *
 * @author murtii
 */
public class outerclass {

    String name="Finfinne";
    String location="centeral";
    public class innerClass{
        void accessMember(){
            System.out.println(name);
            System.out.println(location);
            
        }
    }
    static class StaticNestedClass{
        void accessMember(){
        System.out.println("Finfinee which is the most befautull city");
        System.out.println("love ever one");
    }
    }
    public static void main(String[] args) {
        System.out.println("Inner class");
        System.out.println("###########");
        outerclass outerObject=new outerclass();
        outerclass.innerClass innerObject=outerObject.new innerClass();
        innerObject.accessMember();
        System.out.println("\nStatic nested class");
        StaticNestedClass staticnestedobject=new StaticNestedClass();
        staticnestedobject.accessMember();
        System.out.println("\nTop level class");
        System.out.println("##########");
        
    }
    
}
