//package com.company;

public class Distance {
    private static final double r2d = 180 / 3.14;
    private static final double d2r = 3.14 / 180;
    private static final double d2km = 111.19 * r2d;

    public static double kmeters(double lt1, double ln1, double lt2, double ln2) {
        double ans;
        double x = lt1 * d2r;
        double y = lt2 * d2r;
        ans = Math.acos(Math.sin(x) * Math.sin(y) + Math.cos(x) * Math.cos(y) * Math.cos(d2r * (ln1 - ln2))) * d2km;
        return ans;
    }

    //TODO
    // Convert kilometers to price

}
