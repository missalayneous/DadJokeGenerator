import java.util.Scanner;

public class DadJokeGenerator {

    public static void main(String[] args) {

        //Create a new scanner
        Scanner input = new Scanner (System.in);

        //Greeting
        System.out.println("\nWelcome to the hilarious Dad Joke Generator!\n");

        //Create an array and populate it with 20 dad jokes
        String[] joke = new String[20];

        joke[0] = "What do you call a zombie who cooks stir fries? Dead man wok-ing.";
        joke[1] = "Mountains aren't just funny. They're hill areas.";
        joke[2] = "I once had a dream I was floating in an ocean of orange soda. It was more of a fanta sea.";
        joke[3] = "What did the pirate say on his eightieth birthday? ''Aye Matey!''";
        joke[5] = "I made a pencil with two erasers. It was pointless.";
        joke[6] = "I've got a great joke about construction, but I'm still working on it.";
        joke[7] = "I used to be a personal trainer. Then I gave my too weak notice.";
        joke[8] = "I used to be addicted to soap, but I'm clean now.";
        joke[9] = "What genre are national anthems? Country.";
        joke[10] = "I only know 25 letters of the alphabet. I don't know y.";
        joke[11] = "Have you ever tried to catch a fog? I tried yesterday but I mist.";
        joke[12] = "Someone has glued my pack of cards together - I don't know how to deal with it.";
        joke[13] = "I was wondering why the frisbee kept looking bigger and bigger, and then it hit me.";
        joke[14] = "I have a fear of speed bumps. I'm slowly getting over it.";
        joke[15] = "I used to be addicted to the hokey pokey, but then I turned myself around.";
        joke[16] = "I could tell a joke about pizza, but it's a little cheesy.";
        joke[18] = "Dogs can't operate MRI machines. But catscan.";
        joke[19] = "Sundays are always a little sad, but the day before is a sadder day.";

        //Display the count of the Dad Jokes to the user:
        //Create a variable for the length of the joke array
        int count=joke.length;


        //Display the length of the array to the user
        System.out.println("We have " + count + " total Dad Jokes!\n");
        System.out.println("Here is a sample of some of the jokes:");

        //Use a for loop to display four Dad Jokes to the user
        for (int i = 0; i < 3; i++) {
            System.out.println(joke[i]);
        }//end for loop

        //Create a boolean variable set to true in order to begin the while loop
        boolean responseIsYes = true;

        //Create while loop
        while(responseIsYes) {

                    //Get a random Dad Joke
                    int randomJoke = (int) (Math.random() * joke.length);

                    //Display random Dad Joke to user
                    System.out.println(joke[randomJoke]);

            //Ask user if they would like another joke
            System.out.println("\nWould you like to see another Dad Joke? Yes or No");

            //Assign the variable to the users input
            String response = input.next();

            //if statement for when user inputs no
           if (response.equalsIgnoreCase("no")) {

               //Declare boolean as false in this case
                responseIsYes = false;

                //Closing message
                System.out.println("\nOkay, thanks for stopping by!");

            }//end else if statement

        }//end while loop

    }//end main

}//end class

