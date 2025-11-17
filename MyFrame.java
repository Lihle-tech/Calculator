
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
    JPanel numberPanel, operationsPanel, optionPanel, showcalculationsPanel, zeroPanel, deletePanel;
    JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, add, sub, div, mult, equal, delete, percent, sign, decimal, option;
    JTextField showcalculations;
    String operation;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    Double value1, value2, result;
    
    MyFrame() {
        
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        num0 = new JButton("0");
        
        add = new JButton("+");        
        sub = new JButton("-");        
        equal = new JButton("=");        
        div = new JButton("÷");        
        mult = new JButton("×");       
        option = new JButton();        
        decimal = new JButton(",");        
        delete = new JButton("AC");        
        sign = new JButton("+/-");        
        percent = new JButton("%");
        
        showcalculations = new JTextField();
        showcalculations.setFont(new Font("Ariel", Font.PLAIN, 30));
        showcalculations.setEditable(false);
        
        numberButtons[0] = num1;
        numberButtons[1] = num2;
        numberButtons[2] = num3;
        numberButtons[3] = num4;
        numberButtons[4] = num5;
        numberButtons[5] = num6;
        numberButtons[6] = num7;
        numberButtons[7] = num8;
        numberButtons[8] = num9;
        numberButtons[9] = num0;
        
        for(int i = 0; i < 10; i++) {
            numberButtons[i].setFocusable(false);
            numberButtons[i].addActionListener(this);
        }
        
        functionButtons[0] = add;
        functionButtons[1] = div;
        functionButtons[2] = sub;
        functionButtons[3] = mult;
        functionButtons[4] = equal;
        functionButtons[5] = percent;
        functionButtons[6] = sign;
        functionButtons[7] = delete;
        functionButtons[8] = decimal;
        
        for(int j = 0; j < 9; j++) {
            functionButtons[j].setFocusable(false);
            functionButtons[j].addActionListener(this);
        }
        
        numberPanel = new JPanel();
        numberPanel.setBounds(0, 330, 320, 200);
        numberPanel.setLayout(new GridLayout(3,3, 5, 5));
        
        numberPanel.add(num1);
        numberPanel.add(num2);
        numberPanel.add(num3);
        numberPanel.add(num4);
        numberPanel.add(num5);
        numberPanel.add(num6);
        numberPanel.add(num7);
        numberPanel.add(num8);
        numberPanel.add(num9);
        
        operationsPanel = new JPanel();
        operationsPanel.setBounds(330, 260, 100, 340);
        operationsPanel.setLayout(new GridLayout(5,1, 5, 5));
        
        operationsPanel.add(div);
        operationsPanel.add(mult);
        operationsPanel.add(sub);
        operationsPanel.add(add);
        operationsPanel.add(equal);
        
    /*    optionPanel = new JPanel();
        optionPanel.setBackground(Color.green); calculations or currency
        optionPanel.setBounds(0, 0, 430, 50); */
        
        showcalculationsPanel = new JPanel();
        showcalculationsPanel.setBackground(Color.orange);
        showcalculationsPanel.setBounds(0, 200, 430, 60);
        showcalculationsPanel.setLayout(new GridLayout());
        
        showcalculationsPanel.add(showcalculations);
        
        zeroPanel = new JPanel();
        zeroPanel.setBounds(0, 540, 320, 60);
        zeroPanel.setLayout(new GridLayout(1,1, 5, 5));
        
        zeroPanel.add(option);
        zeroPanel.add(num0);
        zeroPanel.add(decimal);
        
        deletePanel = new JPanel();
        deletePanel.setBounds(0, 260, 320, 60);
        deletePanel.setLayout(new GridLayout(1, 1, 5, 5));
        
        deletePanel.add(delete);
        deletePanel.add(sign);
        deletePanel.add(percent);
    
        this.setVisible(true);
        this.setSize(450, 650);
        this.setTitle("Calculator");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(numberPanel);
        this.add(operationsPanel);
       // this.add(optionPanel);
        this.add(showcalculationsPanel);
        this.add(zeroPanel);
        this.add(deletePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == num0) {
            showcalculations.setText(showcalculations.getText() + "0");
        }
        if(e.getSource() == num1) {
            showcalculations.setText(showcalculations.getText() + "1");
        }
        if(e.getSource() == num2) {
            showcalculations.setText(showcalculations.getText() + "2");
        }
        if(e.getSource() == num3) {
            showcalculations.setText(showcalculations.getText() + "3");
        }
        if(e.getSource() == num4) {
            showcalculations.setText(showcalculations.getText() + "4");
        }
        if(e.getSource() == num5) {
            showcalculations.setText(showcalculations.getText() + "5");
        }
        if(e.getSource() == num6) {
            showcalculations.setText(showcalculations.getText() + "6");
        }
        if(e.getSource() == num7) {
            showcalculations.setText(showcalculations.getText() + "7");
        }
        if(e.getSource() == num8) {
            showcalculations.setText(showcalculations.getText() + "8");
        }
        if(e.getSource() == num9) {
            showcalculations.setText(showcalculations.getText() + "9");
        }
        if(e.getSource() == add) {
            value1 = Double.parseDouble(showcalculations.getText());
            operation = "+";
            showcalculations.setText("");
          //  showcalculations.setText(showcalculations.getText() + "+");
        }
        if(e.getSource() == sub) {
            value1 = Double.parseDouble(showcalculations.getText());
            operation = "-";
            showcalculations.setText("");
       //     showcalculations.setText(showcalculations.getText() + "-");
        }
        if(e.getSource() == div) {
            value1 = Double.parseDouble(showcalculations.getText());
            operation = "÷";
            showcalculations.setText("");
         //   showcalculations.setText(showcalculations.getText() + "÷");
        }
        if(e.getSource() == mult) {
            value1 = Double.parseDouble(showcalculations.getText());
            operation = "×";
            showcalculations.setText("");
        //    showcalculations.setText(showcalculations.getText() + "×");
        }
        if(e.getSource() == percent) {
            value1 = Double.parseDouble(showcalculations.getText());
            operation = "%";
            showcalculations.setText("");
        //    showcalculations.setText(showcalculations.getText() + "%");
        }
        if(e.getSource() == decimal) {
            showcalculations.setText(showcalculations.getText() + ".");
        }
        if(e.getSource() == sign) {
          //  value1 = Integer.parseInt(showcalculations.getText());
          //  operation = "+";
          //  showcalculations.setText(showcalculations.getText() + ",");
        }
        if(e.getSource() == equal) {
            value2 = Double.parseDouble(showcalculations.getText());
            
            switch  (operation) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "%":
                    result = value1 / 100;
                    break;
                case "×":
                    result = value1 * value2;
                    break;
                case "÷":
                    result = value1 / value2;
                    break;
            }
            showcalculations.setText(String.valueOf(result));
            value1 = result;
        }
        if(e.getSource() == delete) {
            showcalculations.setText(" ");
        }
    }
}