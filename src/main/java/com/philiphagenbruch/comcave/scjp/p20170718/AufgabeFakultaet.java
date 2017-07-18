package com.philiphagenbruch.comcave.scjp.p20170718;

public class AufgabeFakultaet {

    public static long getFactorialRecursive(final long v) {
        return getFactorialRecursive(0, v, 1);
    }

    private static long getFactorialRecursive(long i, final long v, long c) {
        if (v <= i) return 0L;
        c *= ++i;
        return i == v ? c : getFactorialRecursive(i, v, c);

    }

    public static void main(final String[] args) {
        System.out.println(getFactorialRecursive(15));
    }

}
