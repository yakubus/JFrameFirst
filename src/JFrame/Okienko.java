package JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


// utworzenie okna
public class Okienko extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton bPodajDate, bWyjsce;
	JLabel lWyswietlDate;
	

	public Okienko(){
		setSize(400,200);
		setTitle("Moje okienko");
		setLayout(null);
		
		bPodajDate = new JButton("Podaj datê");
		bPodajDate.setBounds(50, 50, 100, 20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);
		
		bWyjsce = new JButton("wyjœcie");
		bWyjsce.setBounds(150, 50, 100, 20);
		add(bWyjsce);
		bWyjsce.addActionListener(this);
		
		lWyswietlDate = new JLabel("Data:");
		lWyswietlDate.setBounds(50, 100, 250, 20);
		
		//*****************************************************
		//wybór koloru z gotowych obiektów
		//lWyswietlDate.setForeground(Color.CYAN);
		//tworzenie nowego obiektu typu Color z kolorów sk³adowych rgb
		//lWyswietlDate.setForeground(new Color(r, g, b));
		//*****************************************************
		
		lWyswietlDate.setForeground(new Color(50, 75, 190));
		lWyswietlDate.setFont(new Font("SansSerif", Font.PLAIN, 16));
		add(lWyswietlDate);
		
	}
	public static void main(String[] args){
		Okienko okienko = new Okienko();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();
		if(zrodlo==bPodajDate){
			//System.out.println(new Date());		
			lWyswietlDate.setText(new Date().toString());
		}else if (zrodlo==bWyjsce) {
			dispose();
			
		}		
	}
}
