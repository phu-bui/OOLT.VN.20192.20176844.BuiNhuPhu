import javax.swing.JOptionPane;
public class HelloNameDialog{
    public static void main(String args[]){
        String name;
        name = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hello" + name + "!");
        System.exit(0);
    }
}