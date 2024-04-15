package com.mycompany.app;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LCS {
    public ArrayList<String> lines1;
    public ArrayList<String> lines2;
    public ArrayList<String> diff;
    
    public ArrayList <String> lcs;
    public String seq;
    public LCS(){
        
    }
    public LCS(String filePath1, String filePath2) {
        this.lines1 = readFile(filePath1);
        this.lines2 = readFile(filePath2);
        this.lcs = new ArrayList<String>();
         getLcs();
         this.diff = new ArrayList<String>();
         getDiff();
    }

    public ArrayList<String> readFile(String filePath) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder(); // Use StringBuilder for efficient string concatenation
            while ((line = reader.readLine()) != null) {
                
                stringBuilder.append(line+" ");
             // Append the current line to the StringBuilder
                if (line.contains(".")) {
                    lines.add(stringBuilder.toString()); // Add the accumulated string to the lines list
                    stringBuilder.setLength(0); // Clear the StringBuilder for the next line
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    

   public void getLcs() {
    int m = lines1.size();
    int n = lines2.size();

    // Create a 2D array to store the lengths of LCSs
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (lines1.get(i - 1).equals(lines2.get(j - 1))) {
                dp[i][j] = dp[i - 1][j - 1] + 1; // Increment LCS length if characters match
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Otherwise, take maximum from top or left
            }
        }
    }
    int length = dp[m][n];
    int index = length;
    String[] lcsArr = new String[length];

    // Start from the right-most bottom cell and fill the lcsArr
    int i = m, j = n;
    while (i > 0 && j > 0) {
        if (lines1.get(i - 1).equals(lines2.get(j - 1))) {
            lcsArr[--index] = lines1.get(i - 1);
            i--;
            j--;
        } else if (dp[i - 1][j] > dp[i][j - 1]) {
            i--;
        } else {
            j--;
        }
    }

    lcs = new ArrayList<>(Arrays.asList(lcsArr));
}

    public ArrayList<String> getSeq() {
        return lcs;
    }

    public void getDiff() {
        int i = 0, j = 0;
        while (i < lines1.size() || j < lines2.size()) {
            if (i < lines1.size() && j < lines2.size() && lines1.get(i).equals(lines2.get(j))) {
                // Lines are the same, move to the next lines in both files
                i++;
                j++;
            } else {
                // Lines are different, add them to the differences list
                if (i < lines1.size()) {
                    diff.add("- " + lines1.get(i));
                    i++;
                }
                if (j < lines2.size()) {
                    diff.add("+ " + lines2.get(j));
                    j++;
                }
            }
        }
    }

    public ArrayList<String> getDiffList() {
        return diff;
    }

}


