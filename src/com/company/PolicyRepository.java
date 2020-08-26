package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PolicyRepository {
    private List<PolicyBase> policies = new ArrayList<>();

    public void loadPolicies() {
        var kasko = new KaskoPolicy("K1",
                LocalDateTime.now(),
                LocalDateTime.now().plusMonths(1),
                0,
                PolicyStatus.NOT_PAID,
                1,
                2020,
                18
        );

        var travel = new TravelPolicy("T1",
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(10),
                0,
                PolicyStatus.NOT_PAID,
                2,
                "USA"
        );

        policies.add(kasko);
        policies.add(travel);
    }

    public double calculatePremium(String policyNumber) {

        var policy = policies.stream().filter(p-> p.getPolicyNumber().equals(policyNumber)).findFirst();

        if(policy.isPresent()) {
            var p = policy.get();
            p.calculatePremium();

            return p.getPremium();
        }

        return -1;
    }

    public List<PolicyBase> getPolicies() {
        return policies;
    }
}
