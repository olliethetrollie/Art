package artist.view;

import artist.controller.Controller;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;

public class CanvasPanel extends JPanel
{
	private Controller app;
	private Color currentColor;
	private BufferedImage currentCanvas;
	private BufferedImage stamp;
	private int previousX;
	private int previousY;
	
	public CanvasPanel(Controller app)
	{
		super();
		
		this.app = app;
		this.currentCanvas = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB);
		this.stamp = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		
		setupPanel();
		resetPoint();
	}
	
	public void resetPoint()
	{
		previousX = Integer.MIN_VALUE;
		previousY = Integer.MIN_VALUE;
	}
	
	public void drawDot(int currentX, int currentY, int width)
	{
		Graphics2D currentGraphics = currentCanvas.createGraphics();
		
		currentGraphics.setColor(currentColor);
		currentGraphics.setStroke(new BasicStroke(width));
		currentGraphics.drawOval(currentX, currentY, width, width);
		repaint();
	}
	
	private void setupPanel()
	{
		this.setPreferredSize(new Dimension(700, 700));
		this.setBackground(Color.WHITE);
		this.currentColor = Color.CYAN;
	}
}
