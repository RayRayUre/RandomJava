package RandomStuff;
import java.util.Scanner;
public class Discriminant {

    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int a;
        int b;
        int c;
        int discriminant;
        System.out.println("Does your trinomial have any roots?");
        System.out.println("You can find out by checking the value of the discriminant.");
        System.out.println("What is the value of a?");
        a = numScan.nextInt();
        System.out.println("What is the value of b?");
        b = numScan.nextInt();
        System.out.println("What is the value of c?");
        c = numScan.nextInt();
        discriminant = (b*b)-(4*a*c);
        if (discriminant < 0){
            System.out.println("No Real Roots");
        }
        if (discriminant == 0){
            System.out.println("One Root");
        }
        if (discriminant > 0){
            System.out.println("Two Roots");
        }
        
    }
}
