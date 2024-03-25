package ntu_63135101;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends JFrame implements ActionListener{
	private JTextField meterTextField;
	private JTextField feetTextField;

	

	public form() {
		setTitle("Chuyển đổi đơn vị đo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(30,30,30,30);
	}

}
