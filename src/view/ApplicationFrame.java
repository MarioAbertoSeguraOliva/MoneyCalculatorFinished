package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame{
    private final ExchangeDialog exchangeDialog;
    private final CurrencySet currencySet;
    
    public ApplicationFrame(CurrencySet currencySet) {
        setTitle("Money Calculator V 1.02.03");
        setSize(500, 500);
        setLocation(250, 200);
        setMinimumSize(new Dimension(300, 250));
        exchangeDialog = new ExchangeDialog();
        this.currencySet = currencySet;
        createComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        showWelcomeMessage();
    }

    private void createComponents() {
        add(addNorthPane(), BorderLayout.NORTH);
        add(addSouthPane(), BorderLayout.SOUTH);
    }

    private JPanel addNorthPane() {
        JPanel panel = new JPanel();
        panel.add(exchangeDialog.getPanel(), BorderLayout.WEST);
        panel.add(addRightPanel(), BorderLayout.EAST);
        return panel;
    }

    private JPanel addSouthPane() {
        JPanel panel = new JPanel();
        panel.add(createOperationButton());
        panel.add(createCancelButton());
        return panel;
    }

    private JPanel addFromPanel() {
        JPanel panel = new JPanel();
        panel.add(createLabel("FROM: "));
        panel.add(addComboBox());
        panel.add(addLastPanel());
        return panel;
    }

    private JButton createOperationButton() {
        JButton button = new JButton("Convert");
        button.addActionListener((ActionEvent e) -> {
            JDialog dialog = new JDialog();
            JOptionPane.showMessageDialog(dialog, exchangeDialog.readFromTextField());
        });
        return button;
    }

    private JButton createCancelButton() {
        JButton button = new JButton("Close");
        button.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        return button;
    }

    private JPanel addLastPanel() {
        JPanel panel = new JPanel();
        return panel;
    }

    private JLabel createLabel(String string) {
        JLabel label = new JLabel(string);
        return label;
    }

    private JPanel addToPanel() {
        JPanel panel = new JPanel();
        panel.add(createLabel("TO: "), BorderLayout.SOUTH);
        panel.add(addComboBox(), BorderLayout.NORTH);
        return panel;
    }

    private JComboBox addComboBox() {
        String[] currenciesToComboBox = fillComboBox(initializeComboBox(currencySet));
        JComboBox box = new JComboBox(currenciesToComboBox);
        return box;
    }

    private void showWelcomeMessage() {
        JDialog dialog = new JDialog();
        JOptionPane.showMessageDialog(dialog, "Welcome to MoneyCalculator, What do you want to convert?");
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
    }

    private JPanel addRightPanel() {
        JPanel panel = new JPanel();
        panel.add(addFromPanel(), BorderLayout.NORTH);
        panel.add(addToPanel(), BorderLayout.SOUTH);
        return panel;
    }

    private ArrayList<String> initializeComboBox(CurrencySet currencySet) {
        ArrayList<String> currenciesCode =  new ArrayList<> (currencySet.getCurrencySet().keySet());
        return currenciesCode;
    }

    private String[] fillComboBox(ArrayList<String> currencies) {
        String[] currenciesToComboBox = new String[currencies.size()];
        int counter = 0;
        for (String currency : currencies) {
            currenciesToComboBox[counter] = currency;
            counter++;
        }
        return currenciesToComboBox;
    }
    
}
