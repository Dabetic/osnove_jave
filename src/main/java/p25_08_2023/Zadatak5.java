package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        zvezdice(5);
        zvezdice(9);

    }

    public static void zvezdice(int z) {

        for (int i = 0; i < z; i++) {
            System.out.print("*");
        }

        System.out.println(" ");

    }

}
