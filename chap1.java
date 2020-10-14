import java.util.Scanner;

public class chap1 {
    private static Scanner sc = new Scanner(System.in);
    public int max3(int x,int y,int z){
        int max;
        if(x>y && x>z){
            max = x;
        } else if(y>z){
            max = y;
        } else {
            max = z;
        }
        return max;
    }
    public void PtBac1 () {
        double a,b;
        System.out.println("Giai pt bac nhat ax+b=0");
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        if(a==0){
            if (b==0) System.out.println("Pt "+a+"x+"+b+"=0 luon dung");
            else System.out.println("Pt "+a+"x+"+b+"=0 vo nghiem");
        }
        else System.out.println("Nghiem cua pt "+a+"x+"+b+"=0 la: "+((double)(-b)/a));
    }
    public void PtBac2(){
        double a,b,c;
        System.out.println("Giai pt bac 2 ax^2+bx+c=0");
        do{
            System.out.print("Nhap a: ");
            a=sc.nextDouble();
        } while(a==0);
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        System.out.print("Nhap c: ");
        c=sc.nextDouble();
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2*a));
            x2 = ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Pt co 2 nghiem phan biet: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Pt co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Pt vo nghiem!");
        }
    }
    public void HePt(){
        int a,b,c,d,e,f;
        double D,Dx,Dy,x,y;
        System.out.println("Giai he pt:");
        System.out.println("ax+b=c");
        System.out.println("dx+e=f");
        System.out.print("Nhap a: "); a=sc.nextInt();
        System.out.print("Nhap b: "); b=sc.nextInt();
        System.out.print("Nhap c: "); c=sc.nextInt();
        System.out.print("Nhap d: "); d=sc.nextInt();
        System.out.print("Nhap e: "); e=sc.nextInt();
        System.out.print("Nhap f: "); f=sc.nextInt();
        D = a*e - d*b;
        Dx = c*e - f*b;
        Dy = a*f - d*c;
        if (D == 0) {
            if (Dx + Dy == 0)
                System.out.println("Pt co vo so nghiem");
            else
                System.out.println("He phuong trinh vo nghiem");
        }
        else {
            x = Dx / D;
            y = Dy / D;
            System.out.println("Nghiem: x = "+x+" y = "+y);
        }
    }
    public int TrungGian (int x, int y, int z){
        if(x>y&&x<z||x>z&&x<y) return x;
        if (y>x&&y<z||y>z&&y<x) return y;
        return z;
    }
    public void KaraOke (){
        int a,b,price;
        do{
        System.out.print("Gio bat dau: "); a=sc.nextInt();
        System.out.print("Gio ket thuc: "); b=sc.nextInt();
        } while(a<0&&a>24||b<0&&b>24||a>b);
        if (b>=18) price=60000*(b-a);
        else price=45000*(b-a);
        System.out.println("Gia dich vu: "+price+" VND");
    }
    public int DayOfMonth(int month, int year){
        switch(month){
            case 2:{
                if(year%4==0&&year%100!=0||year%400==0) return 29;
                else return 28;
            }
            case 4,6,9,11: return 30;
            default: return 31;
        }
    }
    public static void main(String[] args){
        //Bai 1
        chap1 bai1 = new chap1();
        System.out.println("Bai 1: So lon nhat trong 3 so: "+bai1.max3(16, 12, 20));
        //Bai 2
        chap1 bai2 = new chap1();
        bai2.PtBac1();
        //Bai 3
        chap1 bai3 = new chap1();
        bai3.PtBac2();
        //Bai 4
        chap1 bai4 = new chap1();
        bai4.HePt();
        //Bai 5
        chap1 bai5 = new chap1();
        System.out.println("Bai 5: So trung gian cua 3 so: "+bai5.TrungGian(20, 15, 17));
        //Bai 6
        chap1 bai6 = new chap1();
        bai6.KaraOke();
        //Bai 7
        chap1 bai7 = new chap1();
        System.out.println("So ngay trong thang: "+bai7.DayOfMonth(12,2000));
    }
}
