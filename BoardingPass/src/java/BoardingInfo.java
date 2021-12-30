import java.util.Calendar;

public class BoardingInfo {

    private String boardingPassNum;
    private Calendar date;
    private Calendar departureTime;
    private String originalDeparture;
    private String destination;
    private Calendar eta;

    BoardingInfo() {
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

    public Calendar getDate() {
        return this.date;
    }
    public void setDate(int year, int month, int day) {
        Calendar date = null;
        date.set(year, month, day);
        this.date = date;
    }

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


