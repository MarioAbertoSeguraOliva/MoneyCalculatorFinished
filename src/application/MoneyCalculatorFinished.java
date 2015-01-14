package application;

import view.CurrencySetLoader;
import view.MoneyViewer;

public class MoneyCalculatorFinished {

    public static void main(String[] args) {
        CurrencySetLoader loader = new CurrencySetLoader();
        loader.load();
        new MoneyViewer();
    }
    
}
