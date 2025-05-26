/*
 Salah-Eldeen
 */
package com.leecottrell.simpleclasstest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class SimpleClassTest {
    
    private static SimpleClass test;
    public SimpleClassTest() {
    }
    
    public static void setupTest()
    {
        test = new SimpleClass();
    }
    
    public void testSddEm() 
    {
        //SimpleClass test =new SimpleClass();
        int expected
                =5;
        int actual;
        
        
        actual=test.addEm(4, 1);
        
        assertEquals(expected,actual,"Addem does not work ");
        
    }
    
}
