package com.philiphagenbruch.comcave.scjp.p20170727;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AufgabeScanner {

    @FunctionalInterface
    private interface Operation {

        double perform(double a, double b);
    }

    private enum Operator {
        ADD("+", (a, b) -> a + b),
        SUBSTRACT("-", (a, b) -> a - b),
        MULTIPLY("*", (a, b) -> a * b),
        DIVIDE("/", (a, b) -> a / b),
        POWER("P", (a, b) -> Math.pow(a, b));

        private static final Map<String, Operator> byChar = new HashMap<>();
        static {
            for (final Operator v : values()) {
                byChar.put(v.operatorChar, v);
            }
        }

        private final String operatorChar;
        private final Operation operation;

        private Operator(final String operator, final Operation operation) {
            this.operatorChar = operator;
            this.operation = operation;
        }

    }

    private static final boolean GOD_IS_A_SPAGHETTI_MONSTER = true;

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (GOD_IS_A_SPAGHETTI_MONSTER) {

            System.out.println("Operation wählen: +, -, *, /, p (Potenz), q zum Beenden");
            final String inOp = sc.next().toUpperCase();

            if (inOp.equals("Q")) {
                sc.close(); // Hör auf zu meckern!
                System.exit(0);
            }

            final Operator op = Operator.byChar.get(inOp);
            if (op == null) {
                System.out.println("Unbekannter operator: " + inOp + "\n");
                continue;
            }

            System.out.println("Fließkommaoperant 1 (links) eingeben:");
            final double a = sc.nextDouble();

            System.out.println("Fließkommaoperant 2 (rechts) eingeben:");
            final double b = sc.nextDouble();

            System.out.println("Resultat: " + op.operation.perform(a, b) + "\n");

        }

    }

}
