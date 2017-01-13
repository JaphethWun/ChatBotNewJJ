//this chatbot talks about food and this meets requirement 1
public class Bot1
{
    int i=0;
    int x=0;
    String question = "";
    /**
     * Get a default greeting
     * 
     * @return a greeting
     */
    //line 7-11 meets requirement 5
    public String getGreeting()
    {

        findKeyword("hello", "hello", 0);
       
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.length() == 0)
        //if statements on line 30 meets requirement 4Ai
        {
            response = "Please answer the question";
            //line 32 meets requirement 2Ai and requirement 4Aii
        }

        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why not?";
            //line 39 meets requirement 4Aiii
        }
        else if (findKeyword(statement.toLowerCase(), "hi") >= 0
                || findKeyword(statement.toLowerCase(), "hello") >= 0
                || findKeyword(statement.toLowerCase(), "hey") >= 0
                || findKeyword(statement.toLowerCase(), "hola") >= 0)                    
                //line 38 to 82 meets requirement 2A
            {
                question = "Hi. How was your day? good, bad, or okay?";
                System.out.println(question);
                i++;
            }
        else if((i == 1)&& findKeyword(statement.toLowerCase(), "good") >= 0
                    || findKeyword(statement.toLowerCase(), "bad") >= 0
                    || findKeyword(statement.toLowerCase(), "ok") >= 0
                    || findKeyword(statement.toLowerCase(), "k") >= 0
                    || findKeyword(statement.toLowerCase(), "okay") >= 0
                    || findKeyword(statement.toLowerCase(), "fine") >= 0)
            {
                    question = "Oh Okay. Do you like Sprite or Coke?";
                    System.out.println(question);
                    i++;
            }
        else if((i == 2) && (findKeyword(statement.toLowerCase(), "sprite") >= 0
                    || findKeyword(statement.toLowerCase(), "coke") >= 0))
            {
                    question = "Oh cool. Lets have a drink later. Isn't the weather great? please reponse with yea or nah.";
                    System.out.println(question);
                    i++;
            } 
        else if((i == 3) && findKeyword(statement.toLowerCase(), "yeah") >= 0
                     || findKeyword(statement.toLowerCase(), "nah") >= 0)
            {
                question = "yea, i think so too. You hungry? Please respond with yea or nah";
                System.out.println(question);
                i++;
            }
        
        else if((i == 4) && findKeyword(statement.toLowerCase(), "yea") >= 0)
                    //|| findKeyword(statement.toLowerCase(), "nah") >= 0)
            {
                question = "Do you like fried rice, hamburger, pizza, or spaghetti?";
                System.out.println("Ok. Lets have fun.");
                System.out.println("Lets cook some food.");
                System.out.println(question);
                i++;
            }
        else if((i == 5) && (findKeyword(statement.toLowerCase(), "pizza") >= 0))
            {
                System.out.println("This is how you make Cheese Pizza!");
                System.out.println("First you want to get the ingredients for the pizza.");
                System.out.println("Go to Safeway, get pizza dough, get cheese, get tomato sauce");
                System.out.println("Preheat the oven to 400 degree Fahrenheit");
                System.out.println("Take out the dough from the packaging, then roll up the dough. ");
                System.out.println("After the rolling of the dough is down, flatten the dough into a diameter of 18 inches in a circular form.");
                System.out.println("Set aside the dough and open the tomato sauce can.");
                System.out.println("use a spatula to spread out the tomato sauce on the flat pizza dough");
                System.out.println("lastly, sprinkle lots of cheese on top on the pizza and put it into the oven");
                System.out.println("Set the timer and bake the pizza for 15 to 20 minute");    
                System.out.println("Cool we are finish. Lets Eat.");   
            }
        else if((i == 5)&& (findKeyword(statement.toLowerCase(), "hamburger")>= 0))
        {
            System.out.println("To Prepare for the burger patty, get some ground beef, then add salt and pepper");
            System.out.println("get the bread, lettuce, tomato and onion ready, remember to wash the lettuce");
            System.out.println("Take out a pan and heat it for about a minute, at the same time, mix the ground beef well and shape it into a flat circular shape");
            System.out.println("after the pan is heated, put the patty in the pan and fry both sides evenly");
            System.out.println("when your patty is fully cooked, you can put it on the bottom piece of the bread.");
            System.out.println("add in the lettuce, tomato and onion, last the top bun.");
            System.out.println("Cool we are finish. Lets Eat.");
            }
        else if((i == 5)&& (findKeyword(statement.toLowerCase(), "fried rice") >= 0))
            {
                System.out.println(" Lets make the FRIEEEEDD RIIIIIICCCCCCCCEEEE.");
                System.out.println("First you will need to prepare leftover rice and some eggs depends on how much rice you have leftover. ");
                System.out.println("crack the eggs into a big bowl and add a pinch of salt.");
                System.out.println("beat the eggs until it turns completely yellow.");
                System.out.println("heat your pan on the stove, when the pan is hot pour the egg mixture in.");
                System.out.println("keep stirring the egg until it clumps up.");
                System.out.println("pour in the leftover rice and mix the egg with it.");
                System.out.println("after the eggs and rice are fully cooked you can put it in a bowl. ");
                System.out.println("Cool we are finish. Lets Eat.");
        
            }
        else if((i == 5)&& (findKeyword(statement.toLowerCase(), " spaghetti") >= 0))
            {
                System.out.println("Choose the type of spaghetti you like.");
                System.out.println("pour some water into a big pot, turn on the stove and wait for the water to boil.");
                System.out.println("After the water in boiling, out in the spaghetti and cook it for 5 minutes.");
                System.out.println("take the spaghetti out and drain, then rinse it with cold water so it wouldn’t stick together.");
                System.out.println("To make the sauce, pour in tomato sauce into a sauce pan, put in fresh basil and salt to taste.");
                System.out.println("When you're done with making the sauce, put the spaghetti onto a plate and pour the sauce on top.");
                System.out.println("Cool we are finish. Lets Eat.");
            }
        else
        {
            response = getRandomResponse();
        }
        return response;
    
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    //line 157 to 205 meets requirement 3
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn)
                .toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1)
                .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     * 
     * @return a non-committal string
     */
    
    public String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 11;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        //line 236 to 306 meets requirement 2B
        if (x==5)
        //line 241 to 415 meets requirement 4Aiv
        {
         System.out.println("Please answer the question");
         System.out.println(question);
        }
        else {
        if (whichResponse == 0)
        {
            response = "What are you saying?.";
            x++;
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
            x++;
        }
        else if (whichResponse == 2)
        {
            response = "Please coperate";
            x++;
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
            x++;
        }
        else if (whichResponse == 4)
        {
            response = "-_-.";
            x++;
        }
        else if (whichResponse == 5)
        {
            response = "Can you not?";
            x++;
        }
        else if (whichResponse == 6)
        {
            response = "why are u doing this to me?";
            x++;
        }
        else if (whichResponse == 7)
        {
            response = "What are u trying to say?";
            x++;
        }
        else if (whichResponse == 8)
        {
            response = "Stop.";
            x++;
        }
        else if (whichResponse == 7)
        {
            response = "No. Just No.";
            x++;
        }
        else if (whichResponse == 8)
        {
            response = "Leave.";
            x++;
        }
        else if (whichResponse == 9)
        {
            response = "I am so done with you";
            x++;
        }
        else if (whichResponse == 10)
        {
            response = "Good Bye.";
            x++;
        }
    }
        return response;
    }

}
