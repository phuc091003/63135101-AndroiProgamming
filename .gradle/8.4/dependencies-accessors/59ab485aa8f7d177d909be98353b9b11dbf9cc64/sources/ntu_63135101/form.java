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
		
		JLabel meterLabel = new JLabel("Mét: ");
		meterTextField = new JTextField(10);
		
		JLabel feetLabel = new JLabel("Feet: ");
		feetTextField = new JTextField(10);
		
		JButton toFeetButton = new JButton("Mét sang Feet");
		toFeetButton.addActionListener(this);
		JButton toMeterButton = new JButton("Feet sang Mét");
		toMeterButton.addActionListener(this);
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(meterLabel, constraints);
		
		constraints.gridx = 1;
		panel.add(meterTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(feetLabel, constraints);
		
		constraints.gridx = 1;
		panel.add(feetTextField, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(toFeetButton, constraints);
		
		constraints.gridx = 1;
		panel.add(toMeterButton, constraints);
		
		add(panel);
		pack();
		setLocationRelativeTo(null);
	}
	public void convertToFeet() {
		try {
			double meter = Double.parseDouble(meterTextField.getText());
			double feet = meter *3.28084;
			feetTextField.setText(String.format("%.2f",feet));
		} catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Giá trị không hợp lệ!");;
		}
	}
}
