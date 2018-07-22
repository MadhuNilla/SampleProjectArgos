
import com.argos.drivers.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

    public class Hooks extends DriverFactory{
        DriverFactory driverFactory=new DriverFactory();
        @Before
        public void setUp() throws IOException
        {
            driverFactory.openBrowser();
        }

        @After
        public void tearDown()
        {
            driverFactory.closeBrowser();
        }
    }


