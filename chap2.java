import java.util.Scanner;

public class chap2 {
    private static int max = 255255;
    private static Scanner sc = new Scanner(System.in);
    public double cau1(int n){
        double kq;
        int i;
        if(n==0) return 1;
        else{
            for (kq=0,i=1;i<=n;++i){
                kq=kq+((double)1/i);
            }
        }
        return kq;
    }

    public double cau2(int n){
        double kq=15;
        if(n==0) return 15;
        else {
            for(int i=1;i<=n;i++){
                kq+=((double)(Math.pow(-1,i)*1/i));
            }
        }
        return kq;
    }

    public static int GiaiThua(int n){
        if(n<0) return -1;
        else if (n==0||n==1) return 1;
        else return n*GiaiThua(n-1);
    }
    public double cau3 (int n){
        double kq=0;
        if(n==0) return 1;
        else {
            for(int i=1;i<=n;i++){
                kq+=(double)1/GiaiThua(2*i-1);
            }
        }
        return kq;
    }

    public int NewGiaiThua(int n){
        //int kq=1;
        if (n<0) return -1;
        else if (n==0||n==1) return 1;
        else return n*NewGiaiThua(n-2);
        /* if(n%2==0){
            for(int i=2;i<=n;i+=2){
                kq*=i;
            }
        }
        else{
            for(int i=1;i<=n ;i+=2){
                kq*=i;
            }
        }
        return kq; */
    }
    
    public void TongvaTich(int m){
        int s=0,p=1;
        int sd,n=m;
        while(n!=0){
            sd=n%10;
            s+=sd;
            p*=sd;
            n/=10;
        }
        System.out.println("S("+m+") = "+s);
        System.out.println("P("+m+") = "+p);
    }

    //Giai thuat Euclide tim UCLN & BCNN
    public int UCLN (int a, int b){
        if(b==0) return a;
        return UCLN(b,a%b);
    }
    public int BCNN(int a, int b) {
        return (a*b)/UCLN(a,b);
    }

    public boolean SoNguyenTo(int m){
        for(int i=2;i<=m/2;i++){
            if(m%i==0) return false;
        }
        return true;
    }

    public boolean SoChinhPhuong(int p){
        int i=0;
        while(i*i<=p){
            if(i*i==p){
                return true;
            }
            ++i;
        }
        return false;
    }

    public boolean SoDoiXung(int m){
        int input = m;
        int trans=0,r;
        while(input!=0){
            r=input%10;
            trans=(trans*10)+r;
            input/=10;
        }
        if(m==trans) return true;
        else return false;
    }

    public void LietkeNT(int n){
        if (n==0||n==1) return;
        System.out.println("Cac so nguyen to nho hon hoac bang: "+n);
        for(int i=2;i<=n;i++){
            if (SoNguyenTo(i)) System.out.print(i+"\t");
        }
        System.out.println("");
    }

    public boolean SoHoanhao(int n){
        int sum = 0;
        if (n==0) return false;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) 
                sum+=i;
        }
        if(sum==n) return true;
        return false;
    }
    public void LietkeHH(){
        System.out.println("Liet ke cac So hoan hao < 1000");
        for (int i=0;i<1000;i++){
            if (SoHoanhao(i)) System.out.print(i+"\t");
        }
        System.out.println("");
    }

    public int Fibonacci (int n){
        int[] fibo = new int[max];
        fibo[0]=fibo[1]=1;
        for (int i=2;i<=n;i++) fibo[i]=fibo[i-1]+fibo[i-2];
        return fibo[n];
    }
    public void LietkeFibo (int n){
        System.out.println(n+" so dau tien cua day Fibonacci: ");
        for(int i=0;i<n;i++){
            System.out.print(Fibonacci(i)+"\t");
        }
        System.out.println("");
    }

    public int CheckFibo(int k){
        if (k<1) return -1;
        if(k==1) return 1;
        int fib1=1,fib2=1,fib=2,dem=2;
        while(fib1+fib2<=k){
            fib=fib1+fib2;
            fib2=fib1;
            fib1=fib;
            dem++;
        }
        if(fib==k) return dem;
        else return 0;
    }
    
    public static void main (String[] args){
        chap2 a = new chap2 ();
        System.out.println("Cau 1: "+a.cau1(10));
        System.out.println("Cau 2: "+a.cau2(10));
        System.out.println("Cau 3: "+a.cau3(10));
        System.out.println("Cau 4: "+a.NewGiaiThua(5));
        System.out.println("Cau 5: "); a.TongvaTich(234);
        System.out.println("Cau 6: UCLN "+a.UCLN(12,18)+" BCNN "+a.BCNN(12,18)); 
        System.out.print("Nhap 1 so nguyen: ");
        int m = sc.nextInt();
        System.out.println("Cau 7: ");
        if(a.SoNguyenTo(m)) System.out.println(m+" la So nguyen to");
        else System.out.println(m+" KHONG PHAI la So nguyen to");
        System.out.println("Cau 8: ");
        if(a.SoChinhPhuong(m)) System.out.println(m+" la So chinh phuong");
        else System.out.println(m+" KHONG PHAI la So chinh phuong");
        System.out.println("Cau 9: ");
        if(a.SoDoiXung(m)) System.out.println(m+" la So doi xung");
        else System.out.println(m+" KHONG PHAI la So doi xung");
        System.out.println("Cau 10: ");
        a.LietkeNT(m);
        System.out.println("Cau 11: ");
        a.LietkeHH();
        System.out.println("Cau 12: ");
        a.LietkeFibo(10);
        System.out.print("Nhap 1 so nguyen: ");
        int n = sc.nextInt();
        System.out.println("Cau 13: ");
        if (a.CheckFibo(n)<=0) System.out.println("Khong phai so Fibo");
        else if (a.CheckFibo(n)==1) System.out.println("La 2 so Fibo dau tien");
        else System.out.println("La so Fibo thu "+a.CheckFibo(n));
    }
}
