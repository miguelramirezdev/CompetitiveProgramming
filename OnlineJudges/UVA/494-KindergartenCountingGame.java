package com.company;


    import java.util.Scanner;


    public class Main {

        public static void main(String[] args) {
            String word;
            Scanner cin = new Scanner(System.in);
            while (cin.hasNext()) {
                word = cin.nextLine();
                System.out.println(word.replaceAll("[^a-zA-Z]+", " ")
                        .trim().split(" ").length);
            }
        }
    }
