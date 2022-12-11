import java.util.Scanner;

public class add {
    public static void main(String[]  args){
    System.out.println("What is your name");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Hello " + name + " howdy ");
    String how = sc.nextLine();
    System.out.println("Hey " + name + " do you study or do you have work");
    String study = sc.nextLine();
    System.out.println("Hey " + name + " how can I help you bro");
    String help = sc.nextLine();
    }
}
