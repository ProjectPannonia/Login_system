package Test;

import UserObjects.User;
import org.junit.Before;
import org.junit.Test;

public class TestDataValidate {
    TestDataValidate testDataValidate = null;

    @Before
    public void init(){
        testDataValidate = new TestDataValidate();
    }
    @Test
    public boolean testCorrectUsername(User user){
        boolean expected = true;
        boolean result = testDataValidate.testCorrectUsername(new User("A","B",3,"Bak","asdf","asf","admin","admin"));

    }
}
