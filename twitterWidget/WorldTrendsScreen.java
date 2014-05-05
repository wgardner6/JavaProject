import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WorldTrendsScreen
{
   public WorldTrendsScreen()
   {
      JFrame LocTrends = new JFrame();
      JPanel top = new FormatTop();
      JPanel text = new FormatText("./../../../CSCI_293/UnixProject/Twitter/TwitterHeadlines.txt");
      LocTrends.add(top,BorderLayout.NORTH); 
      LocTrends.add(text,BorderLayout.CENTER); 

      LocTrends.pack();
      LocTrends.setVisible(true);
   }
}
