import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LocalTrendsScreen
{
   public LocalTrendsScreen()
   {
      JFrame LocTrends = new JFrame();
      try{
         Scanner in = new Scanner(new FileReader("TwitterHeadlines.txt"));
         String line = new String();
         while (in.hasNextLine())
         {
            String next = in.nextLine();
            line = line + "<br>" + next;
            JLabel text = new JLabel();
            goWebsite(text, next, "hello");
            //LocTrends.add(new JLabel(line));
         }
         //System.out.print(line+"\n");
         //JLabel text = new JLabel(line);
	 //LocTrends.add(new JLabel("<html>"+line+"</html>",SwingConstants.CENTER));
      }
      catch (FileNotFoundException e){
         System.out.print("File does not exist");
         System.err.println("FileNotFoundException: " + e.getMessage());
      }

      LocTrends.pack();
      LocTrends.setVisible(true);

   }
   private void goWebsite(JLabel website, final String url, String text) {
      website.setText("<html> Website : <a href=\"\">"+text+"</a></html>");
      website.setCursor(new Cursor(Cursor.HAND_CURSOR));
      website.addMouseListener(new MouseAdapter() {
          
          public void mouseClicked(MouseEvent e) {
                  try {
                          Desktop.getDesktop().browse(new URI(url));
                  } catch (URISyntaxException ex) {
                          //It looks like there's a problem
                  } catch (IOException ex) {
          }}
      });
  }
}
