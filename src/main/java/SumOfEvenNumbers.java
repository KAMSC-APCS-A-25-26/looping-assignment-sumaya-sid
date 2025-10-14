import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int num = sc.nextInt();
        int sum = 0;
        // TODO: Step 2 - Validate input
        if (num<2)
        {
            System.out.print("Error: Input must be 2 or greater.");
        }
        // TODO: Step 3 - Calculate sum of even numbers
        for (int j=2; j<num; j+=2)
        {
            sum+=j;
        }

        // TODO: Step 4 - Display the result
        System.out.print("The sum of even numbers between 2 and " + num + " is " + sum + ".");
    }
}
