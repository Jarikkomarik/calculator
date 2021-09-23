import javax.swing.*;
import java.awt.*;

public class calculator {
    JTextArea display;
    String disp="";
    String disp2="";
    double fistrOperand=0;
    double secondOperand=0;
    boolean firstOperandIsTyped=false;
    boolean secondOperandIsTyped=false;
    String operation="";
    String result;
    public static void main(String[] args) {
        new calculator().getGui();
    }
            void getGui(){
                JFrame frame=new JFrame("Calculator");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                JPanel numbers=getNumbers();
                JPanel operators=getOperators();
                JPanel topPanel=getTopPanel();


                frame.add(topPanel, BorderLayout.NORTH);
                frame.add(numbers,BorderLayout.WEST);
                frame.add(operators,BorderLayout.EAST);
                frame.setSize(400,400);
                frame.setVisible(true);

            }

            JPanel getNumbers(){
                JPanel numbers=new JPanel();
                numbers.setLayout(new GridLayout(4,2));


                JButton zero=new JButton("0");
                zero.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="0";
                        disp += "0";
                        display.setText(disp);

                    }else {
                        disp += "0";
                        display.setText(disp);
                    }
                        });


                JButton dot=new JButton(".");
                dot.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+=".";
                        disp += ".";
                        display.setText(disp);

                    }else {
                        disp += ".";
                        display.setText(disp);
                    }
                });

                        JButton equals=new JButton("=");
                            equals.addActionListener(e -> {
                                if(!firstOperandIsTyped){}
                                else{
                                secondOperand=Double.parseDouble(disp2);
                                calculate();
                                secondOperand=0;
                                disp2="";
                                firstOperandIsTyped=false;}
                            });

                JButton one=new JButton("1");
                one.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="1";
                        disp += "1";
                        display.setText(disp);

                    }else {
                        disp += "1";
                        display.setText(disp);
                    }
                });

                JButton two=new JButton("2");
                two.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="2";
                        disp += "2";
                        display.setText(disp);

                    }else {
                        disp += "2";
                        display.setText(disp);
                    }
                });

                JButton three=new JButton("3");
                three.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="3";
                        disp += "3";
                        display.setText(disp);

                    }else {
                        disp += "3";
                        display.setText(disp);
                    }
                });

                JButton four=new JButton("4");
                four.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="4";
                        disp += "4";
                        display.setText(disp);

                    }else {
                        disp += "4";
                        display.setText(disp);
                    }
                });

                JButton five=new JButton("5");
                five.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="5";
                        disp += "5";
                        display.setText(disp);

                    }else {
                        disp += "5";
                        display.setText(disp);
                    }
                });

                JButton six=new JButton("6");
                six.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="6";
                        disp += "6";
                        display.setText(disp);

                    }else {
                        disp += "6";
                        display.setText(disp);
                    }
                });

                JButton seven=new JButton("7");
                seven.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="7";
                        disp += "7";
                        display.setText(disp);

                    }else {
                        disp += "7";
                        display.setText(disp);
                    }
                });

                JButton eight=new JButton("8");
                eight.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="8";
                        disp += "8";
                        display.setText(disp);

                    }else {
                        disp += "8";
                        display.setText(disp);
                    }
                });

                JButton nine=new JButton("9");
                nine.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        disp2+="9";
                        disp += "9";
                        display.setText(disp);

                    }else {
                        disp += "9";
                        display.setText(disp);
                    }
                });


                numbers.add(seven);
                numbers.add(eight);
                numbers.add(nine);
                numbers.add(four);
                numbers.add(five);
                numbers.add(six);
                numbers.add(one);
                numbers.add(two);
                numbers.add(three);
                numbers.add(zero);
                numbers.add(dot);
                numbers.add(equals);
                return numbers;
            }
            JPanel getOperators(){
                JPanel operators=new JPanel();
                operators.setLayout(new GridLayout(4,0));

                JButton plus=new JButton("+");
                plus.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        System.out.println("123");
                        secondOperand=Double.parseDouble(disp2);
                        calculate();
                        disp=result;
                        disp2="";
                    }
                    fistrOperand= Double.parseDouble(disp);
                    disp+="+";
                    display.setText(disp);
                    firstOperandIsTyped=true;
                    operation="+";

                });

                JButton minus=new JButton("-");
                minus.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        secondOperand=Double.parseDouble(disp2);
                        calculate();
                        disp=result;
                        disp2="";
                    }

                        fistrOperand= Double.parseDouble(disp);
                    disp+="-";
                    display.setText(disp);
                    firstOperandIsTyped=true;
                    operation="-";

                });

                JButton multiply=new JButton("*");
                multiply.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        secondOperand=Double.parseDouble(disp2);
                        calculate();
                        disp=result;
                        disp2="";
                    }

                    fistrOperand= Double.parseDouble(disp);
                    disp+="*";
                    display.setText(disp);
                    firstOperandIsTyped=true;
                    operation="*";
                });

                JButton devide=new JButton("/");
                devide.addActionListener(e -> {
                    if(firstOperandIsTyped){
                        secondOperand=Double.parseDouble(disp2);
                        calculate();
                        disp=result;
                        disp2="";
                    }

                    fistrOperand= Double.parseDouble(disp);
                    disp+="/";
                    display.setText(disp);
                    firstOperandIsTyped=true;
                    operation="/";

                });

                operators.add(plus);
                operators.add(minus);
                operators.add(multiply);
                operators.add(devide);

                return operators;
            }
            JPanel getTopPanel(){
                JPanel topPanel=new JPanel();

                JButton AC=new JButton("AC");
                AC.addActionListener(e -> {
                    disp="";
                    display.setText("");
                    fistrOperand=0;
                    secondOperand=0;
                    disp2="";
                    firstOperandIsTyped=false;
                    operation="";
                });
                AC.setPreferredSize(new Dimension(73,73));

                display=new JTextArea("test");
                display.setColumns(7);
                display.setEditable(false);
                display.setFont(new Font("Verdana", Font.TYPE1_FONT, 43));

                topPanel.add(display, BorderLayout.WEST);
                topPanel.add(AC,BorderLayout.EAST);

                return topPanel;
            }

            void calculate(){
                switch (operation){

                    case "+":
                        fistrOperand=((fistrOperand*1000000)+(secondOperand*1000000))/1000000;
                        result=Double.toString(fistrOperand);
                        disp=result;
                        display.setText(disp);
                        break;
                    case "-":
                        fistrOperand=((fistrOperand*1000000)-(secondOperand*1000000))/1000000;
                        result=Double.toString(fistrOperand);
                        disp=result;
                        display.setText(disp);
                        break;
                    case "*":
                        fistrOperand=fistrOperand*secondOperand;
                        result=Double.toString(fistrOperand);
                        disp=result;
                        display.setText(disp);
                        break;
                    case "/":
                        fistrOperand=fistrOperand/secondOperand;
                        result=Double.toString(fistrOperand);
                        disp=result;
                        display.setText(disp);
                        break;
                }



                secondOperand=0;
            }
}
