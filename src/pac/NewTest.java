package pac;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void f() {
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(false, false);
	  sa.assertEquals("B", "B","Actual value should be B");
	  sa.assertTrue(true,"Returning the output as false");
	  sa.assertFalse(false,"message");
	  sa.fail("message");
	  sa.assertAll();
	  System.out.println("Assert completed");
  }
}






