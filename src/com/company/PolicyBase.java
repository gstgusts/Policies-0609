package com.company;

import java.time.LocalDateTime;

public class PolicyBase {
    private String policyNumber;
    private LocalDateTime from;
    private LocalDateTime to;
    private double premium;
    private PolicyStatus status;

    public PolicyBase(String policyNumber, LocalDateTime from, LocalDateTime to, double premium, PolicyStatus status) {
        this.policyNumber = policyNumber;
        this.from = from;
        this.to = to;
        this.premium = premium;
        this.status = status;
    }

    public void issue() {

    }

    public void calculatePremium() {

    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public void setStatus(PolicyStatus status) {
        this.status = status;
    }
}
