//Mahmoud
package project_java_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class User extends GPA {
    
/**************************************************************************/
    public static JTextField user = new JTextField(20);
    public static JPasswordField pass = new JPasswordField(20);

    public static JButton Login = new JButton("Login");
    static JLabel label_result = new JLabel();

    public static Font font1 = new Font("Arial", Font.BOLD, 17);

    public static String username;
    public static double password;

    static JFrame frame = new JFrame("login");
/**************************************************************************/
    
    public User() {
        
    /**************************************************************************/
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lb1 = new JLabel("UserName : ");
        JLabel lb2 = new JLabel("Password : ");

        lb1.setFont(font1);
        lb2.setFont(font1);
        Login.setFont(font1);

        JLabel jb2 = new JLabel();
        jb2.setText("beprogrammer");

        jb2.setIcon(new ImageIcon("beprogrammer.jpg"));

        frame.add(lb1);
        frame.add(user);
        frame.add(lb2);
        frame.add(pass);
        frame.add(Login);
        frame.add(jb2);
        frame.add(label_result);
        frame.setResizable(false);

        Color color = new Color(100, 200, 100);
        frame.getContentPane().setBackground(color);

        frame.setVisible(true);

        lb1.setBounds(20, 40, 100, 20);
        lb2.setBounds(20, 80, 100, 20);
        user.setBounds(120, 41, 200, 20);
        pass.setBounds(120, 81, 200, 20);
        Login.setBounds(160, 121, 100, 30);
        jb2.setBounds(0, 150, 400, 300);
    /**************************************************************************/
    
        Login.addActionListener(new ActionListener() {
            
            /******************************************************************/
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    username = String.valueOf(user.getText());
                    password = Double.valueOf(pass.getText());
                    if (e.getActionCommand() == "Login") {
                        if (username.equalsIgnoreCase("mahmoud") && password == 2002 ||
                            username.equalsIgnoreCase("hazam") && password == 12345) {
                            System.out.println("Welcome "+username);
                            name(username);
                        }
                    }
                } catch (Exception ex) {
                    label_result.setText("error username or password");
                    System.out.println("error username or password");
                }
            }
            /******************************************************************/ 
        }
        );
    }//END User method
}//End User
/******************************************************************************/
//Mahmoud