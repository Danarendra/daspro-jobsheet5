import java.util.Scanner;
public class Selection2Assignment2_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book category (dictionary/novel/other): ");
        String category = sc.nextLine().toLowerCase();
        System.out.print("Enter the number of books bought: ");
        int numOfBooks = sc.nextInt();
        System.out.print("Enter the total price of books: ");
        double totalPrice = sc.nextDouble();
        double discount = 0.0;

        if (category.equals("dictionary")) {
            discount = 0.10;  
            if (numOfBooks > 2) {
                discount += 0.02;  
            }
        } else if (category.equals("novel")) {
            discount = 0.07;  
            if (numOfBooks > 3) {
                discount += 0.02;  
            } else {
                discount += 0.01;  
            }
        } else {  
            if (numOfBooks > 3) {
                discount = 0.05;  


            }
        } double discountAmount = totalPrice * discount;
        double amountToPay = totalPrice - discountAmount;

        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Total discount amount: $" + discountAmount);
        System.out.println("Total amount to be paid: $" + amountToPay);


    }
    
}
