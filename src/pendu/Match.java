package pendu;

import java.util.*;

/**
 * 
 */
public class Match {

    /**
     * Default constructor
     */
    public Match() {
    }
    
    private static Player player1 = new Player();

    private static Player player2 = new Player();

    public static Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		Match.player1 = player1;
	}

	public static Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		Match.player2 = player2;
	}

	private Scanner inputNbSets;

    /**
     * 
     */
    private int nbSets;

    /**
     * 
     */
    private boolean newMatch;

    /**
     * 
     */
    public int inputNbSets() {
        // choisir le nombre de manches
    	inputNbSets = new Scanner(System.in);
    	System.out.println("Combien de manches va durer cette partie ?");
    	nbSets = inputNbSets.nextInt();
    	while (nbSets%2 != 0) {
    		System.out.println("Par souci d'egalite, veuillez entrer un nombre pair : ");
    		nbSets = inputNbSets.nextInt();
    	}
    		
    	return nbSets;    	
    }

    /**
     * 
     */
    
    public Set[] createSetInstances() {
    	//je créé un tableau d'objets pour stocker le nombre d'objets nécessaires en fonction
		//du nombre entré par l'utilisateur
		Set[] setTab = new Set[nbSets];
		
		//je créé chaque objet
		for (int i=0; i < setTab.length; i++)
		     setTab[i] = new Set();
		return setTab;
    }

    /**
     * 
     */
    public void displayMatchStartInfos() {
        // TODO implement here
    	System.out.println("La partie peut commencer. Les joueurs sont " + player1.getName() + " et " + player2.getName() + ". La partie va durer " + nbSets + " manches.");
    }

    /**
     * 
     */
    public void displayMatchEndInfos() {
        // TODO implement here
    }

    /**
     * 
     */
    public void startNewMatch() {
        // TODO implement here
    }

    /**
     * @return
     */
    
    public void playMatch() {
    	
    }
    public Scanner getInputPlayerName() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setInputPlayerName(Scanner value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Scanner getInputNbSets() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setInputNbSets(Scanner value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getNbSets() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setNbSets(int value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean isNewMatch() {
        // TODO implement here
        return false;
    }

    /**
     * @param value
     */
    public void setNewMatch(boolean value) {
        // TODO implement here
    }

}