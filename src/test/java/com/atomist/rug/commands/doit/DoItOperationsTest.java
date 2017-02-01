package com.atomist.rug.commands.doit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DoItOperationsTest {

    @Test
    public void doItShouldReturnHello() {
        DoItCommands.DoItOperations ops = new DoItCommands.DoItOperations();
        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("hello, Rug command world");

        assertEquals(expectedResults, ops.doit());
    }
}
