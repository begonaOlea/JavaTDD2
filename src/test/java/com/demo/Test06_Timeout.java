package com.demo;

import org.junit.Test;

public class Test06_Timeout {

    @Test(timeout = 10)
    public void forEver() throws Exception {
        Thread.sleep(100000);
    }
}

