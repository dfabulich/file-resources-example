package com.redfin;

import java.io.File;
import java.io.FileInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public String readFile(String path) throws Exception {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        return new java.util.Scanner(fis).useDelimiter("\\A").next();
    }
}
