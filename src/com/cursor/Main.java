package com.cursor;

public class Main {

    public static void main(String[] args) {
        int a, b, e, x, X, y, w;
        a = 2;
        b = 700;
        e = 15;
        x = 58;
        X = 567;
        y = 75;
        w = 106;
        String S = "x + y - a / 2 * (x + w)";
        String S1 = "a * (x + x) / y - a * 3";
        String S2 = "a + b / x - y";
        String S3 = "X - e / 2 % e + 1";


        System.out.println(S + ' ' + "result is" + ' ' + (x + y - a / 2 * (x + w)));
        System.out.println(S1 + ' ' + "result is" + ' ' + (a * (x + x) / y - a * 3));
        System.out.println(S2 + ' ' + "result is" + ' ' + (a + b / x - y));
        System.out.println(S3 + ' ' + "result is" + ' ' + (X - e / 2 % e + 1));

    }
}
