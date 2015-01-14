package view;

import model.ExchangeRate;
import model.Money;

public class Exchanger {
    private final double exchanger;

    public Exchanger(ExchangeRate exchangeRate, Money money){
        this.exchanger = calculateMoney(exchangeRate.getRate().getAmount(), money.getAmount());
    }

    private double calculateMoney(double exchangeRate, double money) {
        return money*exchangeRate;
    }
    
}
