package com.philiphagenbruch.comcave.scjp.p20170728;

import java.util.Comparator;

public class CarManufacturerNameLengthComparator implements Comparator<Car> {

    @Override
    public int compare(final Car o1, final Car o2) {
        return o1.getManufacturer().length() - o2.getManufacturer().length();
    }

}
