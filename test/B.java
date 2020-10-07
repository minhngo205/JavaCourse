package test;
public class B {
    /*private*/public int attribute = 50;
    /*private*//*public*/ protected void methode(){
        System.out.println("Hello you");
    }
}
class A{
    public static void main(String args[]){
        B obj = new B();
        System.out.println(obj.attribute); /*Compile Time Error*/
        obj.methode(); /*Compile Time Error*/
    }
}