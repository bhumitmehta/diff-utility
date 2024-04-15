package com.mycompany.app;
import com.mycompany.app.LCS;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLCS(){
        LCS obj = new LCS("/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/new.txt",
        "/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/original.txt" );
        assertEquals(" ", "");
    }
}

