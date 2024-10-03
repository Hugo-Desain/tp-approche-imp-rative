package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        Random random = new Random();
        int nbRandom = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int essais = 0;
        int nb;

        do {
            System.out.print("Devinez le nombre entre 1 et 100 : ");
            nb = scanner.nextInt();
            essais++;

            if (nb < nbRandom) {
                System.out.println("C'est plus");
            } else if (nb > nbRandom) {
                System.out.println("C'est moins");
            }
        } while (nb != nbRandom);

        System.out.println("Bravo, vous avez trouvé en " + essais + " coups");

        scanner.close();
    }
}
