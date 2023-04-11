package artist.view;

import javax.swing.*;
import artist.controller.Controller;

public class ArtFrame extends JFrame
{
	private Controller app;
	private ArtPanel panel;
	
	public ArtFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new ArtPanel(this.app);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setTitle("My Java Artwork");
		this.setSize(1200, 900);
		this.setResizable(false);
		
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
