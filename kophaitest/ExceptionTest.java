package kophaitest;

public class ExceptionTest {
    static String s="2.020";
    public static void main(String[] args){
        try {
            System.out.println("So: "+Integer.parseInt(s));
        } catch(Exception e){}
        System.out.println("Chuyen thanh cong");
    }
}