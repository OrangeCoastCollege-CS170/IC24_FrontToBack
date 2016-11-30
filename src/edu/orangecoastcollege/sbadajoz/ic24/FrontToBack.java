package edu.orangecoastcollege.sbadajoz.ic24;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/*
Badajoz, Seve
CS A170
November 30, 2016

IC24
*/
public class FrontToBack {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Input.txt"));
            PrintStream output = new PrintStream("Output.txt");
            while(input.hasNext()) {
                String line = input.nextLine();
                String[] words = line.split(" ");
                for(int i = words.length - 1; i >= 0; i--) {
                    output.print(words[i] + " ");
                }
                output.println();
            }
        } catch(IOException e) {
            System.out.println("File not found.");
        }
    }
}
