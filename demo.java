public class demo {
    //Lập trình giả sử
    /* public static int max (int x,int y,int z){
        int max=x;
        if(max<y){
            max = y;
        }
        if (max<z){
            max = z;
        }
        return max;
    } */
    /* public int TestSwitchCase(int month,int year){
        switch(month){
            case 2: {
                if((year%4==0)&&(year%100!=0)||(year%400==0)) return 29;
                else return 28;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            default: return 31;
        }
    } */
    /* public static int NewGiaiThua(int n){
        int kq=1;
        if(n%2==0){
            for(int i=1;(i<=n && i%2==0);i++){
                kq*=i;
            }
        }
        else{
            for(int i=1;i<=n&&i%2!=0;i++){
                kq*=i;
            }
        }
        return kq;
    } */
    public int MyGT(int n){
        int gt=1;
        int i=0;
        while(true){
            i++;
            if(i<=10) break;
            if(i%2!=0) continue;
            gt=gt*i;
        }
        return gt;
    }
    public void PhanTich(int m){
        int s=0,p=1;
        int sd;
        while(m!=0){
            sd=m%10;
            s+=sd;
            p*=sd;
            m/=10;
        }
        System.out.println("S("+m+") = "+s);
        System.out.println("P("+m+") = "+p);
    }
    public static void main(String args[]){
        demo d =new demo();
        System.out.println(d.MyGT(10));
        // int a=5,b=2,c=7;
        // int SLN = (a>b&&a>c?a:(b>c?b:c));
        // boolean x=true;
        // if(x=false){System.out.println("False");}
        // else System.out.println("True");
    }
}