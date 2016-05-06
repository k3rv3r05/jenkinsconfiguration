/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jala.calculator.test;

import org.jala.calculator.Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author kevin_titichoca
 */
public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3,3);
        assertEquals(6, result);
    }
    
}
