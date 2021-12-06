import java.util.Scanner;
import java.util.Set;

public class Main {
    static String letsStart = "Let's Start";
    static String computerWords[] = {"Bitte", "Wasser"};
    static String hidden = new String(new char[computerWords.length]).replace("", "?");
    static String words = computerWords[(int) (Math.random() * computerWords.length)];
    static int guesses = 0;
    String reply;
    boolean playAgain;
    Scanner input = new Scanner(System.in);


    public static void pickALetter() {
       try {
           System.out.println("Halo, WillKommen");
           while (guesses <= 4 && hidden.contains("?")) {
               System.out.println("I am thinking of a word in German, " +
                       "a five letter word. Take a guess.");
               Scanner input = new Scanner(System.in);
               String guess = input.nextLine();
           }
       }
       catch (Exception e){

        }
    }

    public static void hangman(String guess) {
        String hiddenW = "";
        try {
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == guess.charAt(0)) {
                    hiddenW += guess.charAt(0);
                    // missedLetters = 0;
                } else if (hidden.charAt(i) != '?') {
                    hiddenW += words.charAt(i);
                } else {
                    hiddenW += "?";
                }
                // return words;

                if (hidden.equals(hiddenW)) {
                    guesses++;
                    startMakingHangman();
                } else {
                    hidden = hiddenW;
                }
                if (hidden.equals(words)) {
                    System.out.println("Sehr Gut! You got it!" + words);
                }
            }//for
        }
        catch (Exception e){

        }
    }//end hangman

    public boolean isComputerWordAnswer() {
        return words.equals(hidden);
    }

    public static void startMakingHangman() {
        Scanner input = new Scanner(System.in);
        try {

            if (guesses == 1) {
                System.out.println("o");
                System.out.println("Incorrect, you now have 3 guesses left.");
            }

            if (guesses == 2) {
                System.out.println("|");
                System.out.println("Incorrect, you now have 2 guesses left.");

            }

            if (guesses == 3) {
                System.out.println("|");
                System.out.println("Incorrect, you now have 1 guesses left.");

            }

            if (guesses == 4) {
                System.out.println("__");
                System.out.println("Incorrect, you are now out of guesses.");
            }
        }
        catch (Exception e){

        }
    }//startMakingHangman

        boolean playAgain(String reply){
            System.out.println("Do you want to play again? | y or n |");
          //  return playAgain(input.nextLine());

            if (reply.startsWith("y")) {
                return true;
            }
            return false;
        }

}

// //guesscount = new HashSet<>();
//        // return
//    public int getEmptyWordsRemaining(){
//       int emptyWordsRemaining = 0;
//
//       for(int = 0; i < words.length; )
//    }

   /* public void setPlayerGuess(boolean playerGuess) {
        this.playerGuess = playerGuess;
    }*/
    // }//end boolean





   /* String getHidden() {
        while (guesses <= 4 && hidden.contains("?")) {

            System.out.println("Take a guess. Guess the Deutsch Word.");
            String guess = input.nextLine();
            System.out.println(hidden);
        }
        return hidden;
    }
*/





  /*  public String getWords() {
        return words;
    }

    public String intro() {
        System.out.println("Hello player! Let's play 'Deutsch Hangman'!");
        return letsStart;
    }*/



////IGNORE///////
//with each letter guess add to array
//compare the guess array to the answer array
//use .contains// if computerword.contains letterA
//
//for(int i=0;i<=compWord.size();i++){
//    array.add(i)
//        }
//return
/////DONE IGNORE////