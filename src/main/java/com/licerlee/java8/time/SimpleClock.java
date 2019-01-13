package com.licerlee.java8.time;

import java.sql.Date;
import java.time.Clock;
import java.time.Instant;

public class SimpleClock {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();

        System.out.println(clock.getZone());
        long millis = clock.millis();
        System.out.println( millis);

        Instant instant = clock.instant();
        System.out.println( instant);

        int nano = instant.getNano();
        System.out.println( nano);

        java.util.Date date = Date.from(instant);
        System.out.println( date);



    }
}
