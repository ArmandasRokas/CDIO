package model.AllSquares;

import model.Player;

public abstract class Square {

    protected String scenario;

    public Square(String scenario){
        this.scenario = scenario;
}

    public String getScenario(){
        return this.scenario;
    }

    public abstract void landedOn(Player p);
}