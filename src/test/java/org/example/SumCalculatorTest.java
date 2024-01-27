package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator = new SumCalculator();

    @BeforeEach
    void start(){
        SumCalculator sumCalculator = new SumCalculator();
    }

    @Test
        void sumNIs1Test(){

        int actualSum = sumCalculator.sum(1);
        int expectedSum = 1;

        assertEquals(expectedSum, actualSum);

    }

    @Test
    void sumNIs3Test(){
        int actualSum = sumCalculator.sum(3);
        int expectedSum = 6;

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void sumIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,  ()-> sumCalculator.sum(0));
    }

}