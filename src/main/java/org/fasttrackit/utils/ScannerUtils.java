package org.fasttrackit.utils;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String nextLine() {
        return scanner.nextLine();
    }

//citim primul numar de pe rand si apoi trece pe randul urmator
    public static int nextSingleInt() {
        try{
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }


    }

    public static double nextSingleDuble(){
        try {
            return scanner.nextDouble();
        }finally {
            scanner.nextLine();
        }
    }
}