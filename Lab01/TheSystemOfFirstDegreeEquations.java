import javax.swing.JOptionPane;
public class TheSystemOfFirstDegreeEquations {
    public static void main(String args[]){
        String stra11, stra12, strb1, stra21, stra22, strb2;
        stra11 = JOptionPane.showInputDialog(null, "Please input a11;", "The System Of First Degree Equations", JOptionPane.INFORMATION_MESSAGE);
        stra12 = JOptionPane.showInputDialog(null, "Please input a12:", "The System Of First Degree Equations", JOptionPane.INFORMATION_MESSAGE);
        strb1 = JOptionPane.showInputDialog(null, "Please input b1;", "The System Of First Degree Equations", JOptionPane.INFORMATION_MESSAGE);
        stra21 = JOptionPane.showInputDialog(null, "Please input a21:", "The System Of First Degree Equations", JOptionPane.INFORMATION_MESSAGE);
        stra22 = JOptionPane.showInputDialog(null, "Please input a22;", "The System Of First Degree Equations", JOptionPane.INFORMATION_MESSAGE);
        strb2 = JOptionPane.showInputDialog(null, "Please input b2:", "The System Of First Degree Equations", JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(stra11);
        double a12 = Double.parseDouble(stra12);
        double b1 = Double.parseDouble(strb1);
        double a21 = Double.parseDouble(stra21);
        double a22 = Double.parseDouble(stra22);
        double b2 = Double.parseDouble(strb2);
        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;

        if( D == 0 ){
            if(D == D1 & D == D2){
                JOptionPane.showMessageDialog(null, "The system has a unique solution");
                System.exit(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "The equation has no solution!");
                System.exit(0);
            }
        }
        else{
            double x1 = D1/D;
            double x2 = D2/D;
            String notification = x1 + " and " + x2;
            JOptionPane.showMessageDialog(null, notification, "The solution to the equation is: ", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}