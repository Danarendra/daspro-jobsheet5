import java.util.Scanner;
public class Selection2Exp3_19equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category;
        int income, netSalary;
        double tax = 0;
        System.out.println("Input Student ID number: ");
        int IDnumber = sc.nextInt();
        System.out.println("Input category: ");
        category = sc.nextLine();
        System.out.println("Input income: ");
        income = sc.nextInt();
    
        if (category.equals( "worker")) {
            if(income <= 2000000)
            tax = 0.1;
            else if(income <= 3000000)
            tax = 0.15;
            else
            tax = 0.2;
            
                netSalary = (int) (income - (tax*income));
                System.out.println("Nett Salary = "+netSalary);
        
        }else if(category.equals("businessman")){
            if (income <= 25000000) {
                tax = 0.15;
            if(income <= 35000000)
            tax = 0.2;
                else
                tax = 0.25;
    
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett Salary = "+netSalary);
            }
    
        }else 
            System.out.println("Invalid category!");
    
    
       } 
}
