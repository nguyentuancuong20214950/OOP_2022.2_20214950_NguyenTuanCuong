import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args) {
        String strnum1, strnum2;
        Double num1, num2, sum = 0.0, difference = 0.0, product = 0.0, quotient = 0.0;
        strnum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ","Input the first number");

        strnum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ","Input the second number");
        
        num1 = Double.parseDouble(strnum1);
        num2 = Double.parseDouble(strnum2);
        
        sum = (double) (num1+ num2);
        JOptionPane.showMessageDialog(null, "The sum of two numbers is:" + sum);
        
        difference = (double) (num1-num2);
        JOptionPane.showMessageDialog(null, 
        "The difference of number 1 from number 2 is:" + difference);

        product = (double) (num1*num2);
        JOptionPane.showMessageDialog(null, 
        "The product of two numbers is:" + product);

        
        if (num2==0) {
            JOptionPane.showMessageDialog(null, 
            "The quotient of two numbers is not exist as couldn't divide by zero");
        }
        else {
            quotient = (double) (num1 / num2);
            JOptionPane.showMessageDialog(null, "The quotient of two numbers is:" + quotient);
        }
    }
}