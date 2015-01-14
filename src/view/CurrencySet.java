package view;

import java.util.HashMap;
import model.Currency;

public class CurrencySet {
    private final HashMap<String, Currency> currencySet;

    public CurrencySet() {
        this.currencySet = new HashMap<>();
    }

    public HashMap<String, Currency> getCurrencySet() {
        return currencySet;
    }
    
    public void addCurrency(Currency currency){
        if(!currencySet.containsKey(currency.getCode()))
            currencySet.put(currency.getCode(), currency);
    }
    
    public void removeCurrency(Currency currency){
        if(currencySet.containsKey(currency.getCode()))
            currencySet.remove(currency.getCode());
    }
    
    
}
