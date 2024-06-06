/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.bonarea.helloworldproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jordi
 */
public class CalculatorIT {
     
    /**
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int num1 = 2;
        int num2 = 2;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.sum(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of substract method, of class Calculator.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int num1 = 2;
        int num2 = 2;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.substract(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int num1 = 4;
        int num2 = 2;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.divide(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int num1 = 4;
        int num2 = 2;
        Calculator instance = new Calculator();
        int expResult = 8;
        int result = instance.multiply(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
