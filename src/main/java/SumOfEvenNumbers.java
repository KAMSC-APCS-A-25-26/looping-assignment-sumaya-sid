import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int num = sc.nextInt();
        // TODO: Step 2 - Validate input
        if (num >=2) {
            int sum = (2 + num);
            System.out.print("The sum of even numbers between 2 and " + num + " is " + sum + ".");
        }
        // TODO: Step 3 - Calculate sum of even numbers
        
        // TODO: Step 4 - Display the result

    }
}
