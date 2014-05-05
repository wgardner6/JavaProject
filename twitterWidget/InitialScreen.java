import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.lang.Process;
import java.lang.Runtime;

public class InitialScreen 
{
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
      final String datapath = "./../../../CSCI_293/UnixProject/Twitter/";
      locButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               String command = "make" ; //the make command you wish to run
               String [] envp = { } ; //if you want to set some environment variables
               File dir = new File ( datapath ) ; // this is the directory where the Makefile is
               try
               {
               Process proc = Runtime.getRuntime().exec(command,envp,dir);
               proc.waitFor ( );
               }
               catch(IOException ex)
               {
                  System.out.print("Hello");
               }
               catch(InterruptedException ex)
               {
                  System.out.print("Goodbye");
               }
               LocalTrendsScreen localPanel = new LocalTrendsScreen();
            }
         });
       worldButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               String command = "bash WorldTrends.sh" ; //the make command you wish to run
               String [] envp = { } ; //if you want to set some environment variables
               File dir = new File ( datapath ) ; // this is the directory where the Makefile is
               try
               {
               Process proc = Runtime.getRuntime().exec(command,envp,dir);
               proc.waitFor ( );
               }
               catch(IOException ex)
               {
                  System.out.print("Hello");
               }
               catch(InterruptedException ex)
               {
                  System.out.print("Goodbye");
               }
               WorldTrendsScreen worldPanel = new WorldTrendsScreen();
            }
         });

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(topPanel, BorderLayout.NORTH);
      frame.add(choicePanel, BorderLayout.CENTER);

      frame.pack();
      frame.setVisible(true);
   }
}
