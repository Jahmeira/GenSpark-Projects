package com.company;

public class BoardingPassNumber {
    public static String bPN (String name, String date, Double distance) {
        try {
            return name + date + Math.round(distance);
        } catch (Exception e) {
            System.out.println("Error generating boarding pass number.");
        }
        return name + date + Math.round(distance);
    }
}
