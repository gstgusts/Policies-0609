package com.company;

import java.time.LocalDateTime;

public class TravelPolicy extends PolicyBase {
    private int peopleCount;
    private String countryCode;

    public TravelPolicy(String policyNumber, LocalDateTime from, LocalDateTime to, double premium, PolicyStatus status, int peopleCount, String countryCode) {
        super(policyNumber, from, to, premium, status);
        this.peopleCount = peopleCount;
        this.countryCode = countryCode;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public void calculatePremium() {
        System.out.println("Calculate Travel");
    }
}
