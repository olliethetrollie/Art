package artist.view;

import javax.swing.*;
import artist.controller.ArtController;

public class ArtPanel extends JPanel
{
	
	private ArtController controller;
	private SpringLayout layout;
	private JPanel buttonPanel;
	private JButton saveButton;
	
	public ArtPanel(ArtController app)
	{
		super();
		this.controller = controller;
		this.layout = new SpringLayout();
		this.buttonPanel = new JPanel();
		this.saveButton = new JButton();
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	public void setupPanel()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
	
	public void setupLayout()
	{
		
	}
}
