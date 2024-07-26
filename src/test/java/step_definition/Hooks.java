package step_definition;

import org.junit.Before;

public class Hooks {

    @Before
    public void initBrowser(){
        try {
            return;
        } catch (Exception | AssertionError e) {
            System.out.println("Error: " + e);
        }
    }
}
