package com.redfin;

import java.io.File;
import java.io.FileInputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest
    extends TestCase
{

    public void testApp() throws Exception
    {
        String path = AppTest.class.getResource("hello.txt").getFile();
        System.out.println(path);
        App app = new App();
        assertEquals("hello", app.readFile(path));
    }
}
