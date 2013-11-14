import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayPanel extends JPanel
{
	JFrame window;
	Timer t = new Timer();
	float opacity;
	
	public DisplayPanel(JFrame frame)
	{
		window = frame;
		opacity = 0.0f;
		
        setSurfaceSize();
        setBackground(new Color(0, 0, 0));
        t.schedule(new TimerTask()
        {
            public void run() 
            {
            	window.setOpacity(opacity);
            	opacity += 0.003f;
            	if (opacity >= 1)
            	{
            		t.cancel();
            		startGame();
            	}
            }
        }, 5, 10); //delay in ms, period in ms
	}
	
	public void setSurfaceSize()
	{
		Dimension d = new Dimension();
		
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int width = ((int) tk.getScreenSize().getWidth());  
		int height = ((int) tk.getScreenSize().getHeight());  
		
        d.width = width;
        d.height = height;
        setPreferredSize(d);
	}
	
	public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
    }
	
	public void startGame()
	{
		
	}
}
