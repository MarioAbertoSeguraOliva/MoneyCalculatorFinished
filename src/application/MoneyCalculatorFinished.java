package application;

import controller.ExchangeCommand;
import view.CurrencySet;
import view.CurrencySetLoader;

public class MoneyCalculatorFinished {

    public static void main(String[] args) {
        CurrencySet currencySet = CurrencySetLoader.load();
        ExchangeCommand exchangeCommand = new ExchangeCommand(currencySet);
        exchangeCommand.execute();
    }
    
}
