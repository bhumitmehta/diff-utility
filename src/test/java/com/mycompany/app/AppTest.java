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
    public void testLCS1(){
        LCS obj = new LCS("/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/origcc.txt",
        "/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/newcc.txt" );
        assertEquals("[- Coding Challenges helps you become a better software engineer through that build real applications. \n" + //
                        ", + Helping you become a better software engineer through coding challenges that build real applications. \n" + //
                        ", - I’ve used or am using these coding challenges as exercises to learn a new programming language or technology. \n" + //
                        ", + These are challenges that I’ve used or am using as exercises to learn a new programming language or technology. \n" + //
                        "]", obj.diff.toString());
    }
    @Test
    public void testLCS2(){
        LCS obj = new LCS("/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/newcc.txt",
        "/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/origcc.txt" );
        assertEquals(" - Coding Challenges helps you become a better software engineer through that build real applications. \n" + //
                        "+ Helping you become a better software engineer through coding challenges that build real applications. \n" + //
                        "- I’ve used or am using these coding challenges as exercises to learn a new programming language or technology. \n" + //
                        "+ These are challenges that I’ve used or am using as exercises to learn a new programming language or technology.", obj.diff.toString());
    }
    
}

