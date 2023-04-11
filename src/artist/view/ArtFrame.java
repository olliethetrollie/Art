package artist.view;

import javax.swing.*;
import artist.controller.ArtController;

public class ArtFrame extends JFrame
{
	private ArtController app;
	private ArtPanel panel;
	
	public ArtFrame(ArtController app)
	{
		super();
		this.app = app;
		this.panel = new ArtPanel(this.app);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setTitle("Art time baby :]");
		this.setSize(1200, 900);
		this.setResizable(false);
		
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
