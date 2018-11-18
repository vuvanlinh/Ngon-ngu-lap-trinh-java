import java.util.Scanner;

public class displayrectangle {
    public static void main(String[] args) {
        int choice;


        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* ");
                    System.out.println("* * ");
                    System.out.println("* * *");
                    System.out.println("* * * * ");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * ");
                    System.out.println("*");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
