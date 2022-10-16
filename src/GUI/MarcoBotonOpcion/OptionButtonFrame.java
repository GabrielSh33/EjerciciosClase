package GUI.MarcoBotonOpcion;
// Fig. 12.19: OptionButtonFrame.java
// Create radio buttons, using ButtonGroup and JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class OptionButtonFrame extends JFrame{

    private final JTextField TextField;  // used to show changes in font
    private final Font TypeLetterSimple; //font for simple text
    private final Font TypeLetterBold; //font for bold text
    private final Font TypeLetterItalic; //font for text in italics
    private final Font TypeLetterBoldItalic; //bold and italic italic font

    private final JRadioButton simpleJRadioButton; //select simple text
    private final JRadioButton boldJRadioButton; //select bold text
    private final JRadioButton italicsJRadioButton; //select italic text
    private final JRadioButton boldItalicJRadioButton; // bold and italic
    private final ButtonGroup optiongroup; // contains the option buttons


    //The constructor of OptionButtonFrame adds the JRadioButton objects to the JFrame
    public OptionButtonFrame() {
        super("Test RadioButton");
        setLayout(new FlowLayout());

        TextField = new JTextField("Notice the change in the style of the type letter",25);
        add(TextField); // add TextField to JFrame

        //create radio buttons
        simpleJRadioButton = new JRadioButton("Simple",true);
        boldJRadioButton = new JRadioButton("Bold",false);
        italicsJRadioButton = new JRadioButton("Italic",false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic",false);
        add(simpleJRadioButton);//add simple button to JFrame
        add(boldJRadioButton);//adds bold button to JFrame
        add(italicsJRadioButton);//add italics button to JFrame
        add(boldItalicJRadioButton); // add bold and italic button

        //create a logical relationship between the JRadioButton objects
        optiongroup= new ButtonGroup(); //create ButtonGroup
        optiongroup.add(simpleJRadioButton);//create ButtonGroup
        optiongroup.add(boldJRadioButton);//adds bold to the group
        optiongroup.add(italicsJRadioButton); // add italics to the group
        optiongroup.add(boldItalicJRadioButton);//add bold and italic

        //create font objects
        TypeLetterSimple= new Font("Serif",Font.PLAIN,14);
        TypeLetterBold= new Font("Serif",Font.BOLD,14);
        TypeLetterItalic = new Font("Serif",Font.ITALIC,14);
        TypeLetterBoldItalic= new Font("Serif",Font.BOLD+Font.ITALIC,14);
        TextField.setFont(TypeLetterSimple);

        //register events for JRadioButton objects
        simpleJRadioButton.addItemListener(new OptionButtonHandler(TypeLetterSimple));
        boldJRadioButton.addItemListener(new OptionButtonHandler(TypeLetterBold));
        italicsJRadioButton.addItemListener(new OptionButtonHandler(TypeLetterBoldItalic));
        boldItalicJRadioButton.addItemListener(new OptionButtonHandler(TypeLetterBoldItalic));
        }
        //private inner class to handle radio button events
        private class OptionButtonHandler implements ItemListener{
            private Font typeLetter; //font associated with this listener component
            public OptionButtonHandler(Font f){
                typeLetter = f;
            }
            //handle radio button events
            @Override
            public void itemStateChanged(ItemEvent event){
                TextField.setFont(typeLetter);
            }
        }
    }// end class OptionButtonFrame

