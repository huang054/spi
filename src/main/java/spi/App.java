package spi;

import spi.loader.HuangExtensionLoader;
import spi.spiInterface.TestSpi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        TestSpi defaultExtension = HuangExtensionLoader.
                getExtensionLoader(TestSpi.class).
                getDefaultExtension();
        defaultExtension.say();
        //指定特定的实现类,例如配置的tobyLog
        TestSpi tobyLog = HuangExtensionLoader.
                getExtensionLoader(TestSpi.class).
                getExtension("testspi");
        tobyLog.say();

    }
}
