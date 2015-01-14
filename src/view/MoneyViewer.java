package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyViewer extends JFrame{

    public MoneyViewer() {
        setTitle("Money Calculator V 1.02.03");
        setSize(500, 500);
        setLocation(250, 200);
        setMinimumSize(new Dimension(300, 250));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents();
        setVisible(true);
    }

    private void createComponents() {
        add(addNorthPane(), BorderLayout.NORTH);
        add(addSouthPane(), BorderLayout.SOUTH);
    }

    private JPanel addNorthPane() {
        JPanel panel = new JPanel();
        panel.add(addTextField(), BorderLayout.WEST);
        panel.add(addLabelPanel(), BorderLayout.CENTER);
        panel.add(addBoxPanel(), BorderLayout.EAST);
        return panel;
    }

    private JPanel addSouthPane() {
        JPanel panel = new JPanel();
        panel.add(createOperationButton());
        panel.add(createCancelButton());
        return panel;
    }

    private JTextField addTextField() {
        JTextField text = new JTextField(10);
        return text;
    }

    private JPanel addLabelPanel() {
        JPanel panel = new JPanel();
        panel.add(createLabel("DE: "), BorderLayout.NORTH);
        panel.add(createLabel("A: "), BorderLayout.SOUTH);
        panel.add(addLastPanel());
        return panel;
    }

    private JButton createOperationButton() {
        JButton button = new JButton("Convertir");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog();
                JOptionPane.showMessageDialog(dialog,"You pressed: Convertir Button");
            }
        });
        return button;
    }

    private JButton createCancelButton() {
        JButton button = new JButton("Cerrar");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
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

    private JPanel addBoxPanel() {
        JPanel panel = new JPanel();
        panel.add(addComboBox(), BorderLayout.NORTH);
        panel.add(addComboBox(), BorderLayout.SOUTH);
        return panel;
    }

    private JComboBox addComboBox() {
        String[] currencies = new String[]{"EUR", "USD"};
        JComboBox box = new JComboBox(currencies);
        return box;
    }
    
}
