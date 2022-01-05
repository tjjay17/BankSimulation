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
public class Gold extends Levels{
    /**Overview: This class represents the level of a customer if their balance is greater than/equal to 10000 but less than 20000.
     * This is a immutable class.
     */
    /**Abstraction Function:
     * Shows level of the customer
     * The AF is: AF(c) = Gold
     */
    /**RepInvariant:
     * Always true
     */
    
    @Override
    public double getfeeprice(){
        //Effects: returns fee for gold level customer to do online purchase.
        return 10.00;
    }
    
    @Override
    public void changelevel(Customer person){
        //Requires: person of customer type
        //Modifies: person.level
        //Effects: changes level of customer which effects online purchase fee
        if(person.accbalance <10000){
            person.level = new Silver();
        }
        
        else if(person.accbalance>=20000){
            person.level = new Platinum();
        }
    }
    
     @Override
    public String toString(){
        //Effects: returns customer's level.
        return " Gold, fee is " + 10.00;
    }
    public boolean repOK(){
        //Effects: returns true.
        return true;
    }
}
    

