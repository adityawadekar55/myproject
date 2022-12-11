import java.util.Scanner;
public class marks {
    public static void main(String[]  args){
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your science marks");
        int a =sc.nextInt();
        System.out.println("Enter your math marks");
        int b = sc.nextInt();
        System.out.println("Enter your history marks");
        int c= sc.nextInt();
        System.out.println("Enter your geography marks");
        int d =sc.nextInt();
        System.out.println("Enter your english marks");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Here are your percentage : ");
        float percentage = (sum/500.0f)*100;
        System.out.println(percentage);
    }  
}