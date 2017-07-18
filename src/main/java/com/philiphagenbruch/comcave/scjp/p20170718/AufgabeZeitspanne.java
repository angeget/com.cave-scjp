package com.philiphagenbruch.comcave.scjp.p20170718;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AufgabeZeitspanne {

    public static long getTimeSpanInDays(final Calendar earlier, final Calendar later) { // o7, SO
        return (later.getTime().getTime() - earlier.getTime().getTime()) / (1000L * 60L * 60L * 24L);
    }

    public static void main(final String[] args) {
        System.out.println(getTimeSpanInDays(Calendar.getInstance(), new GregorianCalendar(3000, 1, 1)));
    }

}
