package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] seaBattle = new char[10][10];
        int shipNumber = 4;

        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                seaBattle[i][j] = '0';
            }
        }

        while (shipNumber>0) {
            System.out.print("Enter ship coordinates: x and y\n");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int i = 0; i < 10; i++) {
                if (i == x) {
                    for (int j = 0; j < 10; j++) {
                        if (j == y) {
                            seaBattle[i][j] = '*';
                        }
                    }
                }
            }
            shipNumber--;
        }

        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(seaBattle[i][j]);
            }
            System.out.print("\n");
        }
    }
}
