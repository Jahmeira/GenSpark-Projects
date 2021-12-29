import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Introduction extends Main {
    String name;
    int score = 0;
    String bodyUtf = "\uD83E\uDDCD";
    File namesScores = new File("C:\\genspark_projects\\NamesAndScoresForHangmanJava.txt");
    Scanner input = new Scanner(namesScores);
    String[] gamerInfo = input.nextLine().split(" ");
    public Introduction() throws FileNotFoundException {
    }

    String getName() throws FileNotFoundException {
        System.out.println("Hello!, Welcome" + bodyUtf);
        System.out.println("What is your name?" + bodyUtf);

        FileOutputStream gamerInfo = new FileOutputStream("NamesAndScoresForHangmanJava.txt");
        PrintWriter pw = new PrintWriter(gamerInfo);
        pw.println(name);
        pw.println(score);
        pw.close();

        input.nextLine();
        return name;
    }

    //NEED TO DO THE SAME BUT FOR SCORES//

    public static void Introduction(String[] args){

        String computerWords[] = {"Water"};
        String hidden = new String(new char[computerWords.length]).replace("", "?");
        String words = computerWords[(int) (Math.random() * computerWords.length)];
        int guesses = 0;
        String bodyUtf = "\uD83E\uDDCD";
        String reply;
        String name;
        String head, body, arms, legs;
        boolean playAgain;
        Scanner input = new Scanner(System.in);
///////////////////////////////////////////////////////////////////////////


    }
}
