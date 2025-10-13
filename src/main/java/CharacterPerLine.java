import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {        
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // TODO: Step 2 - Print each character on a separate line
        int num = word.length();
        int k = 0;
        for (int j=1; j<num+1; j++)
        {
            System.out.println(word.substring(k,j));
            k++;
        }

    }
}
