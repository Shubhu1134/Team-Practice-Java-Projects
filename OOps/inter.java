package OOps;

 interface I1 {

    default public void m1(){
        System.out.println("I1 method");
    }

    
}
 interface I2 {

    default public void m1(){
        System.out.println("I2 method is called....");
    }
    
}
class inter implements I1,I2{
    
    @Override
    public void m1(){
        System.out.println("method from the child class...");
    }
    public static void main(String[] args){
        inter child = new inter();
        child.m1();
    }
}