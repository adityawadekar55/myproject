import java.util.*;
public class Pythogorean_triplet{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            int a= scn.nextInt();
            int b= scn.nextInt();
            int c= scn.nextInt();

            int max= a;
            if(b>=max){
                max=b;
            }
            if(c>=max){
                max=c;
            }
            if(a == max){
                boolean flag=((b*b + c*c)==(a*a));
                System.out.println(flag);
            }
            else if(b == max){
                boolean flag=((a*a + c*c)==(b*b));
                System.out.println(flag);
            }
            else{
                boolean flag=((b*b + a*a)==(c*c));
                System.out.println(flag);
            }
        }
}
