package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static PolicyRepository policyRepository = new PolicyRepository();
    private static JPanel mainPanel;
    private static JList<String> policyList;
    private static JButton btnCalculate;
    private static JLabel lblCalculationResult;

    public static void main(String[] args) {

        policyRepository.loadPolicies();

        JFrame mainFrame = new JFrame("Policy premium calculator");
        mainFrame.setSize(500, 500);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,1));

        DefaultListModel<String> l1 = new DefaultListModel<>();

        for (var policy:
             policyRepository.getPolicies()) {
             l1.addElement(policy.getPolicyNumber());
        }

        policyList = new JList<>(l1);
        mainPanel.add(policyList);

        lblCalculationResult = new JLabel();

        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var selectedPolicyNumber = policyList.getSelectedValue();
                if(selectedPolicyNumber != null && !selectedPolicyNumber.isEmpty()) {
                    var premium = policyRepository.calculatePremium(selectedPolicyNumber);
                    lblCalculationResult.setText(premium + "");
                }
            }
        });

        mainPanel.add(btnCalculate);
        mainPanel.add(lblCalculationResult);

        mainFrame.setContentPane(mainPanel);
        mainFrame.setVisible(true);

    }
}
