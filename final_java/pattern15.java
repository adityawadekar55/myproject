//not understood
import java.util.*;
public class pattern15{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int sp=n/2;
        int st=1;
        int val=1;//this represent the value of row
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            int cval = val;//this represent the value of the column
            for(int j=1;j<=st;j++){
                System.out.print(cval ); 
                if(j <= n/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i<= n/2){
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            
            System.out.println();
        }
    }
}