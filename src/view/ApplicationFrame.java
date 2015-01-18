package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame{
    private ExchangeDialog exchangeDialog;
    
    public ApplicationFrame() {
        setTitle("Money Calculator V 1.02.03");
        setSize(500, 500);
        setLocation(250, 200);
        setMinimumSize(new Dimension(300, 250));
        exchangeDialog = new ExchangeDialog();
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
        panel.add(createLabel("DE: "));
        panel.add(addComboBox());
        panel.add(addLastPanel());
        return panel;
    }

    private JButton createOperationButton() {
        JButton button = new JButton("Convertir");
        button.addActionListener((ActionEvent e) -> {
            JDialog dialog = new JDialog();
            JOptionPane.showMessageDialog(dialog, exchangeDialog.readFromTextField());
        });
        return button;
    }

    private JButton createCancelButton() {
        JButton button = new JButton("Cerrar");
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
        panel.add(createLabel("A: "), BorderLayout.SOUTH);
        panel.add(addComboBox(), BorderLayout.NORTH);
        return panel;
    }

    private JComboBox addComboBox() {
        String[] currencies = new String[]{"EUR", "USD", "CSD"};
        JComboBox box = new JComboBox(currencies);
        return box;
    }

    private void showWelcomeMessage() {
        JDialog dialog = new JDialog();
        JOptionPane.showMessageDialog(dialog, "Bienvenido a la calculadora de divisas");
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
    }

    private JPanel addRightPanel() {
        JPanel panel = new JPanel();
        panel.add(addFromPanel(), BorderLayout.NORTH);
        panel.add(addToPanel(), BorderLayout.SOUTH);
        return panel;
    }
    
}
