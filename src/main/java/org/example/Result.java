<<<<<<< HEAD
package org.example;public class Result {
=======
package org.example;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Result {


    String finDay(int month,int day,int year) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(year,month,day);
        return LocalDate.of(year,month,day).getDayOfWeek().toString();


    }
    String finDay2(int month,int day,int year) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(year, month-1, day);
        int dayOfWeek = rightNow.get(Calendar.DAY_OF_WEEK);
        String result = "";
        switch (dayOfWeek) {
            case 2:
                result = "MONDAY";
                break;
            case 3:
                result = "TUESDAY";
                break;
            case 4:
                result = "WEDNESDAY";
                break;
            case 5:
                result = "THURSDAY";
                break;
            case 6:
                result = "FRIDAY";
                break;
            case 7:
                result = "SATURDAY";
                break;
            case 1:
                result = "SUNDAY";
                break;
        }
        return result;

    }









>>>>>>> a2834c3 (Initial commit)
}
