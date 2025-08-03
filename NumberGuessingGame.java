import java.util.Scanner;
class RandomNumber
{
    int NumberGenerator(int n)
    {
        int number = (int)(Math.random() * n) + 1;
        return number;
    }
}
class mainFunctions
{
    String mainOperation(int UserNum, int number, Scanner sc) 
    {
        int count =1;

        while (UserNum != number) 
        {
            count++;
            System.out.println("❌Wrong guess.");
            if (UserNum < number) 
            {
                System.out.println("The number is greater than "+UserNum);
            } 
            else if (UserNum == 0) 
            {
                System.out.println("Try from 1.");
            }
            else
            {
                System.out.println("The number is lesser than "+UserNum);
            }
            System.out.print("Enter Your guess: ");
            UserNum = sc.nextInt();
        }
        System.out.println("🎉Congratulation!. You guessed the correct number in "+count+" attempt.");
        System.out.print("Do you want to play again? [Y/N]: ");
        sc.nextLine();
        String s = sc.nextLine();
        return s;   
    }
}
public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        for(int i = 0; i < 50; i++) 
        {
            System.out.print("=");
        }
        System.out.println("\nWelcome to the Number Guessing Game!");
        for(int i = 0; i < 50; i++) 
        {
            System.out.print("=");
        }
        System.out.print("\nSet the upper bound for the guess range (1 to ___): ");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = "Y";
        while (s.equalsIgnoreCase("Y")) 
        {
            RandomNumber R = new RandomNumber();
            int number= R.NumberGenerator(n);
            
            System.out.print("I am Computer BOT. I've generated a number. Can you guess what it is? ");
            int UserNum =sc.nextInt();

            mainFunctions m = new mainFunctions();
            s = m.mainOperation(UserNum, number, sc);
        }
        
        sc.close();
        System.out.println("Game Over!");
        
    }
}