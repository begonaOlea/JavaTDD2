
package com.demo;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test02_Aserciones {
    
    @Test
  public void assertTrueAndFalseTest() throws Exception {
    Assert.assertTrue(true);
    Assert.assertFalse(false);
  }
  
  @Test
  public void assertNullAndNotNullTest() throws Exception {
    Object myObject = null;
    Assert.assertNull(myObject);
    
    myObject = new String("Some value");
    Assert.assertNotNull(myObject);
  }
  
  @Test
  public void assertEqualsTest() throws Exception {
    Integer i = new Integer("5");
    Integer j = new Integer("5");;
    Assert.assertEquals(i,j);
  }
  
  @Test
  public void assertNotSameTest() throws Exception {
    Integer i = new Integer("5");
    Integer j = new Integer("5");;
    Assert.assertNotSame(i , j);
  }
  
  @Test
  public void assertSameTest() throws Exception {
    Integer i = new Integer("5");
    Integer j = i;
    Assert.assertSame(i,j);
  }
}
