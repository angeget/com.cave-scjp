package com.philiphagenbruch.comcave.scjp.p20170725;

public class Animal {

    private String name;
    private int age;
    private boolean healthy;

    public Animal() {}

    public Animal(final String name, final int age, final boolean healthy) {
        this.name = name;
        this.age = age;
        this.healthy = healthy;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setHealthy(final boolean healthy) {
        this.healthy = healthy;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(getClass().getSimpleName() + " " + name + " walks.");
    }

}
