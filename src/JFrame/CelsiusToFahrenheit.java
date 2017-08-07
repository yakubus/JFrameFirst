package JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CelsiusToFahrenheit extends JFrame implements ActionListener{
	
	JLabel lCelsius, lFahrenheit;
	JTextField tCelsius, tFahrenheit;
	JButton bKonwertuj;
	
	double tempCelsius, tempFahrenheit;
	
	public CelsiusToFahrenheit() {
		
				
		setSize(400,300);
		setTitle("Celsiusz to rahrenheit");
		setLayout(null);
		
		lCelsius = new JLabel("stopnie Celsiusza");
		lCelsius.setBounds(20, 20, 150, 20);
		add(lCelsius);
		
		tCelsius = new JTextField("");
		tCelsius.setBounds(170, 20, 150, 20);
		add(tCelsius);
		
		lFahrenheit = new JLabel("stopnie fahrenheita");
		lFahrenheit.setBounds(20, 70, 150, 20);
		add(lFahrenheit);
		
		tFahrenheit = new JTextField("");
		tFahrenheit.setBounds(170, 70, 150, 20);
		add(tFahrenheit);
		
		bKonwertuj = new JButton("konwertuj");
		bKonwertuj.setBounds(100, 100, 150, 20);
		add(bKonwertuj);
		
		bKonwertuj.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tempCelsius = Double.parseDouble(tCelsius.getText());
		tempFahrenheit = 32.0 + (9.0/5) *tempCelsius;
		tFahrenheit.setText(String.valueOf(tempFahrenheit));
	}



	public static void main (String[] args) {
		CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}
	
}
