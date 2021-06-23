package com.aashoo17.std;

import java.time.*;

public class Time {
    //duration
    public void duration(){
        var a = Duration.ofSeconds(10);     //static methods
        var b = a.getSeconds();
        System.out.println(b);
    }

    //calendar time
    public void calendarTime(){
        var a = ZonedDateTime.now();
        System.out.println(a);

        var b = LocalDateTime.now();
        System.out.println(b);

        //getting year, month, day and hours, min, sec
        //this will be valid for ZonedDateTime also
        var c = b.getHour();
        var d = b.getMinute();
        var e = b.getSecond();

        var f = b.getYear();
        var g = b.getMonth();
        var h = b.getDayOfMonth();
    }
    //instant
    //TODO: can we use this for cpu time calculation
    public void instant(){
        var a = Instant.now();
        //do something here
        var b = Instant.now();
        var c = b.compareTo(a);     //TODO: what is it returning - microseconds ??
        System.out.println(c);
    }
}
