package org.example.provider;

import org.example.service.Exchange;

public class SekToDollar implements Exchange {

    @Override
    public String exchange(String value) {
        double result = Integer.parseInt(value) * 0.091064686;
        return String.format(value + " Kr = " + "%.2f Dollars", result);
    }

    @Override
    public String getCurrency() {
        return "dollar";
    }
}
