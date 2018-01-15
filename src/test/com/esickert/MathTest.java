package com.esickert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    Math classUnderTest;

    @Before
    public void setUp() throws Exception {

        classUnderTest = new Math();

    }

    @Test
    public void add() throws Exception {
        long result = 1+1;
        assertEquals(result, classUnderTest.add());
    }

}