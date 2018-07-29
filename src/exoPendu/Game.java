package exoPendu;

import java.util.Scanner;

public class Game 
{
	
	char[] motVersTab(String s) 
	{
		char[] mot = s.toCharArray();
		return mot;
	}
		
	void afficher(char[] mot, boolean[] vu) 
	{
		//parcourir chaque index i des tableaux jusqu'� atteindre la longueur du tableau mot
		for (int i=0; i<mot.length; i++) 
		{
			//si l'�l�ment � l'index i du tableau de bool�ens vu a pour valeur true
			if (vu[i] == true) 
			{//alors
				//on affiche l'�l�ment � l'index i du tableau de caract�res mot
				System.out.print(mot[i] + " ");
			}
			//sinon
			else 
			{//alors
				//on affiche un point d'interrogation
				System.out.print("? ");
			}
		}
	}
	
	boolean[] metAJour(char[] mot, boolean[] vu, char c) 
	{
		//parcourir chaque index i jusqu'� atteindre la longueur du tableau mot
		for (int i=0; i<mot.length; i++) 
		{
			//si le caract�re c est identique au caract�re � l'indice i du tableau mot
			if (c == mot[i])
			//alors
			{
				//l'�l�ment � l'index i du tableau vu prend pour valeur true
				vu[i] = true;
			}
		}
		//le m�thode retourne le tableau de bool�ens vu
		return vu;
	}
	
	boolean partieFinie(boolean vu[]) 
	{
		int i;
		for (i = 0; i < vu.length; i++) {
			if (vu[i] == false) {
				return false;
			}
		}
		return true;
	}
	
	void partie(String mot) 
	{
		//cr�ation du tableau de bool�ens de la longueur du tableau mot
		boolean[] vu = new boolean[motVersTab(mot).length];
		
		//permet d'afficher le mot cach�
		afficher(motVersTab(mot), vu);
		
		//tant que partieFinie ne renvoie pas true
		while (partieFinie(vu) == false) 
		{
			//l'utilisateur peut entrer une lettre
			Scanner inputLetter = new Scanner(System.in);
			System.out.println("\nEntrez une lettre : ");
			String userLetter = inputLetter.next();
			char c = userLetter.charAt(0);
			//le tableau de bool�ens est mis � jour
			metAJour(motVersTab(mot), vu, c);
			//on affiche le mot cach�
			afficher(motVersTab(mot), vu);					
		}
		System.out.println("\nLa partie est finie.");
	}
}
