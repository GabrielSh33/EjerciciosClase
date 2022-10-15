package GUI.marcoboton;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton<LabelFrameButton> extends JFrame {
    private final JButton buttonButtonSimple;
    private final JButton buttonJButtonElegante;

    public MarcoBoton(){
        super("Test of buttons");
        setLayout(new FlowLayout());

        buttonButtonSimple = new JButton("Simple button");
        add(buttonButtonSimple);

        Icon insect1 = new ImageIcon(getClass().getResource("Insect1.gif"));
        Icon insect2 = new ImageIcon(getClass().getResource("Insect2.gif"));
        buttonJButtonElegante = new JButton("Elegant button", insect1);
        buttonJButtonElegante.setRolloverIcon(insect2);
        add(buttonJButtonElegante);

        HandlerButton handler = new HandlerButton();
        buttonJButtonElegante.addActionListener(handler);
        buttonButtonSimple.addActionListener(handler);
    }

    private class HandlerButton implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent event) {
           JOptionPane.showMessageDialog(MarcoBoton.this, String.format("You oppressed: %s" ,
                   event.getActionCommand()));


        }
    }
}

