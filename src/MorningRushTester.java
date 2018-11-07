import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class MorningRushTester 
{
    private static final int DELAY = 1000;

    public MorningRushTester()
    {
        
    }
    
    public static void main(String[] args)
    {
        class DrinkCoffee implements ActionListener
        {

            private int gulps;
            
            public DrinkCoffee(int inGulps)
            {
                gulps = inGulps;
            }
            
            public int Gulps()
            {
                return gulps;
            }
            
            public void actionPerformed(ActionEvent event)
            {
                if (gulps >= 0)
                {
                    System.out.println(gulps);
                }
                else if (gulps == 0)
                {
                    System.out.println("Go to school");
                    JOptionPane.showMessageDialog(null, "Make another?");
                    int initialGulps = 0;
                    gulps = initialGulps ;
                }
                --gulps;
            }
        }
        
        DrinkCoffee dc = new DrinkCoffee(5);
        Timer t = new Timer(DELAY, dc);
        t.start();
        
        JOptionPane.showMessageDialog(null, "Make another?");
        System.exit(0);
    }
}
