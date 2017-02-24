package create.view;

import javax.swing.*;
import create.controller.CreateController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import create.model.Account;
import create.model.Bank;

public class CreatePanel extends JPanel
{
	private CreateController baseController;
	private SpringLayout baseLayout;
	private JButton createButton;
	private JTextField nameField;
	private JList accountList;
	
	public CreatePanel(CreateController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		createButton = new JButton("Create");
		nameField = new JTextField(10);
		accountList = new JList<Account>();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(createButton);
		this.add(nameField);
		this.add(accountList);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		createButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

				String name = nameField.getText();
//				Bank.accountArray.add(new Account(name));
				
			}
		});
		
	}

}
