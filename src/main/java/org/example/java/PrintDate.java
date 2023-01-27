package org.example.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDate {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy hh:mm");
        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);
    }
}
