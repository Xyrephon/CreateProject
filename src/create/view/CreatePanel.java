package create.view;

import javax.swing.*;
import create.controller.CreateController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreatePanel extends JPanel
{
	private CreateController baseController;
	private SpringLayout baseLayout;
	
	public CreatePanel(CreateController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
