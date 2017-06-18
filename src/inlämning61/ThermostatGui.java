package inlämning61;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ThermostatGui {
	private JFrame frame;
	private JTextField textField;
	private ThermosatLogic thermo;
	
	/**
	 * Launch the app.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					ThermostatGui window = new ThermostatGui();
					window.frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create app.
	 */
	public ThermostatGui() {
		initialize();
	}
	/**
	 * initialize the contents of the frame.
	 */
	private void initialize() {
		thermo = new ThermosatLogic();
		
		frame = new JFrame();
		frame.setTitle("Valencia thermostat");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBackground(Color.RED);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(126, 101, 204, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnFButton = new JButton("Fahrenheit");
		btnFButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double myF = thermo.convertToFahrenheit(Double.parseDouble(textField.getText()));
				textField.setText(String.valueOf(myF));
			}
		});
		btnFButton.setBounds(0, 81, 89,23);
		frame.getContentPane().add(btnFButton);
		
		JButton btnCButton = new JButton("Celcius");
		btnCButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double myC = thermo.convertToCelcius(Double.parseDouble(textField.getText()));
				textField.setText(String.valueOf(myC));
			}
		});
		btnCButton.setBounds(0, 146, 89, 23);
		frame.getContentPane().add(btnCButton);
		}
	}