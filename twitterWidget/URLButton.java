import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class URLButton extends JButton
{
   public URLButton()
   {
      title = "";
      //URL = URL;
   }
   public void addURL(String title,final URI URL)
   {
      //JButton this = new JButton();
      this.setText(title);
      this.setHorizontalAlignment(SwingConstants.LEFT);
      this.setBorderPainted(false);
      this.setOpaque(false);
      this.setBackground(Color.lightGray);
      this.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (Desktop.isDesktopSupported()) {
               Desktop desktop = Desktop.getDesktop();
               try {
                  desktop.browse(URL);
               } catch (Exception ex) {
               }
               } else {
               }
               }
         });
   }

   private String title;
//   private final URI URL;
}
