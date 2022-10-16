package GUI.MarcoBoton;
// Fig. 12.16: TestButton.java
// ButtonFrame test.
 import javax.swing.JFrame;

public class TestButton {
    public static void main(String[] args) {
        FrameButton frameButton = new FrameButton();
        frameButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameButton.setSize(275, 110);
        frameButton.setVisible(true);

    }
}// end class TestButton
