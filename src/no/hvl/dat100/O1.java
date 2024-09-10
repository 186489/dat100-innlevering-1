package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		int inntekt = Integer.parseInt(showInputDialog("Bruttoinntekt: "));
		double skatt = 0;
		double trinn1 = (292850-208051)*0.017; //double er ikke presist nok til å brukes 
		double trinn2 = (670000-292851)*0.04; // når det regnes med for eksempel penger,
		double trinn3 = (937900-670001)*0.136; // men jeg bruker det i denne oppgaven
		double trinn4 = (1350000-937900)*0.166;  
												  
		if (inntekt <=208050) {
			showMessageDialog(null,"Du trenger ikke å betale trinnskatt.");
		}
		else if ((inntekt >= 208051)&&(inntekt<=292850)) {
			 skatt = (inntekt%208051) * 0.017;
		}
		
		else if ((inntekt >= 292851)&&(inntekt<=670000)) {
			 skatt = trinn1+(inntekt-292850)*0.04;	
		}
		
		else if ((inntekt >= 670001)&&(inntekt<=937900)) {
			 skatt =trinn1+trinn2+
					(inntekt-670000)*0.136;
		}
		
		else if ((inntekt >= 937901)&&(inntekt<=1350000)) {
			 skatt =trinn1+trinn2+trinn3+
					(inntekt%937900)*0.166;
		}
		
		else if (inntekt >= 1350001){
			skatt =trinn1+trinn2+trinn3+trinn4+
                   (inntekt-1350000)*0.176;
			System.out.println(skatt);
			
		}
		
		showMessageDialog(null, "Du må betale " + (int)(skatt+0.5) +" kr i skatt.");

	}

}
