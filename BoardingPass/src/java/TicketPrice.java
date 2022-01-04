//package com.company;

public class TicketPrice {
    public static double price(Double distance, int age, String gender) {
        double finalprice = 0;
        try {
            finalprice = 50 + (.5 * distance);
            if (age <= 12) {
                finalprice *= .5;
            } else if (age >= 60) {
                finalprice *= .4;
            }
            if (gender == "F") {
                finalprice *= .75;
            }
            finalprice = Math.round(finalprice * 100) / 100;
            return finalprice;
        } catch (Exception e) {
            System.out.println("Error generating final price of ticket.");
        }
        return finalprice;
    }
}
