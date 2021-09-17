
package com.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Test01_basic.class, 
                      Test02_Aserciones.class,
                      Test03_Ignore.class })

public class Test04_Suit {
}