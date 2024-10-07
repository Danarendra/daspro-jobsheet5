import java.util.Scanner;

public class Selection2Exp2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAngle;
        System.out.println("input absen: ");
        int absen = sc.nextInt();
        System.out.println("Insert first angle: ");
        int angle1 = sc.nextInt();
        System.out.println("Insert second angle");
        int angle2 = sc.nextInt();
        System.out.println("Insert third angle: ");
        int angle3 = sc.nextInt();

        totalAngle = angle1+angle2+angle3;
        if (totalAngle == 180) {
            if (angle1==90 || angle2==90 || angle3==90) {
                System.out.println("Right triangle.");
            
        
            
            }
        else 
        System.out.println("Not a triangle.");    
         }
    } 
} 
