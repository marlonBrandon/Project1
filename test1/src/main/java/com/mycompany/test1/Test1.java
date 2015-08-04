package com.mycompany.test1;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
public class Test1 {
    
    @Test
    public void testAdd(){
      Bank banca = new Bank(10);
      double amount = banca.add(5);
      Assert.assertEquals(15,amount);
    }
    @Test
    public void testSub(){
        Bank banca = new Bank(10);
        double amount = banca.sub(5);
        Assert.assertEquals(5, amount);
    }
      
}
    

