package com.philiphagenbruch.comcave.scjp.p20170728;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(final Car o1, final Car o2) {
        int c = o1.getManufacturer().compareTo(o2.getManufacturer());

        if (c == 0) {
            c = o1.getModel().compareTo(o2.getModel());
        }

        if (c == 0) {
            c = o1.getYear() - o2.getYear();
        }

        return c;
    }

}
