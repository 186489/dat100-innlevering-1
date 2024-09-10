package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Skriv et tall: "));
		int produkt=n;

		for (int i = (n-1); i>0; i--) {
			produkt = produkt*i;
		}
		
		showMessageDialog(null,"Fakultetet er: " + produkt);

	}

}
