package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean open = true;
        String s ;

        while ((s = in.readLine())!=null){
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='"'){
                    if(open){
                        System.out.print("``");
                        open = false;
                    }else{
                        System.out.print("''");
                        open = true;
                    }
                }else{
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
