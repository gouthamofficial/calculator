
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.MouseInputListener;

public class Main implements Action, MouseInputListener{
    JFrame jf;
    JLabel displLabel;
    JLabel versionLabel;
    JLabel creatorLabel;

    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton subButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton plusButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton mulButton;
    JButton zeroButton;
    JButton dotButton;
    JButton resButton;
    JButton divButton;
    JButton squareButton;
    JButton rootButton;
    JButton percentageButton;
    JButton negativeButton;
    JButton backButton;
    JButton acButton;

    String textResult;
    String oldText;
    String SQR = "\u221A";
    String SQ = "\u02b8";  
    
    Double newValue;
    Double oldValue;
    Double result;
    int clickedOperater = 0;

    public Main(){
        jf = new JFrame("Calculator"); 
        jf.setLayout(null);
        jf.setSize(266, 509);
        jf.setBackground(Color.BLUE);
        jf.getContentPane().setBackground(new Color(7, 7, 7));
        jf.setLocation(530, 109);
        
        displLabel = new JLabel();
        displLabel.setBounds(2, 2, 246, 69);
        displLabel.setBackground(new Color(33, 33, 33));
        displLabel.setForeground(new Color(255, 255, 255));
        displLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displLabel.setBorder(BorderFactory.createLineBorder(new Color(56, 56, 56), 1));       
        displLabel.setFont(new Font("Arial", Font.PLAIN, 50));      
        displLabel.setOpaque(true);
        jf.add(displLabel);

        acButton = new JButton("C");
        acButton.setBounds(2, 74, 184, 60);
        acButton.setFont(new Font("Arial", Font.BOLD, 22));
        acButton.setBackground(new Color(56, 56, 56));
        acButton.setForeground(new Color(255, 255, 255));
        acButton.setFocusPainted(false);
        acButton.setBorder(null);
        acButton.addActionListener(this);
        acButton.addMouseListener(this);
        jf.add(acButton);

        backButton = new JButton("<");
        backButton.setBounds(188, 74, 60, 60);
        backButton.setFont(new Font("Arial", Font.BOLD, 22));
        backButton.setBackground(new Color(56, 56, 56));
        backButton.setForeground(new Color(255, 255, 255));
        backButton.setFocusPainted(false);
        backButton.setBorder(null);
        backButton.addActionListener(this);
        backButton.addMouseListener(this);
        jf.add(backButton);

        percentageButton = new JButton("%");
        percentageButton.setBounds(2, 136, 60, 60);
        percentageButton.setFont(new Font("Arial", Font.BOLD, 22));
        percentageButton.setBackground(new Color(56, 56, 56));
        percentageButton.setForeground(new Color(255, 255, 255));
        percentageButton.setFocusPainted(false);
        percentageButton.setBorder(null);
        percentageButton.addActionListener(this);
        percentageButton.addMouseListener(this);
        jf.add(percentageButton);

        squareButton = new JButton("x"+SQ);
        squareButton.setBounds(64, 136, 60, 60);
        squareButton.setFont(new Font("Arial", Font.BOLD, 22));
        squareButton.setBackground(new Color(56, 56, 56));
        squareButton.setForeground(new Color(255, 255, 255));
        squareButton.setFocusPainted(false);
        squareButton.setBorder(null);
        squareButton.addActionListener(this);
        squareButton.addMouseListener(this);
        jf.add(squareButton);

        rootButton = new JButton(SQR);
        rootButton.setBounds(126, 136, 60, 60);
        rootButton.setFont(new Font("Arial", Font.BOLD, 22));
        rootButton.setBackground(new Color(56, 56, 56));
        rootButton.setForeground(new Color(255, 255, 255));
        rootButton.setFocusPainted(false);
        rootButton.setBorder(null);
        rootButton.addActionListener(this);
        rootButton.addMouseListener(this);
        jf.add(rootButton);

        divButton = new JButton("/");
        divButton.setBounds(188, 136, 60, 60);
        divButton.setFont(new Font("Arial", Font.BOLD, 22));
        divButton.setBackground(new Color(56, 56, 56));
        divButton.setForeground(new Color(255, 255, 255));
        divButton.setFocusPainted(false);
        divButton.setBorder(null);
        divButton.addActionListener(this);
        divButton.addMouseListener(this);
        jf.add(divButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(2, 198, 60, 60);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 22));
        sevenButton.setBackground(new Color(33, 33, 33));
        sevenButton.setForeground(new Color(255, 255, 255));
        sevenButton.setFocusPainted(false);
        sevenButton.setBorder(null);
        sevenButton.addActionListener(this);
        sevenButton.addMouseListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(64, 198, 60, 60);
        eightButton.setFont(new Font("Arial", Font.BOLD, 22));
        eightButton.setBackground(new Color(33, 33, 33));
        eightButton.setForeground(new Color(255, 255, 255));
        eightButton.setFocusPainted(false);
        eightButton.setBorder(null);
        eightButton.addActionListener(this);
        eightButton.addMouseListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(126, 198, 60, 60);
        nineButton.setFont(new Font("Arial", Font.BOLD, 22));
        nineButton.setBackground(new Color(33, 33, 33));
        nineButton.setForeground(new Color(255, 255, 255));
        nineButton.setFocusPainted(false);
        nineButton.setBorder(null);
        nineButton.addActionListener(this);
        nineButton.addMouseListener(this);
        jf.add(nineButton);

        mulButton = new JButton("x");
        mulButton.setBounds(188, 198, 60, 60);
        mulButton.setFont(new Font("Arial", Font.BOLD, 22));
        mulButton.setBackground(new Color(56, 56, 56));
        mulButton.setForeground(new Color(255, 255, 255));
        mulButton.setFocusPainted(false);
        mulButton.setBorder(null);
        mulButton.addActionListener(this);
        mulButton.addMouseListener(this);
        jf.add(mulButton);

        fourButton = new JButton("4");
        fourButton.setBounds(2, 260, 60, 60);
        fourButton.setFont(new Font("Arial", Font.BOLD, 22));
        fourButton.setBackground(new Color(33, 33, 33));
        fourButton.setForeground(new Color(255, 255, 255));
        fourButton.setFocusPainted(false);
        fourButton.setBorder(null);
        fourButton.addActionListener(this);
        fourButton.addMouseListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(64, 260, 60, 60);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 22));
        fiveButton.setBackground(new Color(33, 33, 33));
        fiveButton.setForeground(new Color(255, 255, 255));
        fiveButton.setFocusPainted(false);
        fiveButton.setBorder(null);
        fiveButton.addActionListener(this);
        fiveButton.addMouseListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(126, 260, 60, 60);
        sixButton.setFont(new Font("Arial", Font.BOLD, 22));
        sixButton.setBackground(new Color(33, 33, 33));
        sixButton.setForeground(new Color(255, 255, 255));
        sixButton.setFocusPainted(false);
        sixButton.setBorder(null);
        sixButton.addActionListener(this);
        sixButton.addMouseListener(this);
        jf.add(sixButton);

        subButton = new JButton("-");
        subButton.setBounds(188, 260, 60, 60);
        subButton.setFont(new Font("Arial", Font.BOLD, 22));
        subButton.setBackground(new Color(56, 56, 56));
        subButton.setForeground(new Color(255, 255, 255));
        subButton.setFocusPainted(false);
        subButton.setBorder(null);
        subButton.addActionListener(this);
        subButton.addMouseListener(this);
        jf.add(subButton);

        oneButton = new JButton("1");
        oneButton.setBounds(2, 322, 60, 60);
        oneButton.setFont(new Font("Arial", Font.BOLD, 22));
        oneButton.setBackground(new Color(33, 33, 33));
        oneButton.setForeground(new Color(255, 255, 255));
        oneButton.setFocusPainted(false);
        oneButton.setBorder(null);
        oneButton.addActionListener(this);
        oneButton.addMouseListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(64, 322, 60, 60);
        twoButton.setFont(new Font("Arial", Font.BOLD, 22));
        twoButton.setBackground(new Color(33, 33, 33));
        twoButton.setForeground(new Color(255, 255, 255));
        twoButton.setFocusPainted(false);
        twoButton.setBorder(null);
        twoButton.addActionListener(this);
        twoButton.addMouseListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(126, 322, 60, 60);
        threeButton.setFont(new Font("Arial", Font.BOLD, 22));
        threeButton.setBackground(new Color(33, 33, 33));
        threeButton.setForeground(new Color(255, 255, 255));
        threeButton.setFocusPainted(false);
        threeButton.setBorder(null);
        threeButton.addActionListener(this);
        threeButton.addMouseListener(this);
        jf.add(threeButton);

        plusButton = new JButton("+");
        plusButton.setBounds(188, 322, 60, 60);
        plusButton.setFont(new Font("Arial", Font.BOLD, 22));
        plusButton.setBackground(new Color(56, 56, 56));
        plusButton.setForeground(new Color(255, 255, 255));
        plusButton.setFocusPainted(false);
        plusButton.setBorder(null);
        plusButton.addActionListener(this);
        plusButton.addMouseListener(this);
        jf.add(plusButton);

        negativeButton= new JButton("+/-");
        negativeButton.setBounds(2, 384, 60, 60);
        negativeButton.setFont(new Font("Arial", Font.BOLD, 22));
        negativeButton.setBackground(new Color(33, 33, 33));
        negativeButton.setForeground(new Color(255, 255, 255));
        negativeButton.setFocusPainted(false);
        negativeButton.setBorder(null);
        negativeButton.addActionListener(this);
        negativeButton.addMouseListener(this);
        jf.add(negativeButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(64, 384, 60, 60);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 22));
        zeroButton.setForeground(new Color(255, 255, 255));
        zeroButton.setBackground(new Color(33, 33, 33));
        zeroButton.setFocusPainted(false);
        zeroButton.setBorder(null);
        zeroButton.addActionListener(this);
        zeroButton.addMouseListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(126, 384, 60, 60);
        dotButton.setFont(new Font("Arial", Font.BOLD, 22));
        dotButton.setBackground(new Color(33, 33, 33));
        dotButton.setForeground(new Color(255, 255, 255));
        dotButton.setFocusPainted(false);
        dotButton.setBorder(null);
        dotButton.addActionListener(this);
        dotButton.addMouseListener(this);
        jf.add(dotButton);

        resButton = new JButton("=");
        resButton.setBounds(188, 384, 60, 60);
        resButton.setFont(new Font("Arial", Font.BOLD, 22));
        resButton.setBackground(new Color(56, 56, 56));
        resButton.setForeground(new Color(255, 255, 255));
        resButton.setFocusPainted(false);
        resButton.setBorder(null);
        resButton.addActionListener(this);
        resButton.addMouseListener(this);
        jf.add(resButton);

        creatorLabel = new JLabel();
        creatorLabel.setText("By_Goutham C P");
        creatorLabel.setBounds(2, 447, 123, 20);
        creatorLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        creatorLabel.setBackground(new Color(56, 56, 56));
        creatorLabel.setForeground(new Color(255, 255, 255));
        creatorLabel.setOpaque(true);
        jf.add(creatorLabel);

        versionLabel = new JLabel();
        versionLabel.setText("Version 01.01.1.0");
        versionLabel.setBounds(125, 447, 123, 20);
        versionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        versionLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        versionLabel.setBackground(new Color(56, 56, 56));
        versionLabel.setForeground(new Color(255, 255, 255));
        versionLabel.setOpaque(true);
        jf.add(versionLabel);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == acButton) {
            displLabel.setText("");
        }else if (e.getSource() == sevenButton) {
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "7");
            }
        }else if(e.getSource() == eightButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "8");
            }
        }else if(e.getSource() == nineButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "9");
            }
        }else if(e.getSource() == fourButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "4");
            }
        }else if(e.getSource() == fiveButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "5");
            }
        }else if(e.getSource() == sixButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "6");
            }
        }else if(e.getSource() == oneButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "1");
            }
        }else if(e.getSource() == twoButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "2");
            }
        }else if(e.getSource() == threeButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "3");
            }
        }else if(e.getSource() == zeroButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            int textLength = text.length();
            if (textLength < 9) {
                displLabel.setText(labelText + "0");
            }
        }else if(e.getSource() == subButton){
            clickedOperater = 1;
            oldValue = Double.parseDouble(displLabel.getText());
            displLabel.setText("");
        }else if(e.getSource() == plusButton){
            clickedOperater = 2;
            oldValue = Double.parseDouble(displLabel.getText());
            displLabel.setText("");
        }else if(e.getSource() == mulButton){
            clickedOperater = 3;
            oldValue = Double.parseDouble(displLabel.getText());
            displLabel.setText("");
        }else if(e.getSource() == divButton){
            clickedOperater = 4;
            oldValue = Double.parseDouble(displLabel.getText());
            displLabel.setText("");
        }else if(e.getSource() == percentageButton){
            clickedOperater = 5;
            oldValue = Double.parseDouble(displLabel.getText());
            oldText = displLabel.getText();
            displLabel.setText("");
        }else if(e.getSource() == squareButton){
            clickedOperater = 6;
            oldValue = Double.parseDouble(displLabel.getText());
            displLabel.setText("");
        }else if(e.getSource() == rootButton){
            oldValue = Double.parseDouble(displLabel.getText());
            result = (Double) Math.sqrt(oldValue);
            textResult = String.valueOf(result);
            displLabel.setText(textResult);
        }else if(e.getSource() == backButton){
            String text = displLabel.getText();
            String end = "";
            end = text.substring(0, (text.length()-1));
            displLabel.setText(end);
        }else if(e.getSource() == resButton){
            if (clickedOperater == 1){
                newValue = Double.parseDouble(displLabel.getText());
                result = oldValue - newValue;
                textResult = String.valueOf(result);
                displLabel.setText(textResult);
                clickedOperater = 0;
            }else if(clickedOperater == 2){
                newValue = Double.parseDouble(displLabel.getText());
                result = oldValue + newValue;
                textResult = String.valueOf(result);
                displLabel.setText(textResult);
                clickedOperater = 0;
            }else if(clickedOperater == 3){
                newValue = Double.parseDouble(displLabel.getText());
                result = oldValue * newValue;
                textResult = String.valueOf(result);
                displLabel.setText(textResult);
                clickedOperater = 0;
            }else if(clickedOperater == 4){
                newValue = Double.parseDouble(displLabel.getText());
                result = oldValue / newValue;
                textResult = String.valueOf(result);
                displLabel.setText(textResult);
                clickedOperater = 0;
            }else if(clickedOperater == 5){
                newValue = Double.parseDouble(displLabel.getText());
                result = (oldValue * newValue) / 100;
                textResult = String.valueOf(result);
                displLabel.setText(textResult);
                clickedOperater = 0;
            }else if(clickedOperater == 6){
                newValue = Double.parseDouble(displLabel.getText());
                result = Math.pow(oldValue, newValue);
                textResult = String.valueOf(result);
                displLabel.setText(textResult);
                clickedOperater = 0;
            }else if(clickedOperater == 7){
                
                clickedOperater = 0;
            }
        }else if(e.getSource() == dotButton){
            String labelText = displLabel.getText();
            String text = displLabel.getText();
            boolean dot = false;
            if (text.contains(".")) {
                dot = true;
            }
            if (dot == false) {
                displLabel.setText(labelText+".");
            }    
        }else if(e.getSource() == negativeButton){
            String labelText = displLabel.getText();
            Double number = Double.parseDouble(labelText);
            if (number > 0) {
                Double reverse = number * -1;
                String txtrev = String.valueOf(reverse);
                displLabel.setText(txtrev);
            } else {
                Double reverse = number * -1;
                String txtrev = String.valueOf(reverse);
                displLabel.setText(txtrev);
            }
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        if(e.getSource() == sevenButton){
            sevenButton.setBackground(new Color(56, 56, 56));
            sevenButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == eightButton){
            eightButton.setBackground(new Color(56, 56, 56));
            eightButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == nineButton){
            nineButton.setBackground(new Color(56, 56, 56));
            nineButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == fourButton){
            fourButton.setBackground(new Color(56, 56, 56));
            fourButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == fiveButton){
            fiveButton.setBackground(new Color(56, 56, 56));
            fiveButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == sixButton){
            sixButton.setBackground(new Color(56, 56, 56));
            sixButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == oneButton){
            oneButton.setBackground(new Color(56, 56, 56));
            oneButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == twoButton){
            twoButton.setBackground(new Color(56, 56, 56));
            twoButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == threeButton){
            threeButton.setBackground(new Color(56, 56, 56));
            threeButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == negativeButton){
            negativeButton.setBackground(new Color(56, 56, 56));
            negativeButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == zeroButton){
            zeroButton.setBackground(new Color(56, 56, 56));
            zeroButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == dotButton){
            dotButton.setBackground(new Color(56, 56, 56));
            dotButton.setForeground(new Color(255, 255, 255));
        }
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        if(e.getSource() == sevenButton){
            sevenButton.setBackground(new Color(33, 33, 33));
            sevenButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == eightButton){
            eightButton.setBackground(new Color(33, 33, 33));
            eightButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == nineButton){
            nineButton.setBackground(new Color(33, 33, 33));
            nineButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == fourButton){
            fourButton.setBackground(new Color(33, 33, 33));
            fourButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == fiveButton){
            fiveButton.setBackground(new Color(33, 33, 33));
            fiveButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == sixButton){
            sixButton.setBackground(new Color(33, 33, 33));
            sixButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == oneButton){
            oneButton.setBackground(new Color(33, 33, 33));
            oneButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == twoButton){
            twoButton.setBackground(new Color(33, 33, 33));
            twoButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == threeButton){
            threeButton.setBackground(new Color(33, 33, 33));
            threeButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == negativeButton){
            negativeButton.setBackground(new Color(33, 33, 33));
            negativeButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == zeroButton){
            zeroButton.setBackground(new Color(33, 33, 33));
            zeroButton.setForeground(new Color(255, 255, 255));
        }else if(e.getSource() == dotButton){
            dotButton.setBackground(new Color(33, 33, 33));
            dotButton.setForeground(new Color(255, 255, 255));
        }
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        if (e.getSource() == acButton) {
            acButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == resButton){
            resButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == backButton){
            backButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == percentageButton){
            percentageButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == squareButton){
            squareButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == rootButton){
            rootButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == divButton){
            divButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == sevenButton){
            sevenButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == eightButton){
            eightButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == nineButton){
            nineButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == mulButton){
            mulButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == fourButton){
            fourButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == fiveButton){
            fiveButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == sixButton){
            sixButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == subButton){
            subButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == oneButton){
            oneButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == twoButton){
            twoButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == threeButton){
            threeButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == plusButton){
            plusButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == negativeButton){
            negativeButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == zeroButton){
            zeroButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }else if(e.getSource() == dotButton){
            dotButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1));
        }
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        if (e.getSource() == acButton) {
            acButton.setBorder(null);
        }else if(e.getSource() == resButton){
            resButton.setBorder(null);
        }else if(e.getSource() == backButton){
            backButton.setBorder(null);
        }else if(e.getSource() == percentageButton){
            percentageButton.setBorder(null);
        }else if(e.getSource() == squareButton){
            squareButton.setBorder(null);
        }else if(e.getSource() == rootButton){
            rootButton.setBorder(null);
        }else if(e.getSource() == divButton){
            divButton.setBorder(null);
        }else if(e.getSource() == sevenButton){
            sevenButton.setBorder(null);
        }else if(e.getSource() == eightButton){
            eightButton.setBorder(null);
        }else if(e.getSource() == nineButton){
            nineButton.setBorder(null);
        }else if(e.getSource() == mulButton){
            mulButton.setBorder(null);
        }else if(e.getSource() == fourButton){
            fourButton.setBorder(null);
        }else if(e.getSource() == fiveButton){
            fiveButton.setBorder(null);
        }else if(e.getSource() == sixButton){
            sixButton.setBorder(null);
        }else if(e.getSource() == subButton){
            subButton.setBorder(null);
        }else if(e.getSource() == oneButton){
            oneButton.setBorder(null);
        }else if(e.getSource() == twoButton){
            twoButton.setBorder(null);
        }else if(e.getSource() == threeButton){
            threeButton.setBorder(null);
        }else if(e.getSource() == plusButton){
            plusButton.setBorder(null);
        }else if(e.getSource() == negativeButton){
            negativeButton.setBorder(null);
        }else if(e.getSource() == zeroButton){
            zeroButton.setBorder(null);
        }else if(e.getSource() == dotButton){
            dotButton.setBorder(null);
        }       
    }

    //#############################################################//
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {  
    }
    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
    }
    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
    }
    @Override
    public Object getValue(String key) {      
        return null;
    }
    @Override
    public void putValue(String key, Object value) {              
    }
    @Override
    public void setEnabled(boolean b) {             
    }
    @Override
    public boolean isEnabled() {       
        return false;
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {             
    }
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {   
    }
    //#############################################################//
}
