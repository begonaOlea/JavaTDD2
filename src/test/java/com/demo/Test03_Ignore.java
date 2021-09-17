package com.demo;

import org.junit.Test;
import org.junit.Ignore;

public class Test03_Ignore {

    @Test
    public void test1() {
        System.out.println("\t\t test1 is invoked");
    }

    @Test
    @Ignore("John's holiday stuff failing")
    public void when_today_is_holiday_then_stop_alarm() {
    }
}
