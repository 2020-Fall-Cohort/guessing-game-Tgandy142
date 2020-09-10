import java.util.Scanner;

public class GuessingGameApp
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Guessing Game!\nPlease enter a number between 1-10: ");
        int num = input.nextInt();

        if(num == 7)
        {
            System.out.println("Congratulations! You guessed correctly!");
        }
        else
        {
            System.out.println("Sorry, you guessed wrong!");
        }
    }

}
