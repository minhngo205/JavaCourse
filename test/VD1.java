package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadInt{
    public int NhapSo() throws IOException{
        InputStreamReader LV = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(LV);
        String s = BR.readLine();
        return Integer.parseInt(s);
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
    public static void main (String[] args){
        ReadInt dt = new ReadInt();
        int m=0;
        try{
            do {
                System.out.print("Nhập 1 số nguyên dương: ");
                m = dt.NhapSo();
            } while(m<=0);
        } catch(Exception e){}
        System.out.println("Số đã nhập là: "+m);
        dt.TongvaTich(m);
    }
}
