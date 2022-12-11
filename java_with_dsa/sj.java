import java.util.*;
public class sj{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        
        for(int i=0;i<n;i++){
            int j= scn.nextInt();
        
        int count=0;
        for(int div=2;div*div<=j;div++){
              if(j%div==0){
                  count++;
                  break;
              }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
}