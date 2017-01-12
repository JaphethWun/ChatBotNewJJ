import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class ChatbotRunner3
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Bot1 chattie = new Bot1();
        
        System.out.println (chattie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        
        while (!statement.equals("Bye"))
        {
            System.out.println (chattie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}
