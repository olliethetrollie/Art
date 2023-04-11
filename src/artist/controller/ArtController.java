package artist.controller;

import javax.swing.JOptionPane;
import artist.view.ArtFrame;

public class ArtController 
{
	private ArtFrame frame;
	
	public ArtController()
	{
		this.frame = new ArtFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(frame, "ITS ART TIME!!!!");
	}
	
	public void handleError()
	{
//		JOptionPane.showMessageDialog(frame, error.getMessage(), "Java art error :(", JOptionPane.ERROR_MESSAGE);
	}
}
