package org.technodrome.jupiter;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Tony McNevin on 6/5/17.
 */

class ModelUTest {

    private Model model;

    @BeforeEach
    public void before() {
        model = new Model();
    }

    @Test
    public void testConstruction() {

        assertNotNull(model);

    }

    @Test
    public void testThrows() {
        assertThrows(NullPointerException.class, () -> model.getNullPointer());
    }


    @TestFactory
    public Stream<DynamicTest> testStream() {
        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(2,4,6,8));
        return intList.stream().map(val -> DynamicTest.dynamicTest("is " + val + " Even?", () -> assertTrue(val % 2 == 0)));
    }

}