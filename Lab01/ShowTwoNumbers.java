import javax.swing.JOptionPane;
public class ShowTwoNumbers{
    public static void main(String args[]){
        String number1, number2;
        String notification = "You've just entered: ";
        number1 = JOptionPane.showInputDialog(null, "Please input the first number:", "Input the first number ", JOptionPane.INFORMATION_MESSAGE);
        notification += number1 + "and";
        number2 = JOptionPane.showInputDialog(null, "Please input the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        notification += number2;
        JOptionPane.showMessageDialog(null, notification, "Show two numbers:", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}