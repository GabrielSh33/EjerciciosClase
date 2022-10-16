package GUI.MarcoCuadroCombinado;
// Fig. 12.21: ComboBoxFrame.java
// JComboBox object that displays a list of image names.
 import java.awt.FlowLayout;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JComboBox;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame {
    private final JComboBox<String> imagesJComboBox; // Contains the names of the icons
    private final JLabel label; //Show the selected icon

    private static final String names[]={"ins1.gif","ins2.gif","instravel.gif","insanim.gif"};
    private final Icon[] icons = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3]))};

    //The FrameCombined Frame constructor adds a JComboBox object to JFrame
    public ComboBoxFrame(){
        super("JComboBoxTest");
        setLayout(new FlowLayout());// sets the framework schema

        imagesJComboBox = new JComboBox<String>(names);// sets JComboBox
        imagesJComboBox.setMaximumRowCount(3);//shows three rows

        imagesJComboBox.addItemListener(
                new ItemListener() { // anonymous inner class
                    // handle JComboBox event
            @Override
            public void itemStateChanged(ItemEvent event) {
                if(event.getStateChange() == ItemEvent.SELECTED)
                    label.setIcon(icons[
                            imagesJComboBox.getSelectedIndex()]);
            }
                } // end anonymous inner class
        ); // end addItemListener call

        add(imagesJComboBox); //adds combo box to JFrame
        label = new JLabel(icons[0]);// displays the first icon
        add(label);// adds tag to JFrame
    }
}// end of the Frame class Combined Frame