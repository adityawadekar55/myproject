import java.util.*;
public class digit_frequency{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int  r = scn.nextInt();
        int f= getdigitfrequency(n,r);
        System.out.println(f);
    }
        public static int getdigitfrequency(int n , int r){
            int rv=0;
            while(n>0){
                int dig = n%10;
                n=n/10;
            }
            if(dig == r){
                rv++;
            }
           }
            return rv;
        }
}   
