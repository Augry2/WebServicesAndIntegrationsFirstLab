package org.sekToEuroProvider;

import org.example.service.Exchange;

public class SekToEuro implements Exchange {

    @Override
    public String exchange(String value) {
        double result = Integer.parseInt(value) * 0.085;
        return String.format(value + " Kr = " + "%.2f Euro", result);
    }

    @Override
    public String getCurrency() {
        return "euro";
    }
}
