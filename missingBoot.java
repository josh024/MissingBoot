//Joshua Coleman

import java.util.Random;
import java.util.Scanner;

public class missingBoot {
    public static final int MAX = 10;
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        Random r = new Random();
        //establishes scanner and random
        int guessNumber = r.nextInt(MAX);
        //makes random value to be used later
        System.out.println("""
                           The mystery of the missing boot!
                           You are a detective on a luxury train full of artistocrats, traveling towards London.
                           A lavish man named Quincy asks you to help him find his missing boot.
                           Where will you check first?
                           1) The Engine Room
                           2) The Next Train Car
                           3) The Roof
                           """);
        
        int path = key.nextInt();
        //determines path based off user input
        switch(path)
        {
            case 1:
            {
                System.out.println("""
                               You decide to check the Engine Room for the missing boot,
                               only to find that the conductor is missing.
                               What will you do next?
                               1) Continure looking for Boot
                               2) Search for Train Conductor
                               3) Look out the window
                               """);
                path = key.nextInt();
                switch(path)
                {
                    case 1:
                    {
                        System.out.println("""
                                            You decide to continue looking for the boot and trip and fall
                                            when crossing one of the train cars.
                                            \"Ending 1: Slip\"
                                            """);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("""
                                            You decide to ignore the missing conductor and continure your
                                            ever important search for a boot.
                                            Heading back to the train cars you see a sign that says
                                            \"Behind this door lies what you seek, guess a number between zero and ten\"
                                            """);
                        //sets up boolean variamble for compound boolean 
                        boolean correctGuess = false;
                        while(correctGuess == false)
                        //compares answer to value of random value selected at beginning
                        {
                            System.out.println("Enter a number from 0-10.");
                            
                            int guess = key.nextInt();

                            if (guess > 10 || guess < 0)
                            {
                                System.out.println("Invalid value entered");
                            }
                            if(guess < guessNumber)
                            {
                                System.out.println("Your guess is too low!");
                            }
                            else if(guess > guessNumber)
                            {
                            System.out.println("Your guess is too high!");
                            }
                            else if(guess == guessNumber)
                            {
                            System.out.println("Your guess is correct!");
                            correctGuess = true;
                            }
                            else
                            {
                            System.out.println("Invalid value entered");
                            }

                        }
                        System.out.println("""
                                            Behind the locked door you see a large room with a high shelf at the back and a ladder sitting in the corner to your left.
                                            Will you use the ladder to reach the high shelf, or continue elsewhere?.
                                            1) Use the ladder to reach shelf.
                                            2) Continue looking elsewhere.
                                            """);
                        path = key.nextInt();
                        switch(path)
                        {
                            case 1:
                            {
                                System.out.println("""
                                                    As you peek to the top of the shelf you see what appears to be a 
                                                    fancy boot!
                                                    You've found the boot! 
                                                    Congragulations detective.
                                                    \"Ending 2: You Won\"  
                                                    """);
                            }
                            break;
                            case 2:
                            {
                                System.out.println("""
                                                    You ran out of time aa the train stationed in London.
                                                    Quincy never got his boot and your bad reputation has spread.
                                                    \"Ending 3: Jobless\"
                                                    """);
                            }
                            break;
                            default:
                            {
                                System.out.println("Invalid input");
                                System.exit(0);
                            }

                        }
                    }
                    break;
                    case 3:
                    {
                        System.out.println("""
                                            You decide to look out the window, but didn't realise a tunnel was coming.
                                            You meet your unfortunate end before being able to find the boot.
                                            \"Engine 4: Unfulfilled Dreams\"   
                                            """);
                    }
                    break;
                    default:
                    {
                        System.out.println("Invalid input");
                        System.exit(0); 
                    }
                }
            }
            break;
            case 2:
            {
                System.out.println("""
                                In the Next Train Car you see a group of people huddled around one of the tables playing cards.
                                Will you join their game or continue to the next train car?
                                1) Join their Game.
                                2) Continure to next Train Car.
                                """);
                path = key.nextInt();
                switch(path)
                {
                    case 1:
                    {
                        System.out.println("""
                                            You join there game and they deal you in a hand of cards.
                                            These cards are different though, they each have a letter on them.
                                            The letters are \"R, N, A, T, I\"
                                            
                                            """);
                        String wordInput;
                        //verifies the correct word                    
                        do { 
                            System.out.println("What word could these spell?");

                            wordInput = key.next();
                        } while(!wordInput.equalsIgnoreCase("train"));
                       
                        System.out.println("""
                                            You managed to best these people in their game!
                                            What will you do with the winnings.
                                            1) Spend it on luxury items.
                                            2) Put a bounty on the boot.
                                            """);
                        path = key.nextInt();
                        switch(path)
                        {
                            case 1:
                            {
                                System.out.println("""
                                                    Forgetting about the boot after buying so many luxury items.
                                                    You grew too consumed in the spending and ended up in debt
                                                    Its an impossible amount to pay back.
                                                    \"Ending 5: Broke\"
                                                    """);
                            }
                            break;
                            case 2:
                            {
                                System.out.println("""
                                                    Putting a bounty on the boot was a good idea!
                                                    The people on this train all wanted the money and started looking for the boot, eventually finding it on a high shelf.
                                                    \"Ending 6: Money is Power\"
                                                    """);
                            }
                            break;
                            default:
                            {
                                System.out.println("Invalid input");
                                System.exit(0); 
                            }
                        }
                    }
                    break;
                    case 2:
                    {
                        System.out.println("""
                                            You continue to the next train, but feel something in your back
                                            The people from the game did not appreciate you not answering to them.
                                            \"Ending 7: Games Rule\"
                                            """);
                    }
                    break;
                    default:
                    {
                        System.out.println("Invalid input");
                        System.exit(0); 
                    }
                }
            }
            
            break;
            case 3:
            {
                System.out.println("""
                                As you walk onto the roof you see a tunnel coming up ahead, 
                                but further up on the train you see what looks like a boot hanging from a window
                                What will you do?
                                1) Attempt to get to the boot before you reach the tunnel.
                                2) Head back into the train.
                             """);
                path = key.nextInt();
                switch(path)
                {
                    case 1:
                    {
                        System.out.println("""
                                            Unfortunately you did not take a physics class, and did not realise
                                            it was impossible to make that distance in time.
                                            You have met your unfortunate end.
                                            \"Ending 8: Too Slow\"
                                            """);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("""
                                            Once you head back into the train you see the conductor
                                            along with a polic officer.
                                            \"You are under arrest for clibling ontoo the top of the train!\"
                                            What an unfortunate turn of events!
                                            \"Ending 9: Arrested\"
                                            """);
                    }
                    break;
                    default:
                    {
                        System.out.println("Invalid input");
                        System.exit(0); 
                    }
                }
            }
            break;
            default:
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
    }
}
