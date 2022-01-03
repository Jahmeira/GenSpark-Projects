//package com.company;

public class TicketPrice {
    public static double price(Double distance, int age, String gender) {
        double finalprice = 50 + (.5 * distance);
        if (age <= 12) {
            finalprice *= .5;
        } else if (age >= 60) {
            finalprice *= .4;
        }
        if (gender == "F"){
            finalprice *= .75;
        }
        return finalprice;
    }
}
