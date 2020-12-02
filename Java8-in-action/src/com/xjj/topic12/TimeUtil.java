package com.xjj.topic12;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

/**
 * @Author LJ
 * @Date 2020/11/10
 * msg
 */

public class TimeUtil {
    public static void main(String[] args) {
        final LocalDate nowDate = LocalDate.now();      //2020-11-10
        System.out.println(nowDate);

        final Instant begin = Instant.now();
        final Instant end = Instant.now();
//        System.out.println(begin.getNano());


        Instant instant = Instant.ofEpochSecond(44 * 365 * 86400);
        Instant now = Instant.now();
        Duration d1 = Duration.between(instant, now);
        System.out.println(d1.getSeconds());     // 持续时间s
        System.out.println(d1.getNano());     // 持续时间ns


        Period tenDays = Period.between(LocalDate.of(2014, 3, 8),
                LocalDate.of(2014, 3,18));
        System.out.println(tenDays.getDays());
    }

    public static void test() {

    }
}
