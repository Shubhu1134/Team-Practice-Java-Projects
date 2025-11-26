package OOps;
class Parent{
   public Parent(){

   }
    public Parent(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("parent constructor....");

    }
    private int a;
    private int b;
    public void m1(){
        System.out.println("parent method class....");

    }

}
class Child extends Parent{

    public Child(int a ,int b,int c, int d){
        // super(a,b);
        this.c = c;
        this.d= d;
        System.out.println("child class constructor called");
    }

    private int  c ;
    private int d;
    public void m2(){
        System.out.println("child class method invoked ....");
    }
}
public class inheritence {
    public static void main(String[] args) {
        
        Child c1 = new Child(1,2,3,4);
        c1.m1();
        c1.m2();
    }

}
