package com.github.automatedowl.examples;

import org.testng.annotations.Test;

public class MemoryOutputTest extends InventoryTestCase {

    @Test
    public void memoryOutputTest()  {
        logger.info("Max heap size: " + Runtime.getRuntime().maxMemory());
    }
}
