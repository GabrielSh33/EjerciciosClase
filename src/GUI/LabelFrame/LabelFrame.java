package GUI.LabelFrame;
// Fig. 12.6: LabelFrame.java
// Jlabel components with text and icons
 import java.awt.FlowLayout; // specifies how components are to be ordered
 import javax.swing.JFrame; // provides the basic features of awindow
 import javax.swing.JLabel; // display text and images
 import javax.swing.SwingConstants; // common constants used with Swing
 import javax.swing.Icon; // interface used to manipulate images
 import javax.swing.ImageIcon; // load the images

public class LabelFrame extends JFrame {
    private JLabel label1; //JLabel with text only
    private JLabel label2; //JLabel built with tecto and an icon
    private JLabel label3;  //JLabel with additional text and icon

    // LabelFrame constructor adds JLabel objects to JFrame
    public LabelFrame(){
     super("Test of JLabel1");
     setLayout(new FlowLayout()); // set the frame schema

     label1 = new JLabel("Label whit text");
     label1.setToolTipText("This is label1");
     add(label1); // add label1 to JFrame

     // JLabel constructor with string, Icon, and alignment arguments
     Icon insect = new ImageIcon(getClass().getResource("insect.png"));
     label2 = new JLabel("Label whit text and icon", insect, SwingConstants.LEFT);
     label2.setToolTipText("This is label2");
     add(label2); // add label2 to JFrame

     label3 = new JLabel(); // JLabel constructor with no arguments
     label3.setText("Label whit icon and text in the bottom");
     label3.setIcon(insect);
     label3.setHorizontalTextPosition(SwingConstants.CENTER);
     label3.setVerticalTextPosition(SwingConstants.BOTTOM);
     label3.setToolTipText("This us label3");
     add(label3); // add label3 to JFrame
    }
} // end LabelFrame class
