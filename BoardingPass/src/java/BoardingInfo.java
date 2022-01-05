import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class BoardingInfo {

    private String boardingPassNum;
    private Calendar date;
    private Calendar departureTime;
    private String originalDeparture;
    private String destination;
    private Calendar eta;

    BoardingInfo() {
    }

//TODO This should go with the location class
    /*public void textFormat(input, BoardingInfo boardingInfo, BufferedWriter writer) throws IOException {
        Scanner input = new Scanner(System.in);

        boardingInfo.setBoardingPassNum(boardingPassNum);
        writer.write("\nBoarding Pass Number: " + boardingInfo.getBoardingPassNum());

        System.out.println("\nPlace of Departure: ");
        boardingInfo.setOriginalDeparture(input.nextLine());
        writer.write("\nOrigin: " + boardingInfo.getOriginalDeparture());

        System.out.println("\nDestination: " + boardingInfo.getDestination());

    }*/
public void textFormat(Scanner input, BufferedWriter writer, Passenger passenger, BoardingInfo boardingInfo) throws IOException {

    Random random = new Random();

    int boardingPassNum = (int)Math.floor(Math.random() * (10000000 - 1000000 + 1) + 1000000);
    passenger.setBoardingPassNum(boardingPassNum);

    writer.write("Boarding Pass Number: " + passenger.getBoardingPassNum());


    System.out.print("Departure Date: ");
    passenger.setDate(input.nextInt());
    writer.write("   Departure date: " + passenger.getDate());

    System.out.print("Origin: ");
    boardingInfo.setOriginalDeparture(input.nextLine());
    writer.write("   Origin: " + boardingInfo.getOriginalDeparture());

    System.out.print("Destination: ");
    boardingInfo.setDestination(input.nextLine());
    writer.write("   Destination: " + boardingInfo.getDestination());

    //Random ETA generator
    int hour = random.nextInt(12);
    int minute = random.nextInt(60);

    if (minute < 10) {
        String setETA = String.valueOf(hour) + ":0" + String.valueOf(minute);
        writer.write("   ETA: " + setETA);
    } else {
        String setETA = String.valueOf(hour) + ":" + String.valueOf(minute);
        writer.write("   ETA: " + setETA);
    }


    System.out.print("Departure Time: ");
    passenger.setDepartureTime(input.nextLine());
    writer.write("   Departure Time: " + passenger.getDepartureTime());
    writer.write("\n");

}


    //Second line of info in Boarding pass
    public void userFillOut(Scanner input, BufferedWriter writer, Passenger passenger) throws IOException {

        System.out.print("Name: ");
        passenger.setName(input.nextLine());
        writer.write("Name: " + passenger.getName());

        System.out.print("Email: ");
        passenger.setEmail(input.nextLine());
        writer.write("   Email: " + passenger.getEmail());

        System.out.print("Phone Number: ");
        passenger.setPhoneNum(input.nextLine());
        writer.write("   Phone Number: " + passenger.getPhoneNum());


        System.out.print("Gender(F/M): ");
        passenger.setGender(input.nextLine());
        writer.write("   Gender: " + passenger.getGender());


        System.out.print("Age: ");
        passenger.setAge(input.nextInt());
        writer.write("   Age: " + passenger.getAge());
        writer.write("\n");


    }

    public void displayFile(BufferedReader reader) {
        try {
            String line;
            while ((line =reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    BoardingInfo(String boardingPassNum, Calendar date, Calendar departureTime, String originalDeparture, String destination) {
        this.boardingPassNum = boardingPassNum;
        this.originalDeparture = originalDeparture;
        this.departureTime = departureTime;
        this.destination = destination;
        this.date = date;

        calcEta(originalDeparture, destination, departureTime);
    }

    //Getters and Setters
    public String getBoardingPassNum() {
        return this.boardingPassNum;
    }
    public void setBoardingPassNum(String boardingPassNum) {
        this.boardingPassNum = boardingPassNum;
    }

   /* public Calendar getDate() {
        return this.date;
    }*/
    /*public void setDate(int year, int month, int day) {
        Calendar date = null;
        date.set(year, month, day);
        this.date = date;
    }*/

    public Calendar getDepartureTime() {
        return this.departureTime;
    }
    public void setDepartureTime(int year, int month, int date, int hourOfDay, int minute) {
        Calendar departureTime = null;
        departureTime.set(year, month, date, hourOfDay, minute);
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return this.destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Calendar getEta() {
        return this.eta;
    }
    public void setEta(Calendar eta) {
        this.eta = eta;
    }

    public String getOriginalDeparture() {
        return this.originalDeparture;
    }
    public void setOriginalDeparture(String originalDeparture) {
        this.originalDeparture = originalDeparture;
    }

    //////////////////////////////////////////////
    public Calendar calcEta(String originalDeparture, String destination, Calendar departureTime) {
        return this.getEta();
    }

    public Calendar calcEta() {
        return this.getEta();
    }
}


