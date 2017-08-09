package JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuTest extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu menuPlik, menuNarzedzia, menuPomoc, menuOpcje;
	JMenuItem mOtworz, mZapisz, mWyjsce, mNarz1, mNarz2, mOProgramie, mOpcja1, mOpcja2;
	
	public JMenuTest() {
		// TODO Auto-generated constructor stub
		setTitle("Demo JMenu");
		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		menuBar = new JMenuBar();
		menuPlik = new JMenu("Plik");
		menuNarzedzia = new JMenu("Narzêdzia");
		menuPomoc = new JMenu("Pomoc");
		
		setJMenuBar(menuBar);
		menuBar.add(menuPlik);
			mOtworz = new JMenuItem("Otwórz");
			mZapisz = new JMenuItem("Zapisz");
			mWyjsce = new JMenuItem("Wyjœcie");
			
			menuPlik.add(mOtworz);
			menuPlik.add(mZapisz);
			menuPlik.addSeparator();
			menuPlik.add(mWyjsce);
		
		menuBar.add(menuNarzedzia);
			
			mNarz1 = new JMenuItem("Narz1");
			mNarz2 = new JMenuItem("Narz2");
			
			menuNarzedzia.add(mNarz1);
			menuNarzedzia.add(mNarz2);
				menuOpcje = new JMenu("Opcje");
				mOpcja1 = new JMenuItem("Opcja1");
				mOpcja2 = new JMenuItem("Opcja2");
				
				menuOpcje.add(mOpcja1);
				menuOpcje.add(mOpcja2);
				
				menuNarzedzia.add(menuOpcje);
				

		menuBar.add(menuPomoc);
			
			mOProgramie = new JMenuItem("O Programie");
				menuPomoc.add(mOProgramie);
					
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args){
		JMenuTest appMenu = new JMenuTest();
		appMenu.setVisible(true);
	}

}
