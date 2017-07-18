package com.philiphagenbruch.comcave.scjp.p20170718;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AufgabeA8 {

    public static void main(final String[] args) {
        final int year = 2017;
        for (int monat = 1; monat <= 12; monat++) {
            final Calendar cal = new GregorianCalendar(year, monat - 1, 1);
            System.out.print("Monat " + monat + ":");
            for (int i = 0; i < cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
                System.out.print(" " + (i + 1));
            }
            System.out.println();
        }
    }

}
