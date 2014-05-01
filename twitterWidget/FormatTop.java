import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormatTop extends JPanel
{
  public FormatTop()
  {
     this.setLayout(new BorderLayout());
     this.add(new JLabel("Twitter"),
             BorderLayout.CENTER);
     JButton loginButton = new JButton("Login");
     loginButton.addActionListener(new
        ActionListener()
        {
           public void actionPerformed(ActionEvent event)
           {
              Login loginForm = new Login();
           }
        });
      this.add(loginButton,
           BorderLayout.EAST);
   }
}
