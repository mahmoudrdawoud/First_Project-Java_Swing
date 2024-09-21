//Mahmoud
package project_java_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static project_java_swing.User.font1;
import static project_java_swing.User.frame;
import static project_java_swing.User.label_result;

public class GPA {

/******************************************************************************/
    
    static JFrame frame1 = new JFrame("Start");
    static JFrame frame3 = new JFrame("GPA");

    public static JButton Start = new JButton("Start");
    public static Font font2 = new Font("Arial", Font.BOLD, 22);
    static JLabel label_result2 = new JLabel();
    static double GPA = 0.0;

    public static JButton Calculator_GPA = new JButton("Calculator GPA");
    
/******************************************************************************/
 
    public void name(String name) {

    /**************************************************************************/   
        frame1.setSize(400, 400);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);

        JLabel lb3 = new JLabel("Welcome " + name);
        JLabel lb4 = new JLabel("Calculate GPA");

        JLabel j = new JLabel();
        j.setText("Screen");

        j.setIcon(new ImageIcon("windows.jpg"));
        frame1.add(lb3);
        frame1.add(lb4);
        frame1.add(j);
        frame1.add(Start);

        frame1.add(label_result2);

        Color color = new Color(255, 239, 213);
        frame1.getContentPane().setBackground(color);

        lb3.setForeground(Color.YELLOW);
        lb4.setForeground(Color.YELLOW);
        Start.setForeground(Color.RED);

        lb3.setFont(font2);
        lb4.setFont(font2);
        Start.setFont(font1);
        frame.setVisible(false);
        frame1.setVisible(true);

        lb3.setBounds(105, 60, 300, 30);
        lb4.setBounds(125, 130, 200, 20);
        Start.setBounds(135, 200, 120, 25);
        j.setBounds(0, -200, 1077, 747);
   
        /**********************************************************************/    
        Start.addActionListener(new ActionListener() {//BUTTON Start

            @Override
            public void actionPerformed(ActionEvent st) {

                try {
                    double sum = 0.0;
                    double multiplication = 0.0;
                    int totalhour = 0;

                    frame1.setVisible(false);
                    
                    String Jop = "";
                    if (st.getActionCommand() == "Start") {

                        String nm = JOptionPane.showInputDialog("Enter the # of subjects");
                        int tt = Integer.parseInt(nm);

                        for (int i = 0; i < tt; i++) {

                            JPanel panel = new JPanel(new GridLayout(5, 3));
                            JTextField hour = new JTextField(10);
                            JTextField mark = new JTextField(10);

                            Object[] message = {
                                "Enter # of hours & the mark for subject (number)",
                                "Input hour :", hour,
                                "Input mark :", mark
                            };

                            int option = JOptionPane.showConfirmDialog(null, message, "Input", JOptionPane.OK_CANCEL_OPTION);

                            for (int k = 0; k < tt; k++) {

                                totalhour = totalhour + Integer.parseInt(hour.getText());
                                multiplication = multiplication + Integer.parseInt(hour.getText()) * Integer.parseInt(mark.getText());
                            }
                        }

                        GPA = multiplication / totalhour;
                        System.out.println("GPA = " + GPA);
                    }
                    
                /**************************************************************/
                
                    frame3.setSize(400, 400);
                    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame3.setResizable(false);

                    JLabel lb3 = new JLabel("Welcome " + name);
                     JLabel lb4 = new JLabel("Calculate GPA");

                    JLabel h = new JLabel();
                    h.setText("Screen");

                    h.setIcon(new ImageIcon("windows.jpg"));
                    frame3.add(lb3);
                    frame3.add(lb4);
                    frame3.add(h);
                    frame3.add(Calculator_GPA);

                    frame3.add(label_result2);

                    Color color = new Color(255, 239, 213);
                    frame3.getContentPane().setBackground(color);

                    lb3.setForeground(Color.YELLOW);
                    lb4.setForeground(Color.YELLOW);
                    Calculator_GPA.setForeground(Color.RED);

                    lb3.setFont(font2);
                    lb4.setFont(font2);
                    Calculator_GPA.setFont(font1);

                    frame3.setVisible(true);

                    lb3.setBounds(105, 60, 300, 30);
                    lb4.setBounds(125, 120, 200, 20);
                    Calculator_GPA.setBounds(105, 270, 180, 30);
                    h.setBounds(0, -200, 1077, 747);
                    
                    
                /**************************************************************/    
                    Calculator_GPA.addActionListener(new ActionListener() {//BUTTON Calculator_GPA

                        @Override
                        public void actionPerformed(ActionEvent e) {

                            try {

                                if (e.getActionCommand() == "Calculator GPA") {

                                    JLabel lb5 = new JLabel("GPA = " + GPA);
                                    JLabel lb6 = null;
                                    if (GPA > 90) {
                                        lb6 = new JLabel("Excellent");

                                    } else if (GPA > 80 && GPA < 90) {
                                        lb6 = new JLabel("Very Good");

                                    } else if (GPA > 70 && GPA < 80) {
                                        lb6 = new JLabel("Good");

                                    } else if (GPA > 50 && GPA < 70) {
                                        lb6 = new JLabel("medium");

                                    } else if (GPA > 0 && GPA < 50) {
                                        lb6 = new JLabel("Fail");
                                    }

                                    frame3.add(lb5);
                                    frame3.add(lb6);
                                    frame3.add(h);

                                    lb5.setForeground(Color.YELLOW);
                                    lb6.setForeground(Color.YELLOW);

                                    lb5.setFont(font2);
                                    lb6.setFont(font2);
                                    
                                    lb5.setBounds(135, 170, 200, 20);
                                    lb6.setBounds(135, 220, 200, 20);
                                }

                            } catch (Exception ex) {
                                label_result.setText("error input");
                                System.out.println("error input");
                            }
                        }
                    });
                /**************************************************************/ 
                
                } catch (Exception ex) {
                    label_result.setText("error input");
                    System.out.println("error input");
                }
            }
        }
        );
        /**********************************************************************/    
        
    }//END name
}//END GPA
/******************************************************************************/
//Mahmoud