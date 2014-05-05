import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormatText extends JPanel
{
   public FormatText(String filename)
   {
      try{
         Scanner in = new Scanner(new FileReader(filename));
         String line = new String();
         while (in.hasNextLine())
         {
            String next = in.nextLine();
            line = line + "<br>" + next;
            //JLabel text = new JLabel();
            //goWebsite(text, next, "hello");
            //LocTrends.add(new JLabel(line));
         }
         //System.out.print(line+"\n");
         //JLabel text = new JLabel(line);
         //System.out.print(this.getClass());
         //this.add(new JLabel("Hello"));
         this.add(new JLabel("<html>"+line+"</html>",SwingConstants.CENTER));
      }
      catch (FileNotFoundException e){
         System.out.print("File does not exist");
         System.err.println("FileNotFoundException: " + e.getMessage());
      }

   }
}
