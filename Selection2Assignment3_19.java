import java.util.Scanner;
public class Selection2Assignment3_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand (Converse/Skecher/Nike): ");
        String brand = sc.nextLine();
        System.out.println("Enter category: ");
        String category = sc.nextLine();
        System.out.println("Enter size: ");
        int size = sc.nextInt();

        
        int price = 0;

        
        switch (brand) {
            case "Converse":
                switch (category) {
                    case "Slip On":
                        if (size >= 36 && size <= 40) {
                            price = 800000;
                        }
                        break;
                    case "High Top":
                        if (size >= 40 && size <= 44) {
                            price = 1200000;
                        }
                        break;
                }
                break;

            case "Skecher":
                switch (category) {
                    case "Woman":
                        if (size >= 36 && size <= 41) {
                            price = 1000000;
                        }
                        break;
                    case "Man":
                        if (size >= 41 && size <= 44) {
                            price = 1800000;
                        }
                        break;
                }
                break;

            case "Nike":
                switch (category) {
                    case "Kids":
                        if (size >= 36 && size <= 40) {
                            price = 750000;
                        }
                        break;
                    case "Adult":
                        if (size >= 40 && size <= 44) {
                            price = 1500000;
                        }
                        break;
                }
                break;

            default:
                System.out.println("Invalid brand.");
                return;
        }

        // Output the price
        if (price != 0) {
            System.out.println("The price is: " + price);
        } else {
            System.out.println("Invalid category or size.");
        }

        
    }
}

    
    

