package com.philiphagenbruch.comcave.scjp.p20170803;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AufgabeFahrscheinautomat {

    enum Currency {

        CENT_1(0.01f),
        CENT_2(0.02f),
        CENT_5(0.05f),
        CENT_10(0.1f),
        CENT_20(0.2f),
        CENT_50(0.5f),
        EURO_1(1.0f),
        EURO_2(2.0f),
        NOTE_5(5.0f),
        NOTE_10(10.0f),
        NOTE_20(20.0f);

        private final float value;

        private Currency(final float value) {
            this.value = value;
        }

    }

    static class CurrencyComparatorDescending implements Comparator<Currency> {

        @Override
        public int compare(final Currency o1, final Currency o2) {
            return (int) ((o2.value * 100f) - (o1.value * 100f));
        }

    }

    enum Preisstufe {

        K(1.4f),
        A(2.3f),
        B(4.7f),
        C(9.6f),
        D(11.4f);

        private final float price;

        private Preisstufe(final float price) {
            this.price = price;
        }

    }

    private static final NumberFormat CF = DecimalFormat.getCurrencyInstance();

    private static void loop(final Scanner sc) {

        System.out.println("Verfügbare Tickets:");
        for (final Preisstufe v : Preisstufe.values()) {
            System.out.println(" " + v.name() + ": " + CF.format(v.price));
        }

        System.out.println();

        Preisstufe choice = null;
        while (choice == null) {
            System.out.print("Typ wählen: ");
            choice = Preisstufe.valueOf(sc.next().toUpperCase());
        }

        System.out.println("\nAkzeptierte Münzen und Noten:");
        for (final Currency v : Currency.values()) {
            System.out.println(" " + v.name() + ": " + CF.format(v.value));
        }

        float unpaid = choice.price;
        while (unpaid > 0f) {
            System.out.println("\nZu zahlen: " + CF.format(unpaid));
            System.out.print("Münze oder Note eingeben: ");
            final Currency coin = Currency.valueOf(sc.next().toUpperCase());

            if (coin == null) {
                continue;
            }

            unpaid -= coin.value;
        }

        if (unpaid < 0f) {
            final Set<Currency> coins = new TreeSet<>(new CurrencyComparatorDescending());
            coins.addAll(Arrays.asList(Currency.values()));

            System.out.println("\nWechselgeld: ");

            while (unpaid < -0.01f) { // Precision, precision ...
                for (final Currency coin : coins) {
                    if (coin.value <= Math.abs(unpaid)) {
                        unpaid += coin.value;
                        System.out.println(coin.name());
                        break;
                    }
                }
            }

        }

        System.out.println("\nDer Nächste!\n");

    }

    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);

        while (true) {
            loop(sc);
        }

    }

}
