package com.philiphagenbruch.comcave.scjp.p20170801;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AufgabeEnums {

    enum CoffeeType {

        KAFFEE(1.0f),
        CAPPUCCINO(1.2f),
        ESPRESSO(1.13f);

        private static final Map<String, CoffeeType> byName = new HashMap<>();

        static {
            for (final CoffeeType v : values()) {
                byName.put(v.name(), v);
            }
        }

        private final float price;

        private CoffeeType(final float price) {
            this.price = price;
        }

    }

    enum Coin {

        CENT_1(0.01f),
        CENT_2(0.02f),
        CENT_5(0.05f),
        CENT_10(0.1f),
        CENT_20(0.2f),
        CENT_50(0.5f),
        EURO_1(1.0f),
        EURO_2(2.0f);

        private static final Map<String, Coin> byName = new HashMap<>();

        static {
            for (final Coin v : values()) {
                byName.put(v.name(), v);
            }
        }

        private final float value;

        private Coin(final float value) {
            this.value = value;
        }

    }

    static class CoinComparatorDescending implements Comparator<Coin> {

        @Override
        public int compare(final Coin o1, final Coin o2) {
            return (int) ((o2.value * 100f) - (o1.value * 100f));
        }

    }

    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);

        System.out.println("Sorten:");
        for (final CoffeeType v : CoffeeType.values()) {
            System.out.println(" " + v.name() + ": " + v.price + "€");
        }

        System.out.println();

        CoffeeType choice = null;
        while (choice == null) {
            System.out.print("Sorte wählen: ");
            choice = CoffeeType.byName.get(sc.next().toUpperCase());
        }

        System.out.println("\nAkzeptierte Münzen:");
        for (final Coin v : Coin.values()) {
            System.out.println(" " + v.name() + ": " + v.value + "€");
        }

        float unpaid = choice.price;
        while (unpaid > 0f) {
            System.out.println("\nZu zahlen: " + unpaid);
            System.out.print("Münze einwerfen: ");
            final Coin coin = Coin.byName.get(sc.next().toUpperCase());

            if (coin == null) {
                continue;
            }

            unpaid -= coin.value;
        }

        if (unpaid < 0f) {
            final Set<Coin> coins = new TreeSet<>(new CoinComparatorDescending());
            coins.addAll(Arrays.asList(Coin.values()));

            System.out.println("\nWechselgeld: ");

            while (unpaid < -0.01f) { // Precision, precision ...
                for (final Coin coin : coins) {
                    if (coin.value <= Math.abs(unpaid)) {
                        unpaid += coin.value;
                        System.out.println(coin.name());
                        break;
                    }
                }
            }

        }

        System.out.println("\nGenieße dein Getränk!");

        sc.close();
    }

}
