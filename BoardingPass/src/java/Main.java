import java.util.Scanner;
import java.io.File;

/*
•	The user will be required to enter their Name, Email, Phone Number, Gender, Age, Date, Destination, and Departure Time into the console or GUI (teams’ preference).
•	From the input the computer must generate the ETA and Ticket Price.
•	The computer must generate the boarding pass number ensuring the number is unique.
•	All generated data as well as the data acquired from the user input must be stored in a file.
•	Using the data in the file write the ticket to a new file in a user-friendly format (team’s preference).
•	Make sure you test your code.
•	Ticket Price should be calculated as follows:
	Age < = 12, 50% reduction of ticket price regardless of gender
	Age > = 60, 60% reduction of ticket price regardless of gender
	Females, 25% discount on the ticket price

 */

public class Main extends BoardingInfo {

    public static void Main (String[] args){

    }
    Scanner input = new Scanner(System.in);
////dfsgdhfnkb
    //For storing passengers info
    File boardingInfo = new File("\"C:\\genspark_projects\\BoardingPass\\BoardingInfoFile.txt\"");

    //File for boarding pass template // template needed
    File boardingTemplate = new File("");

    public static int bPN; //boarding pass number
    public static String date;
    public static String origin;
    public static String destination;
    public static String dT; //departure time
    String gender [] = {"M", "F"};





    public static void main(String[] args) {
        //placeholder
    }


}