package com.github.automatedowl.examples;

import java.util.logging.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InventoryTestCase {

    protected Logger logger = Logger.getGlobal();

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// TestNG Methods //////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////

    @BeforeMethod
    void setTestConfiguration() {
        logger.info("Setting up MemoryOutputTest..");
    }

    @AfterMethod
    void tearDown() {
        logger.info("Tearing down MemoryOutputTest..");
    }
}
