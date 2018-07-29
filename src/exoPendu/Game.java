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
		//parcourir chaque index i des tableaux jusqu'à atteindre la longueur du tableau mot
		for (int i=0; i<mot.length; i++) 
		{
			//si l'élément à l'index i du tableau de booléens vu a pour valeur true
			if (vu[i] == true) 
			{//alors
				//on affiche l'élément à l'index i du tableau de caractères mot
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
		//parcourir chaque index i jusqu'à atteindre la longueur du tableau mot
		for (int i=0; i<mot.length; i++) 
		{
			//si le caractère c est identique au caractère à l'indice i du tableau mot
			if (c == mot[i])
			//alors
			{
				//l'élément à l'index i du tableau vu prend pour valeur true
				vu[i] = true;
			}
		}
		//le méthode retourne le tableau de booléens vu
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
		//création du tableau de booléens de la longueur du tableau mot
		boolean[] vu = new boolean[motVersTab(mot).length];
		
		//permet d'afficher le mot caché
		afficher(motVersTab(mot), vu);
		
		//tant que partieFinie ne renvoie pas true
		while (partieFinie(vu) == false) 
		{
			//l'utilisateur peut entrer une lettre
			Scanner inputLetter = new Scanner(System.in);
			System.out.println("\nEntrez une lettre : ");
			String userLetter = inputLetter.next();
			char c = userLetter.charAt(0);
			//le tableau de booléens est mis à jour
			metAJour(motVersTab(mot), vu, c);
			//on affiche le mot caché
			afficher(motVersTab(mot), vu);					
		}
		System.out.println("\nLa partie est finie.");
	}
}
