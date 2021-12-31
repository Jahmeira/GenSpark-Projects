import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TicketPrice{
    //double baseTicketPrice =  50 + (distance * .5);

    public static double price (int price){
        return price;
    }

    public static double discount(int age) {
        if (age <= 12) {
            return .5;
        } else if (age >= 60) {
            return .6;
        } else {
            return 1.0;
        }
    }

    public double String(String gender){
        if(gender == "F"){
            return .25;
        }
        else
            return 0;
    }
}
