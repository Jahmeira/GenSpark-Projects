public class TicketPrice {
    int ticketprice = 250;

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
