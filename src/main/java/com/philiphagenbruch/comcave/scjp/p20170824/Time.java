package com.philiphagenbruch.comcave.scjp.p20170824;

import java.text.DecimalFormat;

class Time implements Comparable<Time> {

    private static final DecimalFormat FORMAT = new DecimalFormat("00");

    private int hour;
    private int minute;

    public Time(final int hour, final int minute) {
        setHour(hour);
        setMinute(minute);
    }

    @Override
    public int compareTo(final Time o) {
        int r = hour - o.hour;

        if (r == 0) {
            r = minute - o.minute;
        }

        return r;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(final int hour) {
        if (hour < 0 || hour > 23) throw new IllegalArgumentException();
        this.hour = hour;
    }

    public void setMinute(final int minute) {
        if (minute < 0 || minute > 59) throw new IllegalArgumentException();
        this.minute = minute;
    }

    @Override
    public String toString() {
        return FORMAT.format(hour) + ":" + FORMAT.format(minute);
    }

}
