package JFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CelsiusToFahrenheit extends JFrame implements ActionListener{

	//***********deklaracje pól******************************
	
	private JLabel lCelsius, lFahrenheit;
	private JTextField tCelsius, tFahrenheit;
	private JButton bKonwertuj;
	private JCheckBox chWielkie;
	private ButtonGroup bgRozmiar;
	private JRadioButton rbMaly, rbSredni, rbDuzy;
		
	
	private double tempCelsius, tempFahrenheit;
	//*******************************************************
	
	public CelsiusToFahrenheit() {
	
				
		setSize(400,400);
		setTitle("Celsiusz to rahrenheit");
		setLayout(null);
		
		lCelsius = new JLabel("stopnie Celsiusza");
		lCelsius.setBounds(20, 20, 150, 20);
		add(lCelsius);
		
		tCelsius = new JTextField("");
		tCelsius.setBounds(170, 20, 150, 20);
		tCelsius.addActionListener(this);
		tCelsius.setToolTipText("Podaj temeraturê w stopniach Celsiusza");
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
		
		chWielkie = new JCheckBox("Wielkie litery");
		chWielkie.setBounds(250, 120 ,150 , 20);
		add(chWielkie);
		chWielkie.addActionListener(this);
		
		bgRozmiar = new ButtonGroup();
		
		
		rbMaly = new JRadioButton("Ma³y", true);
		rbMaly.setBounds(50, 150, 100, 20);
		bgRozmiar.add(rbMaly);
		add(rbMaly);
		rbMaly.addActionListener(this);
		
		rbSredni = new JRadioButton("Œredni", false);
		rbSredni.setBounds(150, 150, 100, 20);
		bgRozmiar.add(rbSredni);
		add(rbSredni);
		rbSredni.addActionListener(this);
		
		rbDuzy = new JRadioButton("Du¿u", false);
		rbDuzy.setBounds(250, 150, 100, 20);
		bgRozmiar.add(rbDuzy);
		add(rbDuzy);
		rbDuzy.addActionListener(this);
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object zrodlo = e.getSource();
		
		if (zrodlo==bKonwertuj || zrodlo==tCelsius) {
		tempCelsius = Double.parseDouble(tCelsius.getText());
		tempFahrenheit = 32.0 + (9.0/5) *tempCelsius;
		tFahrenheit.setText(String.valueOf(tempFahrenheit));
		}else if(zrodlo==chWielkie) {
			if(chWielkie.isSelected()==true){
				tFahrenheit.setFont(new Font("SeansSerif", Font.BOLD, 18));
			}else {
				tFahrenheit.setFont(new Font("SeansSerif", Font.PLAIN, 12));
			}
			
		}else if (zrodlo==rbMaly) {
			tFahrenheit.setFont(new Font("SeansSerif", Font.PLAIN, 12));
		}else if (zrodlo==rbSredni) {
			tFahrenheit.setFont(new Font("SeansSerif", Font.PLAIN, 16));
		}else if (zrodlo==rbDuzy) {
			tFahrenheit.setFont(new Font("SeansSerif", Font.BOLD, 20));
		}
	
	
	
	}
	
	



	public static void main (String[] args) {
		CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}
	
}
