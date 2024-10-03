package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez 10 nombres : \n");
        int nb = scanner.nextInt();

        for (int i = 1 ; i <= 10 ; i++) {
            int next = nb + i;
            System.out.println(next);
        }

        scanner.close();

    }
}
