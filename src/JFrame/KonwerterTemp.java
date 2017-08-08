package JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class KonwerterTemp extends JFrame implements ActionListener{

	
//***********deklaracje pól******************************	

	private JLabel lCelsius, lFahrenheit;
	private JTextField tCelsius, tFahrenheit;
	private JButton bKonwertuj;
	private ButtonGroup bgRodzajKonwersji;
	private JRadioButton rbFtoC, rbCtoF;
	

//*******************************************************	
	
	
	public KonwerterTemp() {
		// TODO Auto-generated constructor stub
	
		setSize(400,400);
		setTitle("Konwerter jednostek tmparatury");
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
		tFahrenheit.addActionListener(this);
		tFahrenheit.setToolTipText("Podaj temeraturê w stopniach Fahreheita");
		add(tFahrenheit);
		
		bKonwertuj = new JButton("konwertuj");
		bKonwertuj.setBounds(100, 100, 150, 20);
		add(bKonwertuj);
		bKonwertuj.addActionListener(this);
		
		bgRodzajKonwersji = new ButtonGroup();
		
		rbCtoF = new JRadioButton("C to F", true);
		rbCtoF.setBounds(50, 150, 100, 20);
		bgRodzajKonwersji.add(rbCtoF);
		add(rbCtoF);
		
		rbFtoC = new JRadioButton("F to C", false);
		rbFtoC.setBounds(200, 150, 100, 20);
		bgRodzajKonwersji.add(rbFtoC);
		add(rbFtoC);
		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	Object zrodlo =e.getSource();
		if (zrodlo == bKonwertuj){
			if(rbCtoF.isSelected()){
				tFahrenheit.setText(CelsiusToFahrenheit(Double.parseDouble(tCelsius.getText())));
			}else {
				tCelsius.setText(FahrenheitToCelsius(Double.parseDouble(tFahrenheit.getText())));
			}
		}else if (zrodlo == tCelsius){
			rbCtoF.setSelected(true);
			tFahrenheit.setText(CelsiusToFahrenheit(Double.parseDouble(tCelsius.getText())));
		}else if (zrodlo == tFahrenheit) {
			rbFtoC.setSelected(true);
			tCelsius.setText(FahrenheitToCelsius(Double.parseDouble(tFahrenheit.getText())));
			
		}
		
	}
	
	public static String CelsiusToFahrenheit(Double x) {
		return String.valueOf(32.0+(9.0/5.0)*x);
	}
	public static String FahrenheitToCelsius(Double x) {
		return String.valueOf((x-32.0)*5.0/9.0);
	}
	
	public static void main (String[] args) {
		KonwerterTemp aplikacja = new KonwerterTemp();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}

}
