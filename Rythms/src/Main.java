import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main
{
	JFrame frame = new JFrame();
	
	public Main() 
	{
		DisplayPanel canvas = new DisplayPanel(frame);
        initUI(canvas);
    }

    private void initUI(DisplayPanel canvas) 
    {
        frame.setTitle("Dehk");
        
        frame.add(canvas);
        frame.setUndecorated(true);
        //frame.setOpacity(0f);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
    
    public void setTransparency()
    {
    	
    }
    
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
            public void run()
            {
            	Main ex = new Main();
            }
        });
	}
}