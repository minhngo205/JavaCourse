// class A{
//     public void pt1(){
//         System.out.println("Chào bạn");
//     }
// }
// class B extends A{
//     public void pt1(){
//         int x=5;
//         System.out.println("x = "+x);
//     }
//     public static void main(String[] args){
//         B dt = new B();
//         dt.pt1();
//     }
// }
public class SV {
    int mssv;
    String NameSV;
    static String CollegeName = "Đại học Bách Khoa";
    public SV(int id,String name){
        this.mssv=id;
        this.NameSV=name;
    }
    static void Change(){
        CollegeName = "Đại học Đà Nẵng";
    }
    public void Show(){
        System.out.println(mssv+"\t"+NameSV+"\t"+CollegeName);
    }
    public static void main(String[] args){
        SV s3 = new SV(1,"Phắc boi");
        SV s1 = new SV(1,"Lương");
        SV s2 = new SV(2,"Lẹo");
        s3.Show();
        s1.Show();
        s2.Show();
        Change();
        s3.Show();
        s1.Show();
        s2.Show();
    }
}