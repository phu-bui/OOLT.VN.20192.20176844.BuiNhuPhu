import javax.swing.JOptionPane;
public class TheSecondDegreeEquation{
    public static void main(String args[]){
        String stra, strb, strc;
        stra = JOptionPane.showInputDialog(null, "Please input a (a ≠ 0);", "The second degree equation", JOptionPane.INFORMATION_MESSAGE);
        strb = JOptionPane.showInputDialog(null, "Please input b;", "The second degree equation", JOptionPane.INFORMATION_MESSAGE);
        strc = JOptionPane.showInputDialog(null, "Please input c;", "The second degree equation", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        double c = Double.parseDouble(strc);
        double delta = b*b - 4*a*c;
        if( delta == 0 ){
            double x = -b/2*a;
            JOptionPane.showMessageDialog(null, x, "The equation has double root:", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if( delta > 0 ){
            double x1 = ( -b + Math.sqrt(delta))/2*a;
            double x2 = ( -b - Math.sqrt(delta))/2*a;
            String notification = x1 + " or " + x2;
            JOptionPane.showMessageDialog(null, notification, "The equation has two distinct roots: ", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "The equation has no solution!");
            System.exit(0);
        }
    }
}