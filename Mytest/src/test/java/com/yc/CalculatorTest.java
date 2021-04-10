package com.yc;

import com.yc.biz.Calculator;
import org.junit.*;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        cal = new Calculator();
    }
    @BeforeClass
    public void bc(){
        System.out.println("beforeclass");
    }
    @After
    public void tearDown() throws Exception {
    }
    @AfterClass
    public void ac(){
        System.out.println("afterclass");
    }
    @Test
    public void add() {
        System.out.println("add");
    }

    @Test
    public void sub() {
        System.out.println("sub");
    }
}