import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login
{
   public Login()
   {
      JFrame loginFrame = new JFrame();
      final JTextField userField = new JTextField(20);
      final JTextField passField = new JTextField(20);
      JButton loginButton = new JButton("Login");
      userField.setText("Username");
      passField.setText("Password");
      loginFrame.setLayout(new FlowLayout());
      loginFrame.add(userField);
      loginFrame.add(passField);
      loginFrame.add(loginButton);

      loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      loginFrame.pack();
      loginFrame.setVisible(true);
   }


}
