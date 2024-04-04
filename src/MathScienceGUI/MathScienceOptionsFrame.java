package mathscience;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MathScienceOptionsFrame extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    private JMenu mathMenu, scienceMenu;
    private JMenuItem quadraticSolver, factorialSolver, circleArea, lookupElement, exitVelocity;
    private JMenuBar bar;
    
    public MathScienceOptionsFrame(String title )
    {
        super(title);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        mathMenu = new JMenu("Math");
        
        MenuListener ml = new MenuListener();     

        quadraticSolver = new JMenuItem("Quadratic Solver");
        quadraticSolver.addActionListener(ml);
        mathMenu.add(quadraticSolver);

        factorialSolver = new JMenuItem("Factorial Solver");
        factorialSolver.addActionListener(ml);
        mathMenu.add(factorialSolver);
        
        circleArea = new JMenuItem("Area of a Circle");
        circleArea.addActionListener(ml);
        mathMenu.add(circleArea);

        scienceMenu = new JMenu("Science");
        
        lookupElement = new JMenuItem("Find Element");
        lookupElement.addActionListener(ml);
        scienceMenu.add(lookupElement);

        exitVelocity = new JMenuItem("Calc Exit Velocity");
        exitVelocity.addActionListener(ml);
        scienceMenu.add(exitVelocity);

        bar = new JMenuBar();
        bar.add(mathMenu);
        bar.add(scienceMenu);
        setJMenuBar(bar);

    }
    private class MenuListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event) 
        {
            String source = event.getActionCommand();

            if (source.equals("Quadratic Solver"))
                MathScience.quadSolver();
            else
                if (source.equals("Factorial Solver"))
                    MathScience.factSolver();
                else
                    if (source.equals("Area of a Circle"))
                        MathScience.areaCircle();
                    else
                        if (source.equals("Find Element"))
                            MathScience.findElement();
                        else
                            if (source.equals("Calc Exit Velocity"))
                                MathScience.calcVelocity();            
        }
    }
}