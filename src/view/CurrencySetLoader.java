package view;

import model.Currency;

public class CurrencySetLoader {

    public static CurrencySet load(){
        CurrencySet currencySet = new CurrencySet();
        currencySet.addCurrency(new Currency("EUR", "Euro", 'E'));
        currencySet.addCurrency(new Currency("USD", "Dollar", '$'));
        currencySet.addCurrency(new Currency("CSD", "DollarC", 'C'));
        return currencySet;
    }
}
