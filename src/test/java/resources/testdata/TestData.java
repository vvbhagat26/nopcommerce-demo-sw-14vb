package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name = "desktopProducts")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200", "2 GB"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]"}

        };
        return data;
    }

}
