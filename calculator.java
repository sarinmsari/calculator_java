import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator implements ActionListener {
    JFrame jf;
    JLabel displaylabel;
    JButton sevenbtn, eightbtn, ninebtn, onebtn, twobtn, threebtn, fourbtn, fivebtn, sixbtn, addbtn, subbtn, mulbtn,
            divbtn, dotbtn, zerobtn, equalbtn, clearbtn;

    public calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(370, 500);
        jf.setLocation(300, 100);

        displaylabel = new JLabel();
        displaylabel.setBounds(30, 10, 290, 60);
        displaylabel.setBackground(Color.GRAY);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setOpaque(true);
        displaylabel.setForeground(Color.white);
        jf.add(displaylabel);

        JLabel brandlabel= new JLabel("DOOPS.tech");
        brandlabel.setBounds(30,80,100,20);
        jf.add(brandlabel);

        sevenbtn = new JButton("7");
        sevenbtn.setBounds(30, 130, 50, 50);
        sevenbtn.addActionListener(this);
        jf.add(sevenbtn);

        eightbtn = new JButton("8");
        eightbtn.setBounds(110, 130, 50, 50);
        eightbtn.addActionListener(this);
        jf.add(eightbtn);

        ninebtn = new JButton("9");
        ninebtn.setBounds(190, 130, 50, 50);
        ninebtn.addActionListener(this);
        jf.add(ninebtn);

        mulbtn = new JButton("x");
        mulbtn.setBounds(270, 130, 50, 50);
        mulbtn.addActionListener(this);
        jf.add(mulbtn);

        fourbtn = new JButton("4");
        fourbtn.setBounds(30, 190, 50, 50);
        fourbtn.addActionListener(this);
        jf.add(fourbtn);

        fivebtn = new JButton("5");
        fivebtn.setBounds(110, 190, 50, 50);
        fivebtn.addActionListener(this);
        jf.add(fivebtn);

        sixbtn = new JButton("6");
        sixbtn.setBounds(190, 190, 50, 50);
        sixbtn.addActionListener(this);
        jf.add(sixbtn);

        subbtn = new JButton("-");
        subbtn.setBounds(270, 190, 50, 50);
        subbtn.addActionListener(this);
        jf.add(subbtn);

        onebtn = new JButton("1");
        onebtn.setBounds(30, 250, 50, 50);
        onebtn.addActionListener(this);
        jf.add(onebtn);

        twobtn = new JButton("2");
        twobtn.setBounds(110, 250, 50, 50);
        twobtn.addActionListener(this);
        jf.add(twobtn);

        threebtn = new JButton("3");
        threebtn.setBounds(190, 250, 50, 50);
        threebtn.addActionListener(this);
        jf.add(threebtn);

        addbtn = new JButton("+");
        addbtn.setBounds(270, 250, 50, 50);
        addbtn.addActionListener(this);
        jf.add(addbtn);

        dotbtn = new JButton(".");
        dotbtn.setBounds(30, 310, 50, 50);
        dotbtn.addActionListener(this);
        jf.add(dotbtn);

        zerobtn = new JButton("0");
        zerobtn.setBounds(110, 310, 50, 50);
        zerobtn.addActionListener(this);
        jf.add(zerobtn);

        equalbtn = new JButton("=");
        equalbtn.setBounds(190, 310, 50, 50);
        equalbtn.addActionListener(this);
        jf.add(equalbtn);

        divbtn = new JButton("/");
        divbtn.setBounds(270, 310, 50, 50);
        divbtn.addActionListener(this);
        jf.add(divbtn);

        clearbtn = new JButton("clear");
        clearbtn.setBounds(190, 370, 130, 50);
        clearbtn.addActionListener(this);
        jf.add(clearbtn);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new calculator();
    }

    boolean isOperatorClicked = false;
    String[] operator = new String[10];
    float[] oldvalue = new float[10];
    int arraysize;
    int j=-1;

    public void actionPerformed(ActionEvent e) {
        
            if (e.getSource() == sevenbtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("7");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "7");
                }
            } else if (e.getSource() == eightbtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("8");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "8");
                }
            } else if (e.getSource() == ninebtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("9");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "9");
                }
            } else if (e.getSource() == onebtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("1");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "1");
                }
            } else if (e.getSource() == twobtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("2");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "2");
                }
            } else if (e.getSource() == threebtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("3");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "3");
                }
            } else if (e.getSource() == fourbtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("4");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "4");
                }
            } else if (e.getSource() == fivebtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("5");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "5");
                }
            } else if (e.getSource() == sixbtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("6");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "6");
                }
            } else if (e.getSource() == zerobtn) {
                if (isOperatorClicked) {
                    displaylabel.setText("0");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + "0");
                }
            } else if (e.getSource() == dotbtn) {
                if (isOperatorClicked) {
                    displaylabel.setText(".");
                    isOperatorClicked = false;
                } else {
                    displaylabel.setText(displaylabel.getText() + ".");
                }
            }

            else if (e.getSource() == addbtn) {
                oldvalue[++j] = Float.parseFloat(displaylabel.getText());
                operator[j] = "+";
                isOperatorClicked = true;
                displaylabel.setText(displaylabel.getText() + "+");
            } else if (e.getSource() == subbtn) {
                isOperatorClicked = true;
                oldvalue[++j] = Float.parseFloat(displaylabel.getText());
                operator[j] = "-";
                displaylabel.setText(displaylabel.getText() + "-");
            } else if (e.getSource() == mulbtn) {
                isOperatorClicked = true;
                oldvalue[++j] = Float.parseFloat(displaylabel.getText());
                operator[j] = "*";
                displaylabel.setText(displaylabel.getText() + "x");
            } else if (e.getSource() == divbtn) {
                isOperatorClicked = true;
                oldvalue[++j] = Float.parseFloat(displaylabel.getText());
                operator[j] = "/";
                displaylabel.setText(displaylabel.getText() + "/");
            } else if (e.getSource() == equalbtn) {
                isOperatorClicked = true;
                oldvalue[++j] = Float.parseFloat(displaylabel.getText());
                operator[j] = "=";
                arraysize = j;
                findresult();
            } else if (e.getSource() == clearbtn) {
                displaylabel.setText("");
                j=-1;
            }
            
        
    }

    void findresult() {
        float result = oldvalue[0];
        int i = 0;
        for (i = 0; i <= arraysize; i++) {
            if (operator[i] == "+") {
                result += oldvalue[i+1];
            } else if (operator[i] == "-") {
                result -=oldvalue[i+1];
            } else if (operator[i] == "*") {
                result *= oldvalue[i+1];
            } else if (operator[i] == "/") {
                result /=oldvalue[i+1];
            } else if (operator[i] == "=") {
                displaylabel.setText(result + "");
            }
        }
    }
}