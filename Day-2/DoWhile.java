import java.util.Scanner;

class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continueShopping = 'Y';

        do {
            System.out.println("Welcome to our website");
            System.out.println("1. Men's Section");
            System.out.println("2. Women's Section");
            System.out.println("3. Kids Section");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Welcome to Men's Section");
                    break;
                case 2:
                    System.out.println("Welcome to Women's Section");
                    break;
                case 3:
                    System.out.println("Welcome to Kids Section");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.println("Thank you for choosing us!");
            System.out.print("Do you want to continue (Y/N)? ");
            continueShopping = sc.next().charAt(0);

        } while (continueShopping == 'Y' || continueShopping == 'y');

        System.out.println("Thank you for visiting!");
        sc.close();
    }
}