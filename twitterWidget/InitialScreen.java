import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   Presents a phone GUI for the voice mail system.
*/
public class InitialScreen 
{
   /**
      Constructs a telephone with a speaker, keypad,
      and microphone.
   */
   public InitialScreen()
   {
      JPanel topPanel = new FormatTop();
      JPanel choicePanel = new JPanel();
      final JFrame frame = new JFrame();
      choicePanel.setLayout(new GridLayout(2,1));
      JButton locButton = new JButton("Local Trends");
      JButton worldButton = new JButton("Worldwide Trends");
      choicePanel.add(locButton);
      choicePanel.add(worldButton);
      locButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               LocalTrendsScreen localPanel = new LocalTrendsScreen();
               //frame.add(localPanel, BorderLayout.CENTER);
            }
         });
       worldButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               //connect.dial(label);
            }
         });

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(topPanel, BorderLayout.NORTH);
      frame.add(choicePanel, BorderLayout.CENTER);

      frame.pack();
      frame.setVisible(true);
   }
}
