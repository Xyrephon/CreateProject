package create.view;

import javax.swing.JFrame;
import create.controller.CreateController;
import java.awt.Dimension;

public class CreateFrame extends JFrame
{
	private CreateController baseController;
	private CreatePanel appPanel;
	
	public CreateFrame(CreateController baseController)
	{
		this.baseController = baseController;
		appPanel = new CreatePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Budget");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}

}
