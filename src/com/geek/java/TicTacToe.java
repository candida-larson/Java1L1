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
        do {
            printMap();
            humanTurn();

            if (isWin(DOT_X, SIZE)) {
                System.out.println("Human win!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }

            computerTurn();

            if (isWin(DOT_O, SIZE)) {
                System.out.println("Computer win!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }
        } while (true);
        printMap();
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

    private static boolean isWin(char symbol, int lineLength) {
        if (isWinByVerticalLines(symbol, lineLength)) return true;
        if (isWinByHorizontalLines(symbol, lineLength)) return true;
        if (isWinByLeftDiagonalLine(symbol, lineLength)) return true;
        return isWinByRightDiagonalLine(symbol, lineLength);
    }

    private static boolean isWinByRightDiagonalLine(char symbol, int lineLength) {
        int solidLineLength;

        // checking right diagonal line
        solidLineLength = 0;
        for (int x = 0, y; x < SIZE; x++) {
            y = SIZE - x - 1;
            if (MAP[x][y] == symbol) {
                solidLineLength++;
                if (solidLineLength >= lineLength) {
                    return true;
                }
            } else {
                solidLineLength = 0;
            }
        }
        return false;
    }

    private static boolean isWinByLeftDiagonalLine(char symbol, int lineLength) {
        int solidLineLength;

        // checking left diagonal line
        solidLineLength = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][i] == symbol) {
                solidLineLength++;
                if (solidLineLength >= lineLength) {
                    return true;
                }
            } else {
                solidLineLength = 0;
            }
        }
        return false;
    }

    private static boolean isWinByHorizontalLines(char symbol, int lineLength) {
        int solidLineLength;

        // checking horizontal lines
        for (int x = 0; x < SIZE; x++) {
            solidLineLength = 0;
            for (int y = 0; y < SIZE; y++) {
                if (MAP[x][y] == symbol) {
                    solidLineLength++;
                    if (solidLineLength >= lineLength) {
                        return true;
                    }
                } else {
                    solidLineLength = 0;
                }
            }
        }
        return false;
    }

    private static boolean isWinByVerticalLines(char symbol, int lineLength) {
        int solidLineLength;

        // checking vertical lines
        for (int y = 0; y < SIZE; y++) {
            solidLineLength = 0;
            for (int x = 0; x < SIZE; x++) {
                if (MAP[x][y] == symbol) {
                    solidLineLength++;
                    if (solidLineLength >= lineLength) {
                        return true;
                    }
                } else {
                    solidLineLength = 0;
                }
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void humanTurn() {
        int x, y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter coordinate in format X Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
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

        // the computer can make one move and win
        if (isWasComputerMoveToWin(true)) {
            return;
        }

        // block a person's winning move
        if (isWasBlockingHumanMoveByComputer()) {
            return;
        }

        // make such a move to draw a straight line to win
        if (isWasComputerMoveToWin(false)) {
            return;
        }

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (MAP[x][y] != DOT_EMPTY);

        MAP[x][y] = DOT_O;
    }

    private static boolean isWasComputerMoveToWin(boolean onlyFullLineLengthCheck) {
        boolean wasMoveToWin = false;
        for (int lineLen = SIZE; lineLen >= 2; lineLen--) {
            if (wasMoveToWin) {
                break;
            }
            for (int i = 0; i < SIZE; i++) {
                if (wasMoveToWin) {
                    break;
                }
                for (int j = 0; j < SIZE; j++) {
                    if (MAP[i][j] == DOT_EMPTY) {
                        MAP[i][j] = DOT_O;
                        if (isWin(DOT_O, lineLen)) {
                            wasMoveToWin = true;
                            break;
                        } else {
                            MAP[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
            if (onlyFullLineLengthCheck) {
                break;
            }
        }

        if (wasMoveToWin) {
            return true;
        }
        return false;
    }

    private static boolean isWasBlockingHumanMoveByComputer() {
        boolean wasBlockingMove = false;
        for (int i = 0; i < SIZE; i++) {
            if (wasBlockingMove) {
                break;
            }
            for (int j = 0; j < SIZE; j++) {
                // an empty field where
                // a person could put a chip
                // in order to win
                if (MAP[i][j] == DOT_EMPTY) {
                    MAP[i][j] = DOT_X;
                    if (isWin(DOT_X, SIZE)) {
                        MAP[i][j] = DOT_O;
                        wasBlockingMove = true;
                        break;
                    } else {
                        MAP[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        return wasBlockingMove;
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
