package fr.algorithmie;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le premier nombre : ");
        int max = scanner.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.println("Veuillez entrer le nombre " + i + " : ");
            int nb = scanner.nextInt();

            if (nb > max) {
                max = nb;
            }
        }
        System.out.println("Le plus grand nombre est : " + max);

        scanner.close();
    }
}
