//package com.company;

import com.company.BoardingInfo;
import com.company.TicketPrice;

import java.io.*;
import java.util.Scanner;

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

public class Main {

    public static void Main (String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("BoardingInfoFile.txt", true));
        BufferedReader reader = new BufferedReader(new FileReader("BoardingInfoFile"));

        Scanner input = new Scanner(System.in);
        Passenger passenger = new Passenger(); //BOARDING PASS INFO a and has passenger info
        BoardingInfo boardingInfo = new BoardingInfo(); //BOARDING PASS bp boardingpass info
        TicketPrice ticketPrice = new TicketPrice();


        writer.write("✈ JSJ Airlines ✈\n");
        boardingInfo.textFormat(input, writer, passenger, boardingInfo);
        boardingInfo.userFillOut(input, writer, passenger);
        Locations locations = new Locations();
        Double distance = locations.location(origin, destination);
        ticketPrice.price(distance, passenger.getAge(), passenger.getGender());

        writer.close();
        boardingInfo.displayFile(reader);
    }

    //For storing passengers info
  /*  File boardingInfo = new File("\"C:\\genspark_projects\\BoardingPass\\BoardingInfoFile.txt\"");
    //File for boarding pass template // template needed
    File boardingTemplate = new File("");
    boardingInfo.write(age, name,)*/

    public static String bPN; //boarding pass number
    public static String date;
    public static String origin;
    public static String destination;
    public static String dT; //departure time
    public static int age;
    public static String gender;

    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        String name = passenger.getName();
        String origin = null;
        String destination = null;
        Locations locations = new Locations();
        Double distance = locations.location(origin, destination);
        int flightduration = (int) Math.round(distance) + 10; //duration of flight in minutes
        TicketPrice calculator = new TicketPrice();
        Double price = calculator.price(distance, age, gender);
        BoardingPassNumber boardingPassNumber = new BoardingPassNumber();
        bPN = boardingPassNumber.bPN(name, date, distance);
    }
}
