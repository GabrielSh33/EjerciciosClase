package GUI.CampoTextoMarco;
// Fig. 12.10: TextFieldTest.java
// Test FrameTextField.

import javax.swing.JFrame;

public class TestTextField {

    public static void main(String[] args) {

        FieldTextFrame fieldTextFrame = new FieldTextFrame();
        fieldTextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fieldTextFrame.setSize(350, 100);
        fieldTextFrame.setVisible(true);
    }
}// end class TextFieldTest
