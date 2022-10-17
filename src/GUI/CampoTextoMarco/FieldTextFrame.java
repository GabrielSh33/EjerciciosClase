package GUI.CampoTextoMarco;
// Fig. 12.9: FrameTextField.java
// The JTextField and JPasswordField components.
 import java.awt.*;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JTextField;
 import javax.swing.JPasswordField;
 import javax.swing.JOptionPane;

public class FieldTextFrame extends JFrame{
    private final JTextField textField1; // text field with fixed size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JPasswordField passwordFiel; // password field with text

    // FrameTextField constructor adds JTextField objects to JFrame
    public FieldTextFrame(){
        super("Test of JTextField and JPasswordField");
        setLayout(new FlowLayout());

        //Build text field with 10 columns
        textField1 = new JTextField(10);
        add(textField1);// add textField1 to JFrame

        //build text field with default text
        textField2 = new JTextField("Write the text here");
        add(textField2);// add textField2 to JFrame

        //build text field with default text and 21 columns
        textField3 = new JTextField("Not editable text field",21);
        textField3.setEditable(false);// disable editing
        add(textField3); // add textField3 to JFrame

        //build password field with default text
        passwordFiel = new JPasswordField("Hidden text");
        add(passwordFiel);

        // register event handlers
        handlerTextField handler = new handlerTextField();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordFiel.addActionListener(handler);

    }
    // private inner class for event handling
    private class handlerTextField implements ActionListener{
        // process text field events
        @Override
        public void actionPerformed(ActionEvent event){
            String string ="";

            //user pressed Enter on JTextField object textField1
            if(event.getSource() == textField1)
                string = String.format("textField11: %s", event.getActionCommand());

            // the user pressed Enter on the JTextField object textField2
            else if(event.getSource() == textField2)
                string = String.format("textField2: %s", event.getActionCommand());

            // the user pressed Enter on the JTextField object textField3
            else if(event.getSource() == textField3)
                string = String.format("textField3: %s", event.getActionCommand());

            // the user pressed Enter on the JTextField object
            else if(event.getSource() == passwordFiel)
                string = String.format("passwordField: %s", event.getActionCommand());
            //display the content of the JTextField object
            JOptionPane.showMessageDialog(null, string);
        }
    } // end of class intern private FieldTextFrame
} // end of class FieldTextFrame
