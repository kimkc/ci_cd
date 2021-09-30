package com.example.devops_demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {

    @Test
    public void testAdd(){
        Calc calc = new Calc();
        long result = calc.add(10, 20);

        assertThat(result).isEqualTo(30);
    }
}
