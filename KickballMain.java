import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KickballMain extends JFrame
{
	private Stickman steve = new Stickman(100,100);
	
	public KickballMain()
	{
		setBounds(100,100,600,400);
		setLayout(null);
		setTitle("Kickball");
		
		add(steve);

		this.addKeyListener(new KeyListener() 
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_W)
				{
					if(!(steve.getY() <= 0))
						steve.setLocation(steve.getX(),steve.getY()-10);
				}
				if(e.getKeyCode() == e.VK_A)
				{
					if(!(steve.getX() <= 0))
						steve.setLocation(steve.getX()-10,steve.getY());
				}
				if(e.getKeyCode() == e.VK_S)
				{
					steve.setLocation(steve.getX(),steve.getY()+10);
				}
				if(e.getKeyCode() == e.VK_D)
				{
					steve.setLocation(steve.getX()+10,steve.getY());
				}
				repaint();
			}
			public void keyReleased(KeyEvent e) 
			{
				
			}
			public void keyTyped(KeyEvent e) 
			{
				
			}			
		});
		
		setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		new KickballMain();
	}
}
