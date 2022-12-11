import java.util.*;
public class base_substraction{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int t1= scn.nextInt();
        int t2= scn.nextInt();
        int d= getbasesub(t1,t2,n);
        System.out.println(d);
    }
    public static int getbasesub(int n, int t1, int t2){
        int rv= 0;
        int c=0;
        int p=1;
        while(t2>0){
            int d1= t1%10;
            t1= t1 /10;
            int d2= t2%10;
            t2 = t2 /10;

            int d= 0;
            d2= d2 + c;

            if(d2>=d1){
                c=0;
                d= d2-d1;
            }
            else{
                c=-1;
                d = d2 +8 - d1;
            }
            rv += d * p;
            p = p* 10;
        }
        return rv;
    }
}