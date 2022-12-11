import java.util.*;

public class java{
    public static void main(String[] args){
    Scanner scn= new Scanner(System.in);

    int t= scn.nextInt();
    int a=0;
    int b=1;
    for(int i=0;i<=t;i++){
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
    }


}
}