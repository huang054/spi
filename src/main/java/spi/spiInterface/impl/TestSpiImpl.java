package spi.spiInterface.impl;

import spi.spiInterface.TestSpi;

public class TestSpiImpl implements TestSpi {
    @Override
    public void say() {
        System.out.println("test spi");
    }
}
