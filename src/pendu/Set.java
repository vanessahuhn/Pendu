package pendu;

import java.util.*;

/**
 * 
 */
public class Set {

    /**
     * Default constructor
     */
    public Set() {
    }

    /**
     * 
     */
    private int remainingTries = 10;
    
    /**
     * 
     */
    private String word;

    /**
     * 
     */
    private Scanner inputMysteryWord;

    /**
     * 
     */
    

    /**
     * 
     */
    public void setPossiblePoints() {
        // TODO implement here
    }

    /**
     * 
     */
    public void displaySetInfos() {
        // TODO implement here
    }

    /**
     * 
     */
    public void inputMysteryWord() {
        // TODO implement here
    	
    }

    /**
     * 
     */
    public void clearScreen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void displayEndSetInfos() {
        // TODO implement here
    }
    
    public void playSet() {
    	Player.setPlayerType(remainingTries, Match.getPlayer1(), Match.getPlayer2());
    }

    /**
     * @return
     */
    public int getRemainingTries() {
        // TODO implement here
        return remainingTries;
    }

    /**
     * @param value
     */
    public void setRemainingTries(int remainingTries) {
        // TODO implement here
    	this.remainingTries = remainingTries;
    }

    /**
     * @return
     */
    public String getWord() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setWord(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Scanner getInputMysteryWord() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setInputMysteryWord(Scanner value) {
        // TODO implement here
    }

}