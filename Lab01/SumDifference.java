import javax.swing.JOptionPane;
public class SumDifference{
    public static void main(String args[]){
        String strNum1,strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number;", "The first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:", "The second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double multiplication = num1 * num2;
        double quotient = num1/num2;
        JOptionPane.showMessageDialog(null, sum, "Sum:", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, difference, "Difference:", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, multiplication, "Multiplication:", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, quotient, "Quotient:", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}