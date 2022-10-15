package GUI.Suma;
import javax.swing.JOptionPane;

public class Suma {

        public static void main (String[] args){
                String firstNumber = JOptionPane.showInputDialog("Insert the first number");
                String secondNumber = JOptionPane.showInputDialog("Insert the second number");
                int number1 = Integer.parseInt(firstNumber);
                int number2 = Integer.parseInt(secondNumber);

                int sume = number1 + number2;
                JOptionPane.showInputDialog(null, "La suma es: "+ sume,
                        "Suma de dos enteros ", JOptionPane.PLAIN_MESSAGE);
        }
}