package com.company;

import java.time.LocalDateTime;

public class KaskoPolicy extends PolicyBase {
    private int bonusMalus;
    private int year;
    private int age;

    public KaskoPolicy(String policyNumber, LocalDateTime from, LocalDateTime to, double premium, PolicyStatus status, int bonusMalus, int year, int age) {
        super(policyNumber, from, to, premium, status);
        this.bonusMalus = bonusMalus;
        this.year = year;
        this.age = age;
    }

    public int getBonusMalus() {
        return bonusMalus;
    }

    public void setBonusMalus(int bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
