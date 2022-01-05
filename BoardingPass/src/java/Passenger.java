import java.util.Calendar;
import java.util.Scanner;

public class Passenger  {
    //Getters & Setters
    Scanner input = new Scanner(System.in);
    String name;
    String email;
    String gender;
    //{"M", "F"};
    int age;
    String phoneNum;
    int boardingPassNum;
    Calendar departureTime;
    int year;
    int month;
    int date;
    int hourOfDay;
    int minute;

    public Integer getDate(){
        return this.date;
    }
    public void setDate(int date){
        this.date = date;
    }

    public Calendar getDepartureTime() {
        return this.departureTime;
    }
    public void setDepartureTime(String s) {
        Calendar departureTime = null;
        departureTime.set(year, month, date, hourOfDay, minute);
        this.departureTime = departureTime;
    }

    public Integer getBoardingPassNum(){
        return this.boardingPassNum;
    }
    public void setBoardingPassNum(int boardingPassNum){
        this.boardingPassNum = boardingPassNum;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public Integer getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }


}
