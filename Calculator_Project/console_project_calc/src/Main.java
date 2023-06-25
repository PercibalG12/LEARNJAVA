import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float num1;
        float num2;
        float result;
        int option;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        num1 = scanner.nextFloat();

        System.out.print("Enter num2: ");
        num2 = scanner.nextFloat();

        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");


        System.out.print("Enter option: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                result = num1 + num2;
                System.out.println(result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(result);
                break;
            case 4:
                while(num2==0){
                    System.out.println("The divisor cannot be 0 please try again:");
                    System.out.println("Re enter the divisor(num2):");
                    num2 = scanner.nextFloat();
                }
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
