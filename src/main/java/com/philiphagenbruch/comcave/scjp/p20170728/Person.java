package com.philiphagenbruch.comcave.scjp.p20170728;

public class Person implements Comparable<Person> {

    private static final PersonComparator COMPARATOR = new PersonComparator();

    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public Person() {}

    public Person(final String firstName, final String lastName, final int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(final Person o) {
        return COMPARATOR.compare(this, o);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBirth(final int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", yearOfBirth=" + yearOfBirth + "]";
    }

}
