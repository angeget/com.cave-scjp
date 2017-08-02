package com.philiphagenbruch.comcave.scjp.p20170802;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AufgabeCalendarAlterHappyBirthday {

    public static int getAlter(final Calendar c) {
        final Calendar now = Calendar.getInstance();
        if (now.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)
                && now.get(Calendar.MONTH) == c.get(Calendar.MONTH)) {
            System.out.println("Happy Birthday");
        }
        return now.get(Calendar.YEAR) - c.get(Calendar.YEAR);
    }

    public static void main(final String[] args) {
        final Calendar c1 = new GregorianCalendar(1966, 3, 30);
        final Calendar c2 = new GregorianCalendar(1978, 7, 2);
        final Calendar c3 = new GregorianCalendar(1988, 11, 24);

        System.out.println(getAlter(c1));
        System.out.println(getAlter(c2));
        System.out.println(getAlter(c3));
    }

}
