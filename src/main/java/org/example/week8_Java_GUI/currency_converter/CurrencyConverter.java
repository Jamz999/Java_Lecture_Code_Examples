package org.example.week8_Java_GUI.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JPanel mainPanel;
    private JTextField dollarsTextField;
    private JButton convertToCurrencyButton;
    private JLabel result;
    private JComboBox<String> currencyComboBox;

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    private final Map<String, Double> exchangeRates = Map.of(
            EUROS, 0.84,
            POUNDS, 0.75
    );

    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500, 272));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        for (String currencyName : exchangeRates.keySet()) {
            currencyComboBox.addItem(currencyName);
        }

        convertToCurrencyButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // This gets the text field string.
                    String dollarString = dollarsTextField.getText();
                    // convert to another currency.
                    String toCurrency = (String) currencyComboBox.getSelectedItem();
                    double conversionFactor = exchangeRates.get(toCurrency);

                    double dollars = Double.parseDouble(dollarString);
                    double converted_currency = dollars * conversionFactor;
                    // display to label 'result'.
                    String resultString = String.format("Result: %.2f dollars is equivalent to %.2f %s",
                            dollars, converted_currency, toCurrency);
                    result.setText(resultString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number. (No $ or any other character)");
                }
            }
        });
    }
}
