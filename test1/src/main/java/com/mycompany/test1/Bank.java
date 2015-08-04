package com.mycompany.test1;

public class Bank {
    
    private double credit;
    
    public Bank(double credit){
        this.credit=credit;
    }
    
    public double add(double value){
       credit=credit+value;
       return credit;
    }
    
    public double sub(double value){
        if(credit-value>0){
            credit=credit-value;
            return credit;
        }
        return -1;
    }
    
}
