package com.knight.woowacourse3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    void MainTest() {

        Main main = new Main();

        Assertions.assertEquals(11, main.plus(10, 5));


    }
}
