package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExchangeDialog {
    private final JPanel panel;
    private final JTextField text;
    private double exchange;
    
    public ExchangeDialog() {
        panel = new JPanel();
        text = new JTextField(10);
        panel.add(text);
    } 

    public JPanel getPanel() {
        return panel;
    }
    
    
    public String readFromTextField(){
        try {
            exchange = Double.parseDouble(text.getText());
            if (isPositiveAmount(exchange))
                return ("You typed: "+text.getText());
            else
                return ("You must introduce a positive number");
        } catch (Exception e) {
            return ("You must introduce a valid number e.g. 10.05");
        }
    }

    private boolean isPositiveAmount(double exchange) {
        if(exchange<0)
            return false;
        else
            return true;
    }
    
}
