import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.io.*;

public class URLButton extends JButton
{
   /**
      Initializes title to empty string
   */
   public URLButton()
   {
      title = "";
   }
   /**
      Add button with actionListener that will load URL in existing browser.
      @param title text to display on button
      @param URL URI object that is the URL to specific website
   */
   public void addURL(String title,final URI URL)
   {
      this.setText(title);
      this.setHorizontalAlignment(SwingConstants.LEFT);
      this.setBorderPainted(false);
      this.setOpaque(false);
      this.setBackground(Color.lightGray);
      this.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (Desktop.isDesktopSupported()) {
               Desktop desktop = Desktop.getDesktop();
               try 
               {
                  desktop.browse(URL);
               } 
               catch (Exception ex) 
               {
                  System.out.println("Browser could not be opened with given URL");
               }
               } 
               else {
               }
         }
      });
   }

   private String title;
}
