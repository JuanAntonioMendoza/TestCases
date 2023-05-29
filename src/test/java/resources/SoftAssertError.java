package resources;

import org.testng.asserts.SoftAssert;

public class SoftAssertError {
    public static SoftAssert softAssert;

    public SoftAssertError() {
    }

    public static SoftAssert getSoftAssertError(){
        if(softAssert == null)
            softAssert = new SoftAssert();
        return softAssert;
    }
}
