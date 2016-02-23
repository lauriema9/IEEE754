
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodClaorieGui;

/**
 *
 * @author Likun Ma
 */
public class Excercise {
    String exName;
    int duration; // duration in minutes
    int burnRate; // claorie burn rate
    int maxRec;  // maximum Recommended duration for excercise per day
    
    public int calcCalorieBurn(){
        return duration*burnRate;
    }
    
    public boolean exControl(){
        return duration<maxRec;
    }
    
    public void setBurnRate(int b){
        burnRate=b;
    }
    public Excercise (String nm){
        exName = nm;
        duration = 0; // default duration in minutes
        burnRate = 10 ; //default claorie burnrate per minute
        maxRec = 120;
    }
}