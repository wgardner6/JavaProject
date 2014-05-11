import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

public class LinkButton {
        public static void main(String[] args) throws Exception {
                final URI uri = new URI("http://www.roseindia.net");
                JFrame frame = new JFrame("Link");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 100);
                Container container = frame.getContentPane();
                container.setLayout(new GridBagLayout());

                JButton button = new JButton();
                button.setText("www.roseindia.net");
                button.setHorizontalAlignment(SwingConstants.LEFT);
                button.setBorderPainted(false);
                button.setOpaque(false);
                button.setBackground(Color.lightGray);
                button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if (Desktop.isDesktopSupported()) {
                                        Desktop desktop = Desktop.getDesktop();
                                        try {
                                                desktop.browse(uri);
                                        } catch (Exception ex) {
                                        }
                                } else {
                                }
                        }
                });
                container.add(button);
                frame.setVisible(true);
        }
}
