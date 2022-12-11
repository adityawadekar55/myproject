import java.util.*;
public class base_addition{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int n1= scn.nextInt();
        int n2= scn.nextInt();

        int d= getbaseadd(n,n1,n2);
        System.out.println(d);
    }
    public static int getbaseadd(int n, int n1, int n2){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || n2>0 || c>0){
            int d1= n1%10;
            int d2= n2%10;
            n1 = n1 /10;
            n2 = n2 /10;
            int d= d1 + d2 + c;
            c= d / n;
            d= d % n;

            rv += d * p;
            p= p *10;
        }
        return rv;
    }
}