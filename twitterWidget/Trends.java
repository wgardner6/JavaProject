import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.URI;
public class Trends extends JFrame
{
   /**
      Creates a JFrame that holds all the Twitter links.
   */
   public Trends(String file) 
   {
      JFrame LocTrends = new JFrame();
      JPanel top = new FormatTop();
      try
      {
         JPanel panel = new JPanel(new GridLayout(10,1));
         BufferedReader br = new BufferedReader(new FileReader(file));
         String title;
         while ((title = br.readLine()) != null){
            URI url = new URI(br.readLine());
            URLButton button = new URLButton();
            button.addURL(title, url);
            panel.add(button);
         }
         LocTrends.add(panel, BorderLayout.CENTER);
         br.close();
      }
      catch(Exception e)
      {
         System.out.println("Error file is not found");
      }
      LocTrends.add(top,BorderLayout.NORTH); 
      LocTrends.add(new JLabel("<html>Please click on a topic<br> to view the Twitter page</html>"),BorderLayout.EAST);

      LocTrends.pack();
      LocTrends.setVisible(true);
   }
   
private String file;
}
