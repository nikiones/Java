package ua.edu.chmnu.fks.oop;

import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("====="+ date);
        java.time.LocalDate dd2 = java.time.LocalDate.now();
        java.sql.Date dd = java.sql.Date.valueOf(dd2);
        System.out.println("+++"+dd);
    }
}
