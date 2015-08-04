package com.mycompany.test1;

public class Bank {
    
    private double credit;
    
    public Bank(double credit){
        this.credit=credit;
    }
    
    boolean add(double value){
       credit=credit+value;
       return true;
    }
    
    boolean sub(double value){
        if(credit-value>0){
            credit=credit-value;
            return true;
        }
        return false;
    }
    
}
