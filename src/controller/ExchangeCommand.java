package controller;

import view.ApplicationFrame;
import view.CurrencySet;

public class ExchangeCommand {
    private final CurrencySet currencySet;
    
    public ExchangeCommand(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }

    public void execute() {
        new ApplicationFrame(currencySet);
    }
    
}
