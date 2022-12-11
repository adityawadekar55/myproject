import java.util.*;
public class base_to_decimal{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int t= scn.nextInt();
        int dn= getbasetodecimal(n,t);
        System.out.println(dn);
    }
    public static int getbasetodecimal(int n,int t){
        int rv=0;
        int p=1;
        while(n>0){
            int dig= n%10;
            n=n / 10;
            rv += dig*p;
            p= p*t;
        }
        return rv;

    }
}