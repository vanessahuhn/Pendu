package pendu;

import java.util.*;

/**
 * 
 */
public class Player {

    /**
     * Default constructor
     */
    public Player() {
    }
    
    private Scanner inputPlayerName;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private boolean guessType;

    /**
     * 
     */
    private int possiblePoints = 500;

    /**
     * 
     */
    private int score = 0;

    
    public String inputPlayerName() {
        // récupérer le nom d'un joueur
    	inputPlayerName = new Scanner(System.in);
    	System.out.println("Entrez le nom du joueur : ");
        name = inputPlayerName.nextLine(); 
        return name;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param value
     */
    public void setName(String name) {
        // TODO implement here
    	this.name = name;
    }

    /**
     * @return
     */
    public boolean isGuessType() {
        // TODO implement here
        return guessType;
    }

    /**
     * @param value
     */
    public void setGuessType(boolean guessType) {
        // TODO implement here
    	this.guessType = guessType;
    }
    
    public static void setPlayerType(int remainingTries, Player player1, Player player2) {
        // TODO implement here
    	if (remainingTries %2 == 0) {
    		player1.setGuessType(true);
    		player2.setGuessType(false);
    	}
    	else {
    		player1.setGuessType(false);
    		player2.setGuessType(true);
    	}
    		
    	}
    

    /**
     * @return
     */
    public int getPossiblePoints() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setPossiblePoints(int value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getScore() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setScore(int value) {
        // TODO implement here
    }

}