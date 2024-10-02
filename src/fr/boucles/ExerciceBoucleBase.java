package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        //• Affichez tous les nombres de 1 à 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //• Affichez 20 fois votre nom et votre prénom
        String name = "Desain Hugo";
        for (int j = 1; j <=20 ; j++) {
            System.out.println(name);
        }

        //• Affichez les éléments pairs de 2 à 100
        int k = 2;
        while (k <= 100) {
            System.out.println(k);
            k += 2;
        }

        //• Affichez les éléments impairs de 1 à 99
        for (int l = 1; l <=99 ; l+=2) {
            System.out.println(l);
        }
    }
}
