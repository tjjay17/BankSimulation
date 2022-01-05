/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg528project;

/**
 *
 * @author Tj
 */
public class Platinum extends Levels{
    
    @Override
    public void changelevel(Customer c){
        if (c.accbalance<10000){
            c.level = new Silver();
        }
        
        else if(c.accbalance>=10000 && c.accbalance<20000){
            c.level = new Gold();
        }
    }
    
    public double getfeeprice(){
     return 0;   
    }
    
        @Override
    public String toString(){
        //Effects: returns customer's level.
        return " Platinum, fee is " + 0 ;
    }
}
