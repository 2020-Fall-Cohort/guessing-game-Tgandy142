import java.util.Scanner;

public class GuessingGameApp
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int count = 1;
        boolean hasWon = false;

        do {
            System.out.print("Guessing Game!\nPlease enter a number between 1-10: ");
            int num = input.nextInt();

            if (num == 7) {
                System.out.println("Congratulations! You guessed correctly!");
                hasWon = true;
            } else if (num == 0) {
                System.out.println("Please enter a number ONLY between 1-10 and press enter.");
            } else {
                System.out.println("Sorry, you guessed wrong!");
            }
        }while(count < 2 && !hasWon);
    }

}
