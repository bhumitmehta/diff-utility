package com.mycompany.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.mycompany.app.*;
public class App {
    public static void main(String[] args) {
        String filePath2 = "/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/origcc.txt";
        String filePath1 = "/Users/bhumitmehta/projects/alag/my-app/src/test/java/com/mycompany/app/challenge-diff/newcc.txt";

        LCS lcs = new LCS(filePath1, filePath2);

        // Print the longest common subsequence
        System.out.println("Longest Common Subsequence:");
        for (String line : lcs.getSeq()) {
            System.out.println(line);
        }

        // Print the differences between the files
        System.out.println("\nDifferences:");
        for (String diff : lcs.getDiffList()) {
            System.out.println(diff);
        }
    }
}
