import java.lang.String;

interface IDemo{
    final static int x=10;;
   
    public static int meth1(){
        System.out.println(meth2());
        return Integer.MAX_VALUE;
    }
   private static int  meth2(){
    return -20;
   }
  default String meth3(){
    return ("Default method() called");
   }

}
class A implements IDemo{

     void method4(){
        System.out.println("Inside the Super class A");
    }
}
class B extends A{
   protected void method4(){
        
    }
}

public class Main{
    public static void main(String[] args){
           IDemo i = new IDemo(){ // we can actually override the abstract methods here and use the object
                                 };
           System.out.println(IDemo.meth1());
           System.out.println(i.meth3());
    }
}

/*outout
-20
2147483647
Default method() called
 */