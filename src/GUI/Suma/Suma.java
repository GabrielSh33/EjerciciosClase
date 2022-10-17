package GUI.Suma;
// Fig. 12.2: Sum.java
// Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane;

public class Suma {

        public static void main (String[] args){

                // get user input from JOptionPane's input dialogs
                String firstNumber = JOptionPane.showInputDialog("Insert the first number");
                String secondNumber = JOptionPane.showInputDialog("Insert the second number");

                //convert the String inputs to int values to use in the calculation
                int number1 = Integer.parseInt(firstNumber);
                int number2 = Integer.parseInt(secondNumber);

                int sume = number1 + number2;

                //Display the results in the JOptionPane message dialog
                JOptionPane.showMessageDialog(null, "La suma es: "+ sume,
                        "Suma de dos enteros ", JOptionPane.PLAIN_MESSAGE);
        }
}//end class Sum