import javax.swing.JOptionPane;
public class TheFirstDegreeEquation{
    public static void main(String args[]){
        String stra, strb;
        stra = JOptionPane.showInputDialog(null, "Please input a;", "The first degree equation ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
        strb = JOptionPane.showInputDialog(null, "Please input b:", "The first degree equation ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        if( a == 0 ){
            JOptionPane.showMessageDialog(null, "The equation has no solution!");
            System.exit(0);
        }
        else{
            double x = -b/a;
            JOptionPane.showMessageDialog(null, x, "The solution to the equation is: ", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}