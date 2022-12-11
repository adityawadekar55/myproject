import java.util.*;
public class base_to_base{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int t1= scn.nextInt();
        int t2= scn.nextInt();
        int d= getvalue(n,t1,t1);
        System.out.println(d);
    }
    public static int getvalue(int n,int t1,int t2){
        
        int c= getdecimal(n,t2);
        int b= getbase(c,t1);
        return b;
    }
        public static int getdecimal(int n,int t1){
            int rv=0;
            int p=1;
            while(n>0){
                int dig= n%10;
                n= n/10;
                rv += dig*p;
                p= p*t1;
            }
            return rv;
        }
        public static int getbase(int n, int t2){
            int rv= 0;
            int p=1;
            while(n>0){
                int dig= n%t2;
                n=n /t2;
                rv += dig*p;
                p= p*10;
            }
            return rv;
        }    
}