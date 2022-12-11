import java.util.*;
public class decimal_to_base{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int t= scn.nextInt();
        int dn= getValueinbase(n,t);
        System.out.println(dn);
    }
    public static int getValueinbase(int n,int t){
        int rv=0;
        int p=1;
        while(n>0){
            int dig = n % t;
            n= n/t;
            rv += dig*p;
            p= p *10;
        }
        return rv;
    }
}