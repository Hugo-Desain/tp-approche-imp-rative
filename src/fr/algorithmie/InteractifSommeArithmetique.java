package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : \n");
        int nb = scanner.nextInt();

        int somme = 0;

        for (int i = 1 ; i <= nb ; i++) {
            somme += i;
        }

        System.out.println(somme);

        scanner.close();
    }
}
