package com.philiphagenbruch.comcave.scjp.p20170728;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(final Person o1, final Person o2) {
        int c = o1.getLastName().compareTo(o2.getLastName());

        if (c == 0) {
            c = o1.getFirstName().compareTo(o2.getFirstName());
        }

        return c;
    }

}
