import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HelloJava2 {

  public static void main(String[] args) {
    JFrame frame = new JFrame("HelloJava2");
    frame.add(new HelloComponent2("Hello, buddy! You're looking fine."));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 300);
    frame.setVisible(true);
  }
}

class HelloComponent2 extends JComponent implements MouseMotionListener {
  String theMessage;
  int messageX = 25, messageY = 95; // Coordinates of message

  public HelloComponent2(String message) {
    theMessage = message;
    addMouseMotionListener(this);
  }

  public void paintComponent(Graphics g) {
    g.drawString(theMessage, messageX, messageY);
  }

  public void mouseDragged(MouseEvent e) {
//    Save the mouse coordinates and paint the message
    messageX = e.getX();
    messageY = e.getY();
    repaint();
  }

  public void mouseMoved(MouseEvent e) { }
}