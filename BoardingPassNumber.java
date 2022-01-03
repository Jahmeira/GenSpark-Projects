package com.company;

public class BoardingPassNumber {
    public static String bPN (String name, String date, Double distance) {
        return name + date + Math.round(distance);
    }
}
