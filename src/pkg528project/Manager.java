/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg528project;

import java.util.ArrayList;

/**
 *
 * @author Tj
 */
public class Manager {
    String user = "admin";
    String pass = "admin";
    ArrayList Customers = new ArrayList<Customer>();
    


public void AddCustomer(Customer c){
Customers.add(c);

}

public void RemoveCustomer(Customer c){
    Customers.remove(c);
}
}