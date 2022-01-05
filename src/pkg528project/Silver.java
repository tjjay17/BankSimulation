/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tj
 */
package pkg528project;

public class Silver extends Levels {
    
    
   @Override
    public void changelevel(Customer customer){
        if (customer.accbalance >= 10000 && customer.accbalance<20000){
            customer.level = new Gold();
        }
        
        else if (customer.accbalance>=20000){
            customer.level = new Platinum();
        }
    }
    
    @Override
    public double getfeeprice(){
        return 20.00;
    }
    
    @Override
    public String toString(){
        //Effects: returns customer's level.
        return " Silver, fee is " + 20;
    }
}