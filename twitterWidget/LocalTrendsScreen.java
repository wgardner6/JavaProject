import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LocalTrendsScreen extends JFrame
{
   public LocalTrendsScreen()
   {
      JFrame LocTrends = new JFrame();
      JPanel top = new FormatTop();
      JPanel text = new FormatText("./../../../CSCI_293/UnixProject/Twitter/TwitterHeadlines.txt");
      LocTrends.add(top,BorderLayout.NORTH); 
      LocTrends.add(text,BorderLayout.CENTER); 

      LocTrends.pack();
      LocTrends.setVisible(true);
   }
   

/**

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
*/
}
