package GUI.MarcoBoton;
// Fig. 12.15: ButtonFrame.java
// Command buttons and action events.
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrameButton<LabelFrameButton> extends JFrame {
    private final JButton buttonJButtonSimple; // button with text only
    private final JButton buttonJButtonElegant; // button with icons

    //ButtonFrame adds JButton objects to JFrame
    public FrameButton(){
        super("Test of buttons");
        setLayout(new FlowLayout());

        buttonJButtonSimple = new JButton("Simple button"); // button with text
        add(buttonJButtonSimple); // add buttonJButtonSimple to JFrame

        Icon insect1 = new ImageIcon(getClass().getResource("Insect1.gif"));
        Icon insect2 = new ImageIcon(getClass().getResource("Insect2.gif"));
        buttonJButtonElegant = new JButton("Elegant button", insect1);// set the image
        buttonJButtonElegant.setRolloverIcon(insect2);// set the replacement image
        add(buttonJButtonElegant);// add fancyButtonJButton to JFrame

        // create new ButtonHandler to handle button events
        HandlerButton handler = new HandlerButton();
        buttonJButtonElegant.addActionListener(handler);
        buttonJButtonSimple.addActionListener(handler);
    }
    // inner class to handle button events
    private class HandlerButton implements ActionListener {
        // handle button event
       @Override
       public void actionPerformed(ActionEvent event) {
           JOptionPane.showMessageDialog(FrameButton.this, String.format("You oppressed: %s" ,
                   event.getActionCommand()));


        }
    }
}// end the class FrameButton

