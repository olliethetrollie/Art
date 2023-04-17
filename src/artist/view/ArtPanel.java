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
	private JPanel stampPanel;
	private JButton saveButton;
	private JButton loadButton;
	private JButton heartButton;
	private JButton squareButton;
	private JButton triangleButton;
	private JButton dotButton;
	private JLabel demoLabel;
	private CanvasPanel canvas;
	private String currentStamp;
	
	public ArtPanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		this.buttonPanel = new JPanel();
		this.stampPanel = new JPanel();
		this.saveButton = new JButton("Save");
		this.loadButton = new JButton("Load");
		this.heartButton = new JButton("Heart Stamp");
		this.squareButton = new JButton("Square Stamp");
		this.dotButton = new JButton("Circle Stamp");
		this.triangleButton = new JButton("Triangle Stamp");
		this.demoLabel = new JLabel("");
		this.canvas = new CanvasPanel(app);
		this.currentStamp = new String("");
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	public void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(Color.DARK_GRAY);
		this.add(buttonPanel);
		this.add(stampPanel);
		buttonPanel.add(saveButton);
		buttonPanel.add(loadButton);
		stampPanel.add(squareButton);
		stampPanel.add(heartButton);
		stampPanel.add(dotButton);
		stampPanel.add(triangleButton);
		this.add(demoLabel);
		this.add(canvas);
		demoLabel.setBackground(Color.WHITE);
	}
	
	public void setupListeners()
	{
		canvas.addMouseMotionListener(new MouseMotionListener()
		{
				@Override
				public void mouseDragged(MouseEvent drag)
				{
					int x = drag.getX();
					int y = drag.getY();
					canvas.drawLine(x, y, 15);
				}
				
				@Override
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
					@Override
					public void mouseClicked(MouseEvent click)
					{
						int x = click.getX();
						int y = click.getY();
						checkStamp(currentStamp,x,y);
					}
					
					@Override
					public void mousePressed(MouseEvent press)
					{
						
					}
					
					@Override
					public void mouseReleased(MouseEvent release)
					{
						canvas.resetPoint();
					}
					
					@Override
					public void mouseEntered(MouseEvent enter)
					{
						
					}
					
					@Override
					public void mouseExited(MouseEvent exit)
					{
						canvas.resetPoint();
					}
				}
				
				
				
				);
		saveButton.addActionListener(click -> canvas.saveImage());
		loadButton.addActionListener(click -> canvas.loadImage());
		heartButton.addActionListener(click -> currentStamp = "heart");
		squareButton.addActionListener(click -> currentStamp = "square");
		dotButton.addActionListener(click -> currentStamp = "dot");
		triangleButton.addActionListener(click -> currentStamp = "triangle");
	}
	

	public void checkStamp(String stamp, int currentX, int currentY)
	{
		if (stamp.equals("heart"))
		{
			canvas.drawHeart(currentX,currentY);
		}
		else if (stamp.equals("square"))
		{
			canvas.drawSquare(currentX,currentY);
		}
		else if (stamp.equals("triangle"))
		{
			canvas.drawTriangle(currentX,currentY);
		}
		else
		{
			canvas.drawDot(currentX,currentY,20);
		}
	}
	
 	public void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, canvas, 34, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, canvas, -50, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, canvas, -34, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, canvas, -750, SpringLayout.EAST, this);
		
		layout.putConstraint(SpringLayout.NORTH, stampPanel, 100, SpringLayout.NORTH, buttonPanel);
		layout.putConstraint(SpringLayout.EAST, stampPanel, -20, SpringLayout.WEST, canvas);
		layout.putConstraint(SpringLayout.WEST, stampPanel, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, stampPanel, 100, SpringLayout.NORTH, stampPanel);
		
	}
}
