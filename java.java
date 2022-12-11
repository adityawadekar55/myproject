import java.util.Scanner;
class java{
    public static void main(String[]  args){
    System.out.println("Enter your marks in given menu");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1");
    int a = sc.nextInt();
    System.out.println("Enter number 2");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("The sum of the given number is");
    System.out.println(sum);
    }
}