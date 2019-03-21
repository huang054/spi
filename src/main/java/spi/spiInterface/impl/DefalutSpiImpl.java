package spi.spiInterface.impl;

import spi.spiInterface.TestSpi;

public class DefalutSpiImpl implements TestSpi {
    @Override
    public void say() {
        System.out.println("defaalut");
    }
}
