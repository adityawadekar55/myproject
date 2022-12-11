import java.util.*;
    public class prime{
        public static void main(String[] args){
            Scanner scn = new Scanner (System.in);
            int t= scn.nextInt();

            for (int i=0;i<=t;i++){
                int n= scn.nextInt();
            }
            int count= 0;
            for(int j=2;j*j<=n;j++){
                if(n % 2 == 0){
                  count++;
                }
            }
            if(count==0){
                System.out.println("Prime number");
            }
            else{
                System.out.println("not prime number");
            }
        }
    } 
