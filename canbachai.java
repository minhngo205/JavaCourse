public class canbachai {
    //Lập trình giả sử
    public static int max (int x,int y,int z){
        int max=x;
        if(max<y){
            max = y;
        }
        if (max<z){
            max = z;
        }
        return max;
    }
    public static void main(String args[]){
        int a=5,b=2,c=7;
        int SLN = (a>b&&a>c?a:(b>c?b:c));
        boolean x=true;
        if(x=false){System.out.println("False");}
        else System.out.println("True");
        //System.out.println("So lon nhat: " + SLN);
    }
}