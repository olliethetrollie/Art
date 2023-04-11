package artist.view;

import java.awt.Color;
import java.awt.event.*;


import javax.swing.*;
import artist.controller.Controller;

public class ArtPanel extends JPanel
{
	
	private Controller app;
	private SpringLayout layout;
	private JPanel buttonPanel;
	private JButton saveButton;
	private JLabel demoLabel;
	private CanvasPanel canvas;
	
	public ArtPanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		this.buttonPanel = new JPanel();
		this.saveButton = new JButton();
		this.demoLabel = new JLabel("");
		this.canvas = new CanvasPanel(app);
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	public void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(Color.DARK_GRAY);
		this.add(demoLabel);
		this.add(canvas);
		demoLabel.setBackground(Color.WHITE);
	}
	
	public void setupListeners()
	{
		canvas.addMouseMotionListener(new MouseMotionListener()
		{
				public void mouseDragged(MouseEvent drag)
				{
					
				}
				
				public void mouseMoved(MouseEvent move)
				{
					int x = move.getX();
					int y = move.getY();
					
					String message = "X: " + x + " Y: " + y;
					demoLabel.setText(message);
				}
				
		});
		
		canvas.addMouseListener(new MouseListener()
				{
					public void mouseClicked(MouseEvent click)
					{
						
					}
					
					public void mousePressed(MouseEvent press)
					{
						
					}
					
					public void mouseReleased(MouseEvent release)
					{
						canvas.resetPoint();
					}
					
					public void mouseEntered(MouseEvent enter)
					{
						
					}
					
					public void mouseExited(MouseEvent exit)
					{
						canvas.resetPoint();
					}
				}
				
				
				
				);
	}
	
	public void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, canvas, 34, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, canvas, -50, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, canvas, -34, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, canvas, -750, SpringLayout.EAST, this);
	}
}
