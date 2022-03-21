package com.geek.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 3;
    private static final char DOT_X = 'X';
    private static final char DOT_O = '0';
    private static final char DOT_EMPTY = '*';
    private static final char[][] MAP = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initMap();
        printMap();
        humanTurn();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static boolean isWin(char symbol) {
        return true;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void humanTurn() {
        int x, y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter coordinate in format X Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if (x < 0 || x > SIZE || y < 0 || y > SIZE) {
                System.out.println(">> Incorrect coordinate");
            } else if (MAP[x][y] != DOT_EMPTY) {
                System.out.println(">> Сell is occupied");
            } else {
                break;
            }

        } while (true);

        MAP[x][y] = DOT_X;
    }

    private static void computerTurn() {
        int x, y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (MAP[x][y] != DOT_EMPTY);

        MAP[x][y] = DOT_O;
    }

    private static void printMapHeader() {
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
