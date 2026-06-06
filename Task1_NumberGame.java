import java.util.*;
public class Task1_NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
         System.out.println("=== Welcome to the Number Guessing Game ===");
         int maxattempts=5;
         int roundsWon=0;
         boolean playagain=true;
         while(playagain)
         {
            int targetNumber = random.nextInt(100)+1;
            int attemptsLeft = maxattempts;
            boolean hasWon = false;
            System.out.println("\nI have picked a number between " + 1 + " and " + 100 + ". You have " + maxattempts + " attempts.");
            while(attemptsLeft>0)
            {
                System.out.println("Enter your choice: ");
                int usernumber=sc.nextInt();
                attemptsLeft--;
                if(usernumber==targetNumber)
                {
                     System.out.println("Correct! You won this round!");
                     roundsWon++;
                     hasWon=true;
                     break;
                }
                else if(usernumber<targetNumber)
                {
                     System.out.println("Too Low! Try again. (" + attemptsLeft + " attempts left)");
                }
                else
                {
                     System.out.println("Too High! Try again. (" + attemptsLeft + " attempts left)");
                }
                
            }
            if(!hasWon)
            {
                  System.out.println("Out of attempts! The correct number was: " + targetNumber);
            }
            System.out.println("\nYour Score: " + roundsWon + " Rounds Won!");
            System.out.print("Do you want to play again? (yes/no): ");
            String response=sc.next().trim().toLowerCase();
            if(!response.equals("yes"))
            {
                playagain=false;
            }
                
        }
        System.out.println("\nThanks for playing! Final Score: " + roundsWon + " rounds won.");
        sc.close();
    }
}