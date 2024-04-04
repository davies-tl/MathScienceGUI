package mathscience;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class MathScience
{
    public static MathScienceOptionsFrame frame;
    public static JTextArea textArea;
    static DecimalFormat fmt = new DecimalFormat("#.00");
    
    public static void main(String[] args)
    {
        frame = new MathScienceOptionsFrame("Final Lab");      
        
        textArea = new JTextArea(10,50);
        textArea.setFont(new Font("Monospaced",Font.PLAIN, 12));

        frame.getContentPane().add(textArea);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void quadSolver()
    {
        //Quadratic formula is solved using the standard method.
        String aStr = JOptionPane.showInputDialog("Enter the length of side a:");
        double a = Double.parseDouble(aStr);
        
        String bStr = JOptionPane.showInputDialog("Enter the length of side b:");
        double b = Double.parseDouble(bStr);
        
        if(a == 0)
            textArea.setText("a cannot be 0");
        else
        {
            double c = Math.pow(a, 2) + Math.pow(b, 2);   //this is technically c squared
            c = Math.sqrt(c);
            textArea.setText("Side c = " + c);
        }
    }
    
    public static void factSolver()
    {
        String numStr = JOptionPane.showInputDialog("Enter the number you want to get the factorial for:");
        int num = Integer.parseInt(numStr);
        int result = factorial(num);
        textArea.setText("The result of the factorial is " + result);
    }
    
    public static int factorial (int num)
    {
        if (num <= 1)
            return 1;
        else
            return num * factorial(num - 1);   
    }
    
    public static void areaCircle()
    {
        String radiusStr = JOptionPane.showInputDialog("Enter the radius of a circle");
        double radius = Double.parseDouble(radiusStr);
        double result = Math.PI * Math.pow(radius, 2);
        textArea.setText("The area of the circle is " + result);        
    }
    
    public static void findElement()
    {
        textArea.setText("Lookup chemical element selected");
    }
    
    public static void calcVelocity()
    {
        textArea.setText("Calculate exit velocity selected");
    }
}
