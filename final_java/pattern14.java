import java.util.*;
public class pattern14{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x= scn.nextInt();
        for(int i= 1;i<=10;i++){
            int v= i*x;
            System.out.println(x + "*" + i + "=" + v);
        }

    }
}