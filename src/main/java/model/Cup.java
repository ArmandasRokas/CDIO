package model;

/**@author Hold 44
 * @version 08/11-2018
 *
 * Defines the Cup class and its field and methods
 * Class to keep the dices that the player has to roll with to move
 */
public class Cup {
    private Die d1, d2; //Instances of dices

    /**
     * Constructor of Cup
     */
    public Cup(){
        this.d1 = new Die(1,6);
        this.d2 = new Die(1,6);
    }

    /**
     * Rolls the dices
     */
    public void roll(){
        d1.rollDie();
        d2.rollDie();
    }

    /**
     * Addd the eyes of the two dices
     *
     * @return  Sum of the two dices
     */
    public int getCurrentRollScore() {
        return d1.getEyes() + d2.getEyes();
    }
}
