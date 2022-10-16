package GUI.MarcoBotonOpcion;
// Fig. 12.20: OptionButtonTest.java
// OptionButtonFrame test....
import javax.swing.JFrame;

public class TestButtonOpcion {
    public static void main ( String [] args ) {
        OptionButtonFrame optionButtonFrame = new OptionButtonFrame();
        optionButtonFrame.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE );
        optionButtonFrame.setSize( 600 , 100 );
        optionButtonFrame.setVisible( true );
    }
}// end class OptionButtonTest
