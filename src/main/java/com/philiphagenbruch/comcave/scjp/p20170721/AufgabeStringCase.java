package com.philiphagenbruch.comcave.scjp.p20170721;

public class AufgabeStringCase {

    public static boolean isTextFile(final String fileName) {
        return fileName.toUpperCase().endsWith(".TXT");
    }

    public static void main(final String[] args) {
        System.out.println(isTextFile("readme"));
        System.out.println(isTextFile("readme.txt"));
        System.out.println(isTextFile("readme.md"));
        System.out.println(isTextFile("readme.tXt"));
    }

}
