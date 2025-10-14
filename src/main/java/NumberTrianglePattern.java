import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
                
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // TODO: Step 2 - Generate the number triangle pattern
        if (num>0) {
            System.out.println();
            for (int j = 1; j < num + 1; j++) {
                for (int k = 1; k <= j; k++) {
                    if (j != k) {
                        System.out.print(k + " ");
                    } else {
                        System.out.print(k);
                    }
                }
                System.out.println();
            }
        }
    }
}