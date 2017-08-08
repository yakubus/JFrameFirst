package JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RownanieGUI extends JFrame implements ActionListener{

	private JTextField tA, tB, tC, tWynik;
	private JLabel lA, lB, lC;
	private JButton bWyjscie, bRozwaz;
	
	public RownanieGUI() {
		// TODO Auto-generated constructor stub
		setSize(600,400);
		setTitle("Rozwi¹zywanie nrównania kwadratowego");
		setLayout(null);
		
		lA = new JLabel("a",JLabel.RIGHT);
		lA.setBounds(0, 50, 30, 20);
		tA=new JTextField();
		tA.setBounds(50, 50, 50, 20);
		
		lB = new JLabel("b",JLabel.RIGHT);
		lB.setBounds(100, 50, 30, 20);
		tB=new JTextField();
		tB.setBounds(150, 50, 50, 20);
		
		lC = new JLabel("c",JLabel.RIGHT);
		lC.setBounds(200, 50, 30, 20);
		tC=new JTextField();
		tC.setBounds(250, 50, 50, 20);
		
		bRozwaz = new JButton("Rozwi¹¿ równanie");
		bRozwaz.setBounds(50,150,150,20);
		bRozwaz.addActionListener(this);
		
		bWyjscie= new JButton("Wyjœcie");
		bWyjscie.setBounds(250,150,100,20);
		bWyjscie.addActionListener(this);
		
		tWynik=new JTextField();
		tWynik.setBounds(50,200,400,20);
		
		add(tA);
		add(lA);
		add(lB);
		add(tB);
		add(lC);
		add(tC);
		add(bRozwaz);
		add(bWyjscie);
		add(tWynik);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object zrodlo = e.getSource();
		if(zrodlo == bWyjscie){
			dispose();
		}else if(zrodlo==bRozwaz) {
			int a = Integer.parseInt(tA.getText());
			int b = Integer.parseInt(tB.getText());
			int c = Integer.parseInt(tC.getText());
			RownanieKwadratowe rownanie = new RownanieKwadratowe(a, b, c);
			String rozwiazanie = rownanie.rozwiaz();
			tWynik.setText(rozwiazanie);
		}
	}
	public static void main (String[] args){
		RownanieGUI app = new RownanieGUI();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		
	}


}
