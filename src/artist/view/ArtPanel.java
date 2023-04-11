package artist.view;

import javax.swing.*;
import artist.controller.Controller;

public class ArtPanel extends JPanel
{
	
	private Controller controller;
	private SpringLayout layout;
	private JPanel buttonPanel;
	private JButton saveButton;
	
	public ArtPanel(Controller app)
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
