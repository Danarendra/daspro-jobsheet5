import java.util.Scanner;
public class Selection2Exp1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Student ID Number: ");
        int IDNumber = sc.nextInt();
        System.out.println("Insert year: ");
        int year = sc.nextInt();

        if (year%4 == 0) {
            if (year%100 != 3000) {
                System.out.println("Leap year.");
            }
          else
          System.out.println("Not leap year.");
        }{
            
        }
    }

    
}