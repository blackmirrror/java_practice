package prac04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Matches extends JFrame {

    public static final String ACTION_COMMAND_MILAN = "AC Milan";
    public static final String ACTION_COMMAND_MADRID = "Real Madrid";
    private JButton btnMilan, btnMadrid;
    private JLabel txtResult, txtLastScorer;
    private Label txtWinner;

    private int countMilan, countMadrid;

    public Matches() {
        super("Matches result");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        setSize(300, 200);
        initFields();
        setFields();
        setVisible(true);
    }

    public void initFields() {
        btnMilan = new JButton("AC Milan");
        btnMadrid = new JButton("Real Madrid");
        txtResult = new JLabel("Result: 0 X 0");
        txtLastScorer = new JLabel("Last Scorer: press button");
        txtWinner = new Label("Winner: press button");

        countMadrid = 0;
        countMilan = 0;
    }

    private void setFields() {
        add(txtResult);
        add(txtLastScorer);
        add(txtWinner);
        add(btnMilan);
        add(btnMadrid);

        Font fnt = new Font("Roboto",Font.BOLD,20);
        txtLastScorer.setFont(fnt);
        txtResult.setFont(fnt);
        txtWinner.setFont(fnt);

        btnMadrid.setFont(fnt);
        btnMilan.setFont(fnt);
        btnMilan.setActionCommand(ACTION_COMMAND_MILAN);
        btnMadrid.setActionCommand(ACTION_COMMAND_MADRID);
        btnMilan.addActionListener(new TestAction());
        btnMadrid.addActionListener(new TestAction());
    }

    public class TestAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case ACTION_COMMAND_MILAN:
                    countMilan += 1;
                    break;
                case ACTION_COMMAND_MADRID:
                    countMadrid += 1;
                    break;
            }
            if (countMilan < countMadrid)
                txtWinner.setText("Winner: Real Madrid");
            else if (countMadrid == countMilan)
                txtWinner.setText("Winner: Equals");
            else
                txtWinner.setText("Winner: AC Milan");
            txtLastScorer.setText("Last Scorer: " + e.getActionCommand());
            txtResult.setText("Result: "+countMilan+" X "+countMadrid);

        }
    }
}
