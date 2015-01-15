package controller;

import view.CurrencySet;
import view.ExchangeRateLoader;

public class ExchangeCommand {
    private final CurrencySet currencySet;
    
    public ExchangeCommand(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }

    public void execute() {
        ExchangeRateLoader.load(currencySet);
    }
    
}
