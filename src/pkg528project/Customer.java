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
public class Customer {
    String usernamec;
    String passwordc;
    //accounts by default have 100 in them
    double accbalance = 100;
    Levels level;


public Customer(String userc, String passc, double balance){
        this.accbalance = balance;
        if(this.accbalance < 10000)
            level = new Silver();
        else if (this.accbalance >=10000 && this.accbalance < 20000)
            level = new Gold();
        else
            level = new Platinum();
        this.usernamec = userc;
        this.passwordc = passc;
    }


//if you just want to make a customer and retain 100 balance
public Customer(String userc, String passc){
        if(this.accbalance < 10000)
            level = new Silver();
        else if (this.accbalance >=10000 && this.accbalance < 20000)
            level = new Gold();
        else
            level = new Platinum();
        this.usernamec = userc;
        this.passwordc = passc;
    }

public double addbalance(double x){
   this.accbalance =  this.accbalance + x;
   return this.accbalance;
}

public double withdraw(double out){
    this.accbalance = this.accbalance - out;
    return this.accbalance;
}


public double onlinepurchase(double amount){
    this.accbalance = this.accbalance - amount;
    return this.accbalance;
}







}

