import java.util.Scanner;
public class Selection2Assignment1_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int max;
        System.out.println("Insert first number: ");
        num1 = sc.nextInt();
        System.out.println("Insert second number: ");
        num2 = sc.nextInt();
        System.out.println("Insert third number: ");
        num3 = sc.nextInt();
        

        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else {
            if (num2 > num3) {
                max = num2;
            } else {
                max = num3;

                
            }
        } System.out.println("Max number = " + max);
    
    }
}