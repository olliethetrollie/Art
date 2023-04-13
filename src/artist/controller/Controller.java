package artist.controller;

import javax.swing.JOptionPane;
import artist.view.ArtFrame;

public class Controller 
{
	private ArtFrame frame;
	
	public Controller()
	{
		this.frame = new ArtFrame(this);
	}
	
	public void start()
	{
//		JOptionPane.showMessageDialog(frame, "ITS ART TIME!!!!");
	}
	
	public void handleError(Exception error)
	{
		JOptionPane.showMessageDialog(frame, error.getMessage(), "Java art error :(", JOptionPane.ERROR_MESSAGE);
	}
}
