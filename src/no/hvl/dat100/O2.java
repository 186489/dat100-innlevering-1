package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {

			int pSum = Integer.parseInt(showInputDialog(i + ". Poengsum: "));	

			if ((pSum <= 100)&&(90 <= pSum)){
				showMessageDialog(null, "Resultat: A");}
			else if ((pSum <= 89)&&(80 <= pSum)){
				showMessageDialog(null, "Resultat: B");
			}

			else if ((pSum <= 79)&&(60 <= pSum)){
				showMessageDialog(null, "Resultat: C");
			}

			else if ((pSum <= 59)&&(50 <= pSum)) {
				showMessageDialog(null, "Resultat: D");
			}

			else if ((pSum <= 49)&& (pSum >= 40)) {
				showMessageDialog(null, "Resultat: E");
			}

			else if ((pSum <= 39)&&(pSum >= 0)) {
				showMessageDialog(null, "Resultat: F");
			}

			else {
				showMessageDialog(null, "Ugyldig poengsum. Prøv igjen.");
				i--;
			}

			System.out.println(i);
		}

	}

}

